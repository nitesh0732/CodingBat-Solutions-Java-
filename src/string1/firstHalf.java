package string1;

/**
 * Given a string of even length, return the first half. So the string "WooHoo"
 * yields "Woo".
 * 
 * firstHalf("WooHoo") → "Woo" firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 */
public class firstHalf {
	public String firstHalf(String str) {
		int len = str.length() / 2;
		return str.substring(0, len);
	}

}