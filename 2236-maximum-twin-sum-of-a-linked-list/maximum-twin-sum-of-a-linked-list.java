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
    public int pairSum(ListNode head) {
        LinkedList<Integer> l=new LinkedList<>();
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr=slow.next;
        ListNode next=null;
        ListNode prev=slow;
        slow.next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode head2=prev;
        int max=0;
        while(head!=null)
        {
            max=Math.max(max,head.val+head2.val);
            head=head.next;
            head2=head2.next;
        }
        return max;
    }
}