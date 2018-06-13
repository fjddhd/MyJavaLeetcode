/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int count=1;
        ListNode pre=null,next=null,mae=null,cur=head,last=null;
        if(m==n)
            return head;
        while (head!=null){
            if (count==m-1)
                mae=head;
            if (count==m)
                last=head;
            if (count>=m) {
                next = head.next;
                head.next=pre;
                pre=head;
                head=next;
            }
            else
                head=head.next;
            if (count==n) {
                last.next=next;
                if (m!=1)
                 mae.next = pre;
                break;
            }
            count++;
        }
        if (m==1)
            return pre;
        return cur;
    }
}
