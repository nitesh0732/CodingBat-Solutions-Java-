package string1;

/**
 * Given 2 strings, a and b, return a new string made of the first char of a and
 * the last char of b, so "yo" and "java" yields "ya". If either string is
 * length 0, use '@' for its missing char.
 * 
 * lastChars("last", "chars") → "ls" lastChars("yo", "java") → "ya"
 * lastChars("hi", "") → "h@"
 */
public class lastChars {
	public String lastChars(String a, String b) {
		int lena = a.length(), lenb = b.length();
		if (lena == 0 && lenb == 0)
			return "@@";
		if (lena == 0)
			return ("@" + b.substring(lenb - 1));
		if (lenb == 0)
			return (a.substring(0, 1) + "@");

		else
			return (a.substring(0, 1) + b.substring(lenb - 1));
	}

}
