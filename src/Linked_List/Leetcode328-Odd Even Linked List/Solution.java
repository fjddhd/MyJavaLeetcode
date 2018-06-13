public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null ||head.next.next==null)
            return head;
        ListNode Sln=head;
        ListNode dln=head.next;
        ListNode Dln=head.next;
        ListNode Dtemp,Stemp;

        while(Dln.next.next!=null){
            Dtemp=Sln.next;
            Sln.next=Dtemp.next;
            Sln=Sln.next;
            Stemp=Dln.next;
            Dln.next=Stemp.next;
            Dln=Dln.next;
            if(Dln.next==null)
                break;
        }
        if (Dln.next!=null){
            Sln.next=Dln.next;
            Sln=Sln.next;
        }

        Dln.next=null;
        Sln.next=dln;
        return head;
    }
}
