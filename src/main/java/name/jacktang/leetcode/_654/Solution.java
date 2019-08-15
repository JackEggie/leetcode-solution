package name.jacktang.leetcode._654;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return build(nums, 0, nums.length - 1);
	}

	private TreeNode build(int[] nums, int start, int end) {

		if (start > end) return null;

		if (start == end) return new TreeNode(nums[start]);

		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = start; i <= end; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}

		TreeNode treeNode = new TreeNode(max);
		treeNode.left = build(nums, start, index - 1);
		treeNode.right = build(nums, index + 1, end);

		return treeNode;
	}
}