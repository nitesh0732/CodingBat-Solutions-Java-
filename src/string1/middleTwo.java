package string1;

/**
 * Given a string of even length, return a string made of the middle two chars,
 * so the string "string" yields "ri". The string length will be at least 2.
 * 
 * middleTwo("string") → "ri" middleTwo("code") → "od" middleTwo("Practice") →
 * "ct"
 */
public class middleTwo {
	public String middleTwo(String str) {
		int len = str.length() / 2;
		return (str.substring(len - 1, len + 1));
	}

}
