package array1;

/**
 * Given an array of ints of odd length, look at the first, last, and middle
 * values in the array and return the largest. The array length will be a least
 * 1.
 * 
 * maxTriple([1, 2, 3]) → 3 maxTriple([1, 5, 3]) → 5 maxTriple([5, 2, 3]) → 5
 */
public class maxTriple {
	public int maxTriple(int[] nums) {
		int len = nums.length;
		int max1 = Math.max(nums[0], nums[len - 1]);
		int max = Math.max(max1, nums[len / 2]);
		return max;

	}

}
