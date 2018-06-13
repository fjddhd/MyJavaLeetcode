/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur=head;
        if(head==null){
            return head;
        }
        while(head.val==val){
            head=head.next;
            if(head==null)
                return head;
        }
        while(cur.next!=null){
            if(cur.next.val==val && cur.next.next!=null){
                cur.next=cur.next.next;
            }
            else if(cur.next.val==val && cur.next.next==null){
                cur.next=null;
                break;
            }
            if(cur.next.val!=val)
                cur=cur.next;
        }
        if(cur.next==null && cur.val==val){
            head=null;
            return head;
        }
        return head;
    }
}
