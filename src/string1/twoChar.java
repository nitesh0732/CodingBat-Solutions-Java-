package string1;

/**
 * Given a string and an index, return a string length 2 starting at the given
 * index. If the index is too big or too small to define a string length 2, use
 * the first 2 chars. The string length will be at least 2.
 * 
 * twoChar("java", 0) → "ja" twoChar("java", 2) → "va" twoChar("java", 3) → "ja"
 */
public class twoChar {
	public String twoChar(String str, int index) {
		int len = str.length();
		if (index >= len - 1 || index < 0)
			return (str.substring(0, 2));
		else
			return (str.substring(index, index + 2));
	}

}