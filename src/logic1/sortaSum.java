package logic1;

/**
 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19
 * inclusive, are forbidden, so in that case just return 20.
 * 
 * sortaSum(3, 4) → 7 sortaSum(9, 4) → 20 sortaSum(10, 11) → 21
 */
public class sortaSum {
	public int sortaSum(int a, int b) {
		int c = a + b;
		if (c >= 10 && c <= 19)
			return 20;
		else
			return c;
	}

}
