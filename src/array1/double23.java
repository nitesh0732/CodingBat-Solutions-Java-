package array1;

/**
 * Given an int array, return true if the array contains 2 twice, or 3 twice.
 * The array will be length 0, 1, or 2.
 * 
 * double23([2, 2]) → true double23([3, 3]) → true double23([2, 3]) → false
 */
public class double23 {
	public boolean double23(int[] nums) {
		int len = nums.length, c = 0, d = 0;
		if (len > 1) {
			for (int i = 0; i < 2; i++) {
				if (nums[i] == 2)
					c = c + 1;
				if (nums[i] == 3)
					d = d + 1;
			}
		}
		if (c == 2 || d == 2)
			return true;
		else
			return false;
	}

}
