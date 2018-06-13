/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ln=head;
        if(head==null)
            return head;
        while(ln.next!=null){
            if(ln.next.val==ln.val){
                ln.next=ln.next.next;
            }
            if(ln.next!=null && ln.next.val!=ln.val){
                ln=ln.next;
            }
        }
        return head;
    }
}