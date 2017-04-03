package string1;

/**
 * Given a string, return a version without both the first and last char of the
 * string. The string may be any length, including 0.
 * 
 * withouEnd2("Hello") → "ell" withouEnd2("abc") → "b" withouEnd2("ab") → ""
 */
public class withoutEnd2 {
	public String withouEnd2(String str) {
		int len = str.length();
		if (len <= 2)
			return "";
		else
			return (str.substring(1, len - 1));
	}

}
