package name.jacktang.leetcode._344;

public class Solution {
	public String reverseString(String s) {
		StringBuilder result = new StringBuilder();
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			result.append(ch[i]);
		}
		return result.toString();
	}
}
