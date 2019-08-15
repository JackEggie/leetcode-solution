package name.jacktang.leetcode._4;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length == 0 && nums2.length == 0) {
			return 0;
		} else if (nums1.length == 0) {
			return nums2.length % 2 == 0 ? ((double) nums2[nums2.length / 2] + (double) nums2[nums2.length / 2 - 1]) / 2 : nums2[nums2.length / 2];
		} else if (nums2.length == 0) {
			return nums1.length % 2 == 0 ? ((double) nums1[nums1.length / 2] + (double) nums1[nums1.length / 2 - 1]) / 2 : nums1[nums1.length / 2];
		}
		int[] nums = new int[nums1.length + nums2.length];
		int start = 0;
		int index = 0;
		for (int i = 0; i < nums1.length;) {
			if (start == nums2.length) {
				nums[index++] = nums1[i];
				i++;
			}
			for (int j = start; j < nums2.length;) {
				if (nums1[i] <= nums2[j]) {
					nums[index++] = nums1[i];
					i++;
					break;
				} else {
					nums[index++] = nums2[j];
					start++;
					j++;
				}
			}
		}
		for (int j = start; j < nums2.length; j++) {
			nums[index++] = nums2[j];
		}
		if (nums.length % 2 == 0) {
			return ((double) nums[nums.length / 2] + (double) nums[nums.length / 2 - 1]) / 2;
		} else {
			return nums[nums.length / 2];
		}
	}
}
