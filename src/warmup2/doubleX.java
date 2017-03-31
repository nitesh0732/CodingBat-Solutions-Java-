package warmup2;

/**
 * Given a string, return true if the first instance of "x" in the string is
 * immediately followed by another "x".
 * 
 * doubleX("axxbb") → true doubleX("axaxax") → false doubleX("xxxxx") → true
 */
public class doubleX {
	boolean doubleX(String str) {

		int len = str.length(), c = 0;
		int m = str.indexOf("x");
		if (m < 0 || m >= len - 1)
			return false;
		for (int i = 0; i <= len - 2; i++) {
			if (str.substring(m, m + 2).equals("xx"))
				c = c + 1;
		}
		if (c > 0)
			return true;
		else
			return false;

	}

}
