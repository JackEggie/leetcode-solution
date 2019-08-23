package name.jacktang.leetcode._788;

public class Solution {
	public int rotatedDigits(int N) {
		int ret = 0;
		for (int i = 1; i <= N; i++) {
			String s = String.valueOf(i);
			boolean valid = !s.contains("3") && !s.contains("4") && !s.contains("7");
			boolean diff = s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9");
			if (valid && diff) {
				ret++;
			}
		}
		return ret;
	}
}
