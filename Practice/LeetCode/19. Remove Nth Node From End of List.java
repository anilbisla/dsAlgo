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
    public ListNode removeNthFromEnd(ListNode head, int n) {
		int count = 1;
		ListNode lead = head;
		ListNode trail = head;
		while (lead.next != null) {
			if (count > n) {
				trail = trail.next;
			}
			lead = lead.next;
			count++;
		}
		if (count == 1 && n == 1) {
			return null;
		} else if (count == n) {
			return head.next;
            
        }
		trail.next = trail.next.next;

		return head;
	}
}