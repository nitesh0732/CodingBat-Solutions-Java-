package string1;

/**
 * Given a string, return a new string made of 3 copies of the last 2 chars of
 * the original string. The string length will be at least 2.
 * 
 * extraEnd("Hello") → "lololo" extraEnd("ab") → "ababab" extraEnd("Hi") →
 * "HiHiHi"
 */
public class extraEnd {
	public String extraEnd(String str) {
		int len = str.length();
		String rs = str.substring(len - 2, len);
		return (rs + rs + rs);
	}

}
