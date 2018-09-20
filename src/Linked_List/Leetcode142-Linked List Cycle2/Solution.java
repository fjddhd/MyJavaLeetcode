import java.util.HashMap;

public class Solution {//要使用额外空间
    ListNode ln;
    public ListNode detectCycle(ListNode head) {
        ln=head;
        ListNode slow=head,fast=head;
        while(slow!=null){
            slow=slow.next;
            if(fast.next==null || fast.next.next==null)
                fast=head;
            else
                fast=fast.next.next;
            if(fast==slow){//有环
                return findfist(ln);
            }

        }
        return null;//表示无环
    }
    public ListNode findfist(ListNode ll){//节点的val没有重复
        HashMap<ListNode,Integer> hm=new HashMap<>();
        ListNode cur=ll;
        while(true){
            if (hm.containsKey(cur))
                return cur;
            hm.put(cur,1);
            cur=cur.next;
        }

    }
}
