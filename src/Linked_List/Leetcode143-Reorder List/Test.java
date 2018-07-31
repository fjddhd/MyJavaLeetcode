public class Test {
    public static void main(String[] args){
        ListNode ln=new ListNode(1);
        ln.next=new ListNode(2);
        ln.next.next=new ListNode(3);
        ln.next.next.next=new ListNode(4);
        Solution S=new Solution();
        S.reorderList(ln);
    }
}
