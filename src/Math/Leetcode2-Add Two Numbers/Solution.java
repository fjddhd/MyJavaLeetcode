import java.util.ArrayList;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> temp=new ArrayList<>();
        int mark=0;
        while(l1!=null || l2!=null){
            int plus=0;
            if (l1!=null && l2!=null){
                plus=l1.val+l2.val;
            }
            else if (l1!=null && l2==null){
                plus=l1.val;
            }
            else if (l1==null && l2!=null){
                plus=l2.val;
            }
            if (mark==1){
                plus++;
                mark=0;
            }
            if (plus<10){
                temp.add(plus);
            }
            else{
                temp.add(plus%10);
                mark=1;
            }
            if (l1!=null)
                l1=l1.next;
            if (l2!=null)
                l2=l2.next;
        }
        if (l1==null && l2==null &&mark==1){
            temp.add(1);
        }

        ListNode node=new ListNode(temp.get(0));
        ListNode cur=node;
        for (int i=1;i<temp.size();++i){
            cur.next=new ListNode(temp.get(i));
            cur=cur.next;
        }
        return node;
    }
}
