package warmup2;

/**
 * Given a string, return a new string made of every other char starting with
 * the first, so "Hello" yields "Hlo".
 * 
 * stringBits("Hello") → "Hlo" stringBits("Hi") → "H" stringBits("Heeololeo") →
 * "Hello"
 */
public class stringBits {
	public String stringBits(String str) {
		int len = str.length();
		String result = "";
		if (len <= 1)
			return str;
		for (int i = 0; i <= len - 1; i = i + 2)
			result = result + str.charAt(i);
		return result;

	}

}
