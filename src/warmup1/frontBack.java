package warmup1;

/**
 * Given a string, return a new string where the first and last chars have been
 * exchanged.
 * 
 * frontBack("code") → "eodc" frontBack("a") → "a" frontBack("ab") → "ba"
 */
public class frontBack {
	public String frontBack(String str) {
		int a = str.length();
		if (a < 2)
			return str;
		else
			return (str.substring(a - 1, a) + str.substring(1, a - 1) + str.substring(0, 1));

	}
}
