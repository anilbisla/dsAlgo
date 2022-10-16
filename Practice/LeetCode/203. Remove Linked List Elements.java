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
    public ListNode removeElements(ListNode head, int val) {
		// First removing vals present in the starting
		while (head != null && head.val == val) {
			head = head.next;
		}
		// if all elements were = val, return nul
		if (head == null) {
			return null;
		}
		
        // Here we sure first element left is not null, it is = safe now
		ListNode safe = head;
		while (head.next != null) {
			if (head.next.val == val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return safe;
	}
}