public class Test {
    public static void main(String[] s){
        Solution S=new Solution();
        ListNode a=new ListNode(1);ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        a.next=b;b.next=c;c.next=d;d.next=e;
        ListNode l=S.reverseBetween(a,1,4);
        while (l!=null){
            System.out.println(l.val);
            l=l.next;
        }
    }
}
