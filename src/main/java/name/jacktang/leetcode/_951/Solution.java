package name.jacktang.leetcode._951;

public class Solution {
	public boolean flipEquiv(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		} else if ((root1 != null && root2 == null) || (root1 == null && root2 != null)) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}
		boolean ret1 = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
		boolean ret2 = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
		return ret1 || ret2;
	}
}

// Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}