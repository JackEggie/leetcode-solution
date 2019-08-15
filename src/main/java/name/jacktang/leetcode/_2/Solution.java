package name.jacktang.leetcode._2;

/**
 * Definition for singly-linked list.
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ret = new ListNode(0);
		ListNode cur = ret;
		ListNode cur1 = l1;
		ListNode cur2 = l2;
		int more = 0;
		while (cur1 != null || cur2 != null) {
			if (cur1 != null) {
				cur.val += cur1.val;
				cur1 = cur1.next;
			}
			if (cur2 != null) {
				cur.val += cur2.val;
				cur2 = cur2.next;
			}
			int sum = cur.val;
			cur.val = sum % 10;
			more = sum / 10;
			if (more > 0) {
				cur.next = new ListNode(more);
			} else if (cur1 != null || cur2 != null) {
				cur.next = new ListNode(0);
			}
			cur = cur.next;
		}
		return ret;
	}
}

