package warmup1;

/**
 * Given a string, return a new string where the last 3 chars are now in upper
 * case. If the string has less than 3 chars, uppercase whatever is there. Note
 * that str.toUpperCase() returns the uppercase version of a string.
 * 
 * endUp("Hello") → "HeLLO" endUp("hi there") → "hi thERE" endUp("hi") → "HI"
 */
public class endUp {
	public String endUp(String str) {
		int len = str.length();

		if (len >= 3) {
			String str1 = str.substring(0, len - 3);
			String str2 = str.substring(len - 3);
			String str3 = str2.toUpperCase();
			return (str1 + str3);
		} else
			return str.toUpperCase();

	}
}
