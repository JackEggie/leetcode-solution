package name.jacktang.leetcode._532;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
	public int findPairs(int[] nums, int k) {
		Map<Integer, Integer> numCountMap = new TreeMap<>();
		for (int num : nums) {
			if (numCountMap.keySet().contains(num)) {
				numCountMap.put(num, numCountMap.get(num) + 1);
			} else {
				numCountMap.put(num, 1);
			}
		}
		int ret = 0;
		if (k == 0) {
			for (int count : numCountMap.values()) {
				if (count > 1) {
					ret++;
				}
			}
			return ret;
		} else {
			Integer[] numArray = numCountMap.keySet().toArray(new Integer[]{});
			for (int i = 0; i < numArray.length - 1; i++) {
				for (int j = i + 1; j < numArray.length; j++) {
					if (numArray[j] - numArray[i] == k) {
						ret++;
					}
				}
			}
		}
		return ret;
	}
}
