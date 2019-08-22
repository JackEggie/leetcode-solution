package name.jacktang.leetcode._594;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
	public int findLHS(int[] nums) {
		Map<Integer, Integer> numCount = new TreeMap<>();
		for (int num : nums) {
			if (numCount.containsKey(num)) {
				numCount.put(num, numCount.get(num) + 1);
			} else {
				numCount.put(num, 1);
			}
		}
		int ret = 0;
		Integer[] numArray = numCount.keySet().toArray(new Integer[]{});
		for (int i = 0; i < numArray.length - 1; i++) {
			if (numArray[i + 1] - numArray[i] == 1 && numCount.get(numArray[i + 1]) + numCount.get(numArray[i]) > ret) {
				ret = numCount.get(numArray[i + 1]) + numCount.get(numArray[i]);
			}
		}
		return ret;
	}
}
