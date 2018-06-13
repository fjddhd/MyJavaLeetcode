public class Solution141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (slow != null) {
            slow = slow.next;
            if (fast.next == null || fast.next.next == null)
                fast = head;
            else
                fast = fast.next.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}
