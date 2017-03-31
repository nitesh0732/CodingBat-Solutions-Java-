package warmup1;

/**
 * Given a string, take the last char and return a new string with the last char
 * added at the front and back, so "cat" yields "tcatt". The original string
 * will be length 1 or more.
 * 
 * backAround("cat") → "tcatt" backAround("Hello") → "oHelloo" backAround("a") →
 * "aaa"
 */
public class backAround {
	public String backAround(String str) {
		int a = str.length();
		if (a <= 1)
			return (str + str + str);
		else
			return (str.substring(a - 1, a) + str + str.substring(a - 1, a));

	}
}
