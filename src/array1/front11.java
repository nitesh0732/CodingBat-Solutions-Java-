package array1;

/**
 * Given 2 int arrays, a and b, of any length, return a new array with the first
 * element of each array. If either array is length 0, ignore that array.
 * 
 * front11([1, 2, 3], [7, 9, 8]) → [1, 7] front11([1], [2]) → [1, 2] front11([1,
 * 7], []) → [1]
 */
public class front11 {
	public int[] front11(int[] a, int[] b) {
		int lena = a.length, lenb = b.length;
		if (lena > 0 && lenb > 0)
			return new int[] { a[0], b[0] };
		if (lena == 0 && lenb == 1)
			return new int[] { b[0] };
		if (lena == 0 && lenb > 1)
			return new int[] { b[0] };
		if (lenb == 0 && lena == 1)
			return new int[] { a[0] };
		if (lenb == 0 && lena > 1)
			return new int[] { a[0] };
		else
			return a;
	}

}
