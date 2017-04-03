package array1;

/**
 * Given an array of ints length 3, figure out which is larger, the first or
 * last element in the array, and set all the other elements to be that value.
 * Return the changed array.
 * 
 * maxEnd3([1, 2, 3]) → [3, 3, 3] maxEnd3([11, 5, 9]) → [11, 11, 11] maxEnd3([2,
 * 11, 3]) → [3, 3, 3]
 */
public class maxEnd3 {
	public int[] maxEnd3(int[] nums) {

		for (int i = 0; i < 3; i++) {
			if (nums[0] > nums[2])
				nums[i] = nums[0];
			else
				nums[i] = nums[2];
		}
		return nums;

	}

}
