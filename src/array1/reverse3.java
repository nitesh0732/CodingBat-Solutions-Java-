package array1;

/**
 * Given an array of ints length 3, return a new array with the elements in
 * reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 * 
 * reverse3([1, 2, 3]) → [3, 2, 1] reverse3([5, 11, 9]) → [9, 11, 5]
 * reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class reverse3 {
	public int[] reverse3(int[] nums) {
		int len = 3, nums1[] = { 0, 0, 0 };
		for (int i = 0; i < len; i++) {
			nums1[i] = nums[len - 1 - i];
		}
		return nums1;
	}

}
