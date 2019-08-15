package name.jacktang.leetcode._8;

public class Solution {
	public int myAtoi(String str) {
		String val = "";
		String input = str.trim();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '-' && i == 0) {
				val += c;
			} else if (c >= '0' && c <= '9') {
				val += c;
			} else if (c == '+' && i == 0) {
				continue;
			} else {
				break;
			}
		}
		boolean positive = true;
		if (val.startsWith("-")) {
			positive = false;
			val = val.substring(1, val.length());
		}
		if (val.isEmpty()) {
			return 0;
		}
		long ret = 0;
		try {
			ret = Long.valueOf(val);
		} catch (NumberFormatException e) {
			if (val.length() > 10) {
				return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
		}
		if (ret > Integer.MAX_VALUE) {
			return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		}
		return (int) (positive ? ret : -ret);
	}
}
