package name.jacktang.leetcode._242;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> charCountMap1 = new HashMap<>();
		Map<Character, Integer> charCountMap2 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char sc = s.charAt(i);
			if (charCountMap1.containsKey(sc)) {
				charCountMap1.put(sc, charCountMap1.get(sc) + 1);
			} else {
				charCountMap1.put(sc, 1);
			}
			char tc = t.charAt(i);
			if (charCountMap2.containsKey(tc)) {
				charCountMap2.put(tc, charCountMap2.get(tc) + 1);
			} else {
				charCountMap2.put(tc, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : charCountMap1.entrySet()) {
			if (!charCountMap2.containsKey(entry.getKey()) || !charCountMap2.get(entry.getKey()).equals(entry.getValue())) {
				return false;
			}
		}
		return true;
	}
}
