package array1;

/**
 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the
 * values in each array. Return the array which has the largest sum. In event of
 * a tie, return a.
 * 
 * biggerTwo([1, 2], [3, 4]) → [3, 4] biggerTwo([3, 4], [1, 2]) → [3, 4]
 * biggerTwo([1, 1], [1, 2]) → [1, 2]
 */
public class biggerTwo {
	public int[] biggerTwo(int[] a, int[] b) {
		int suma = 0, sumb = 0;
		for (int i = 0; i < 2; i++) {
			suma = suma + a[i];
			sumb = sumb + b[i];
		}
		if (suma >= sumb)
			return a;
		else
			return b;
	}

}
