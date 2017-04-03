package logic1;

/**
 * Given three ints, a b c, return true if one of them is 10 or more less than
 * one of the others.
 * 
 * lessBy10(1, 7, 11) → true lessBy10(1, 7, 10) → false lessBy10(11, 1, 7) →
 * true
 */
public class lessBy10 {
	public boolean lessBy10(int a, int b, int c) {
		int resa = Math.abs(a - b), resb = Math.abs(b - c), resc = Math.abs(c - a);
		if (resa >= 10 || resb >= 10 || resc >= 10)
			return true;
		return false;
	}

}
