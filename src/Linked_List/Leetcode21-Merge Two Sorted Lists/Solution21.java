/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode beg,now=null;
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        if(l2.val>=l1.val){
            beg=new ListNode(l1.val);
            if(l1.next!=null){
                beg.next=new ListNode(0);
                now=beg.next;
            }
            else{
                now=beg;
            }
            l1=l1.next;
        }
        else{
            beg=new ListNode(l2.val);
            if(l2.next!=null){
                beg.next=new ListNode(0);
                now=beg.next;
            }
            else{
                now =beg;
            }
            l2=l2.next;
        }
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){//注意java特性：如果用new ListNode则，对原引用不应用了，相当于新开出一个分支,now是对新创beg链的最新节点的引用
                now.val=l1.val;
                l1=l1.next;
                if(l1!=null){
                    now.next=new ListNode(0);
                    now=now.next;
                }
            }
            else{
                now.val=l2.val;
                l2=l2.next;
                if(l2!=null){
                    now.next=new ListNode(0);
                    now=now.next;
                }
            }
        }
        if(l1==null){
            now.next=l2;
        }
        else{
            now.next=l1;
        }
        return beg;
    }
}
