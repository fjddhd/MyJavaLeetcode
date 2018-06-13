/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        if(head==null || head.next==null)
            return true;
        if(head.next.next==null){
            if(head.val==head.next.val)
                return true;
            else 
                return false;                
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){//原链表元素数为奇数
            fast=reverse(slow.next);
        }
        else{//偶数
            fast=reverse(slow);
        }
        while(fast!=null){
            if(fast.val!=head.val)
                return false;
            fast=fast.next;
            head=head.next;
        }
        return true;
        
    }
    
    private ListNode reverse(ListNode head){
        ListNode next=null,pre=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}