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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ap=list1;
        ListNode bp=list1;

        while(a!=1)
        {
            ap=ap.next;
            a--;
        }
        while(b!=0)
        {
            bp=bp.next;
            b--;
        }
        ap.next=list2;
        ListNode temp=list2;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=bp.next;
        bp.next=null;

        return list1;
    }
}