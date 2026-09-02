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
    public ListNode mergeNodes(ListNode head) {
        if(head==null || head.next==null)
            return null;
        head=head.next;
        int sum=0;
        ListNode curr=head;
        ListNode prev=null;
        ListNode head2=null;
        while(curr!=null)
        {

            if(curr.val==0)
            {
                ListNode nn=new ListNode(sum);
                sum=0;
                if(prev!=null)
                    prev.next=nn;
                else
                {
                    head2=nn;
                } 
                prev=nn;
                curr=curr.next;
            }
            else
            {
                sum=sum+curr.val;
                curr=curr.next;
            }
        }
        return head2;
    }
}