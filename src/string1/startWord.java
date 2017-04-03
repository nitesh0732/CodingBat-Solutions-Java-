package string1;

/**
 * Given a string and a second "word" string, we'll say that the word matches
 * the string if it appears at the front of the string, except its first char
 * does not need to match exactly. On a match, return the front of the string,
 * or otherwise return the empty string. So, so with the string "hippo" the word
 * "hi" returns "hi" and "xip" returns "hip". The word will be at least length
 * 1.
 * 
 * startWord("hippo", "hi") → "hi" startWord("hippo", "xip") → "hip"
 * startWord("hippo", "i") → "h"
 */
public class startWord {
	public String startWord(String str, String word) {
		int len = word.length(), len2 = str.length();
		if (len2 == 0 || len2 < len)
			return "";
		if (len == 1) {
			return str.substring(0, 1);
		}
		String str1 = str.substring(1, len);
		word = word.substring(1);
		if (word.equals(str1))
			return str.substring(0, len);
		else
			return new String("");
	}

}
