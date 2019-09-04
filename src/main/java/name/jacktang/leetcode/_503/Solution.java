package name.jacktang.leetcode._503;

public class Solution {
	public int[] nextGreaterElements(int[] nums) {
		int[] ret = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ret[i] = -1;
			for (int j = 1; j < nums.length; j++) {
				int index = (i + j) % nums.length;
				if (nums[index] > nums[i]) {
					ret[i] = nums[index];
					break;
				}
			}
		}
		return ret;
	}
}
