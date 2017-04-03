package logic1;

/**
 * Return true if the given non-negative number is a multiple of 3 or 5, but not
 * both. Use the % "mod" operator -- see Introduction to Mod
 * 
 * old35(3) → true old35(10) → true old35(15) → false
 */
public class old35 {
	public boolean old35(int n) {
		int res3 = n % 3, res5 = n % 5;
		if (res3 == 0 && res5 == 0)
			return false;
		if (res3 == 0 || res5 == 0)
			return true;

		else
			return false;
	}

}
