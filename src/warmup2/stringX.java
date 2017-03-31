package warmup2;

/**
 * Given a string, return a version where all the "x" have been removed. Except
 * an "x" at the very start or end should not be removed.
 * 
 * stringX("xxHxix") → "xHix" stringX("abxxxcd") → "abcd" stringX("xabxxxcdx") →
 * "xabcdx"
 */
public class stringX {
	public String stringX(String str) {
		int len = str.length();
		String result = "";
		for (int i = 0; i <= len - 1; i++) {
			if (!(i > 0 && i < len - 1 && str.substring(i, i + 1).equals("x")))
				result = result + str.charAt(i);
		}
		return result;

	}

}
