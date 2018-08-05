public class Solution876 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode middleNode(ListNode head) {
            int count=1;
            ListNode ln=head;
            while(ln!=null){
                ln=ln.next;
                count++;
            }
            int mid=count/2;
            ln=head;
            for (int i=0;i<mid;++i){
                ln=ln.next;
            }
            return ln;
        }
    }
}
