package name.jacktang.leetcode._3;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s.isEmpty()){
			return 0;
		}
		int start = 0;
		int end = 1;
		int max = 1;
		while (end < s.length()) {
			String sub = s.substring(start, end);
			char cur = s.charAt(end);
			end++;
			if (sub.indexOf(cur) >= 0) {
				start += sub.indexOf(cur) + 1;
			}
			if (end - start > max) {
				max = end - start;
			}
		}
		return max;
	}
}
