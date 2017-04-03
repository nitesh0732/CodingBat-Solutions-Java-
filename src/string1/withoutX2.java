package string1;

/**
 * Given a string, if one or both of the first 2 chars is 'x', return the string
 * without those 'x' chars, and otherwise return the string unchanged. This is a
 * little harder than it looks.
 * 
 * withoutX2("xHi") → "Hi" withoutX2("Hxi") → "Hi" withoutX2("Hi") → "Hi"
 */
public class withoutX2 {
	public String withoutX2(String str) {
		int len = str.length();
		if (str.equals("x") || len < 2)
			return "";

		if (str.substring(0, 1).equals("x")) {
			str = str.substring(1);
			if (str.substring(0, 1).equals("x"))
				str = str.substring(1);
			return str;
		}
		if (str.substring(1, 2).equals("x"))
			return str.substring(0, 1) + str.substring(2);
		else
			return str;
	}

}
