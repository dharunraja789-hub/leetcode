// Last updated: 13/02/2026, 10:23:12
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
    public ListNode reverseList(ListNode head) {
       ListNode prev=null;
       ListNode current=head;
       while(current!=null){
        ListNode next=current.next;
        current.next=prev;
        prev=current;
        current=next;
       }
       return prev;
    }
}