/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null)
            return head;
        ListNode ln=head;
        ListNode begin=head;
        while(ln.next!=null){
            ln=ln.next;
        }
        quickSort(begin,ln);
        return head;
    }
    public void quickSort(ListNode begin, ListNode end) {
        //�ж�Ϊ�գ��ж��ǲ���ֻ��һ���ڵ�
        if (begin == null || end == null || begin == end)
            return;
        //�ӵ�һ���ڵ�͵�һ���ڵ�ĺ���һ������
        ListNode first = begin;
        ListNode second = begin.next;

        int nMidValue = begin.val;
        //����������second�������
        while (second != end.next && second != null) {
            if (second.val < nMidValue) {
                first = first.next;
                //�ж�һ�£������������ȵ�һ����С�����û��ľ���
                if (first != second) {
                    int temp = first.val;
                    first.val = second.val;
                    second.val = temp;
                }
            }
            second = second.next;
        }
        //�жϣ���Щ����ǲ��û��ģ���������
        if (begin != first) {
            int temp = begin.val;
            begin.val = first.val;
            first.val = temp;
        }
        //ǰ���ֵݹ�
        quickSort(begin, first);
        //�󲿷ֵݹ�
        quickSort(first.next, end);
    }
}