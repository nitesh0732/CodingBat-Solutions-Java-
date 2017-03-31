package warmup2;

/**
 * Given 2 strings, a and b, return the number of the positions where they
 * contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
 * since the "xx", "aa", and "az" substrings appear in the same place in both
 * strings.
 * 
 * stringMatch("xxcaazz", "xxbaaz") → 3 stringMatch("abc", "abc") → 2
 * stringMatch("abc", "axc") → 0
 */
public class stringMatch {
	public int stringMatch(String a, String b) {
		int len, c = 0;
		if (a.length() > b.length())
			len = b.length();
		else
			len = a.length();
		for (int i = 0; i < len - 1; i++) {
			if (a.substring(i, i + 2).equals(b.substring(i, i + 2)))
				c = c + 1;
		}
		return c;
	}

}
