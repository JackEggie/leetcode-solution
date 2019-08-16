package name.jacktang.leetcode._11;

public class Solution {
	public int maxArea(int[] height) {
		if (height.length < 2) {
			return 0;
		}

		int volume = 0;
		for (int length = height.length; length > 1; length--) {
			for (int position = 0; position <= height.length - length; position++) {
				int tempVolume = Math.min(height[position], height[position + length - 1]) * (length - 1);
				if (tempVolume > volume) {
					volume = tempVolume;
				}
			}
		}
		return volume;
	}
}
