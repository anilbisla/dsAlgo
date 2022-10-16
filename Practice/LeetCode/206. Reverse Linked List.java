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
		ListNode current = head;
		ListNode reverse = null;
		ListNode remaining = null;
		while (current != null) {
			remaining = current.next;
			current.next = reverse;
			reverse = current;
			current = remaining;
		}
		return reverse;
    }
}