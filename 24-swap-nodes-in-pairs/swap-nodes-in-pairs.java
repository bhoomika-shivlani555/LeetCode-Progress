/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return head;
        ListNode dummy=new ListNode(-1,head);
        ListNode point;
        point=dummy;
        ListNode swap1;
        ListNode swap2;
        while(point.next!=null && point.next.next!=null)
        {
            swap1=point.next;
            swap2=point.next.next;
            point.next=swap2;
            swap1.next=swap2.next;
            swap2.next=swap1;
            point=swap1;
        }
        return dummy.next;
    }
}