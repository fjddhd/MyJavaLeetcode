/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a=0,b=0;
        ListNode lna=headA,lnb=headB;
        if(headA==null || headB==null)
            return null;
        while(lna!=null){
            a++;
            lna=lna.next;
        }
        while(lnb!=null){
            b++;
            lnb=lnb.next;
        }
        lna=headA;
        lnb=headB;
        if(a==b){
            for(int i=0;i<a;++i){
                if(lna==lnb)
                    return lna;
                lna=lna.next;
                lnb=lnb.next;
            }
        }
        else if(a<b){
            for(int i=0;i<b-a;++i){
                lnb=lnb.next;
            }
            for(int i=0;i<a;++i){
                if(lna==lnb)
                    return lna;
                lna=lna.next;
                lnb=lnb.next;
            }
        }
        else{
            for(int i=0;i<a-b;++i){
                lna=lna.next;
            }
            for(int i=0;i<b;++i){
                if(lna==lnb)
                    return lna;
                lna=lna.next;
                lnb=lnb.next;
            }
        }
        return null;
    }
}
