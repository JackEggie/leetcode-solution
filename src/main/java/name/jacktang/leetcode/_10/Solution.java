package name.jacktang.leetcode._10;

public class Solution {
	public boolean isMatch(String s, String p) {
		if (s.isEmpty() && p.isEmpty()) {
			return true;
		}
		if (!s.isEmpty() && p.isEmpty()) {
			return false;
		}
		if (s.isEmpty() && !p.isEmpty()) {
			if (p.length() > 1 && p.charAt(1) == '*') {
				return isMatch(s, p.substring(2, p.length()));
			} else {
				return false;
			}
		}
		if (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') {
			if (p.length() > 1 && p.charAt(1) == '*') {
				return isMatch(s.substring(1, s.length()), p) | isMatch(s, p.substring(2, p.length()));
			} else {
				return isMatch(s.substring(1, s.length()), p.substring(1, p.length()));
			}
		} else {
			if (p.length() > 1 && p.charAt(1) == '*') {
				return isMatch(s, p.substring(2, p.length()));
			} else {
				return false;
			}
		}
	}
}
