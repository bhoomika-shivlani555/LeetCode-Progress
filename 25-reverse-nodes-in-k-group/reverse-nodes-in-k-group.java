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
    public ListNode reverse(ListNode head,ListNode n)
    {
        if(head==null)
            return null;
        ListNode prev=n;            //important
        ListNode curr=head;
        ListNode next;
        while(curr!=n)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next; 
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1)
            return head;
        ListNode temp=head;
        ListNode prev=null;
        ListNode end;
        ListNode next;
        ListNode start=head;
        while(temp!=null)
        {
            for(int i=1;i<k;i++)
            {
                temp=temp.next;
                if(temp==null)
                    return head;
            }
            end=temp;
            next=end.next;
            ListNode p=reverse(start,next);
            if(prev==null)
                head=p;
            if(prev != null)
                prev.next=p;
            prev=start;
            temp=next;
            start=next;
        }
        return head;
    }
}