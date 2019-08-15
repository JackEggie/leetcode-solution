package name.jacktang.leetcode._461;

public class Solution {
	public int hammingDistance(int x, int y) {
		int result = x ^ y;
		int out = 0;
		while (result != 0) {
			if (result % 2 == 1) {
				out++;
			}
			result /= 2;
		}
		return out;
	}
}
