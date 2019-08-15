package name.jacktang.leetcode._7;

public class Solution {
	public int reverse(int x) {
		if (x == Integer.MIN_VALUE) {
			return 0;
		}

		long ret = 0;
		if (x >= 0) {
			ret = Long.valueOf(reverse(String.valueOf(x)));
		} else {
			ret = Long.valueOf("-" + reverse(String.valueOf(Math.abs(x))));
		}
		return (int) ((ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) ? 0 : ret);
	}

	private String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}
