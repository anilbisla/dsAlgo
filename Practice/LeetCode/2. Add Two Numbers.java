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
    /* public static void main(String[] args) {
		// First
		ListNode k = new ListNode(9);
		ListNode j = new ListNode(9, k);
		ListNode i = new ListNode(9, j);
		ListNode h = new ListNode(9, i);
		ListNode g = new ListNode(9, h);
		ListNode f = new ListNode(9, g);
		ListNode e = new ListNode(9, f);
		
		
		
		// Second
		ListNode z = new ListNode(9);
		ListNode y = new ListNode(9, z);
		ListNode x = new ListNode(9, y);
		ListNode w = new ListNode(9, x);
		
		ListNode ans = addTwoNumbers(e, w);
		System.out.println();
	}

	static */ public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
        ListNode reverseAns = null;
        int carry = 0;
        int one = 0;
        int two = 0;
        
		while (l1 != null || l2 != null) {
			if (l1 != null ) {
				one = l1.val;
				l1 = l1.next;
			}
			
			if (l2 != null ) {
				two = l2.val;
				l2 = l2.next;
			}
			
			int sum = one + two + carry;
			
			carry = sum / 10;
			int val = sum % 10;
			reverseAns = new ListNode(val, reverseAns);
			one = 0;
			two = 0;
		}
		
		if (carry != 0) {
			reverseAns = new ListNode(carry, reverseAns);
		}
		
		ListNode ans = null;
		while (reverseAns != null) {
			ans = new ListNode(reverseAns.val, ans);
			reverseAns = reverseAns.next;
		}
		return ans;
    }
}