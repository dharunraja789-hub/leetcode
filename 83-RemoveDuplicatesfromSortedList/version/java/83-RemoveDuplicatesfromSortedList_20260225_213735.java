// Last updated: 25/02/2026, 21:37:35
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13          ListNode temp = head;
14        while (temp != null && temp.next != null){
15            if (temp.val == temp.next.val){
16                ListNode dup = temp.next;
17                temp.next = temp.next.next;
18                dup.next = null;
19            }
20            else {
21                temp = temp.next;
22            }
23        }
24        return head;
25    }
26}