package warmup2;

/**
 * Given an array of ints, return true if one of the first 4 elements in the
 * array is a 9. The array length may be less than 4.
 * 
 * arrayFront9([1, 2, 9, 3, 4]) → true arrayFront9([1, 2, 3, 4, 9]) → false
 * arrayFront9([1, 2, 3, 4, 5]) → false
 */
public class arrayFront9 {
	public boolean arrayFront9(int[] nums) {
		int count, c = 0;
		int temp = nums.length;
		if (temp < 3)
			count = nums.length;
		else
			count = 3;
		for (int i = 0; i < count; i++) {
			if (nums[i] == 9)
				c = c + 1;
		}
		if (c > 0)
			return true;
		else
			return false;

	}

}
