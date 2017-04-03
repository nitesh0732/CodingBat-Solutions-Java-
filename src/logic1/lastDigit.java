package logic1;

/**
 * Given three ints, a b c, return true if two or more of them have the same
 * rightmost digit. The ints are non-negative. Note: the % "mod" operator
 * computes the remainder, e.g. 17 % 10 is 7.
 * 
 * lastDigit(23, 19, 13) → true lastDigit(23, 19, 12) → false lastDigit(23, 19,
 * 3) → true
 */
public class lastDigit {
	public boolean lastDigit(int a, int b, int c) {
		int c1 = 0;
		if (a % 10 == b % 10)
			c1 = c1 + 1;
		if (a % 10 == c % 10)
			c1 = c1 + 1;
		if (b % 10 == c % 10)
			c1 = c1 + 1;
		if (c1 >= 1)
			return true;
		else
			return false;

	}

}
