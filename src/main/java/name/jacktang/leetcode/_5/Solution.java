package name.jacktang.leetcode._5;

public class Solution {
	public String longestPalindrome(String s) {
		int start = 0;
		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			int offset = 1;
			// odd
			while (i - offset >= 0 && i + offset < s.length() && s.charAt(i - offset) == s.charAt(i + offset)) {
				offset++;
			}
			if ((offset - 1) * 2 + 1 > max) {
				start = i - (offset - 1);
				max = (offset - 1) * 2 + 1;
			}
			offset = 0;
			// even
			while (i - offset >= 0 && i + offset + 1 < s.length() && s.charAt(i - offset) == s.charAt(i + offset + 1)) {
				offset++;
			}
			if (offset * 2 > max) {
				start = i - offset + 1;
				max = offset * 2;
			}
		}

		return s.substring(start, start + max);
	}
}
