package array1;

/**
 * Given an array of ints length 3, return the sum of all the elements.
 * 
 * sum3([1, 2, 3]) → 6 sum3([5, 11, 2]) → 18 sum3([7, 0, 0]) → 7
 */
public class sum3 {
	public int sum3(int[] nums) {
		int len = nums.length, c = 0;
		for (int i = 0; i < len; i++) {
			c = c + nums[i];
		}
		return c;
	}

}
