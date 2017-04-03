package logic1;

/**
 * Given three ints, a b c, return true if it is possible to add two of the ints
 * to get the third.
 * 
 * twoAsOne(1, 2, 3) → true twoAsOne(3, 1, 2) → true twoAsOne(3, 2, 2) → false
 */
public class twoAsOne {
	public boolean twoAsOne(int a, int b, int c) {
		if (a + b == c || b + c == a || c + a == b)
			return true;
		return false;
	}

}
