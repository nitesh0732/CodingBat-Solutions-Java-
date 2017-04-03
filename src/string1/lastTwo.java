package string1;

/**
 * Given a string of any length, return a new string where the last 2 chars, if
 * present, are swapped, so "coding" yields "codign".
 * 
 * lastTwo("coding") → "codign" lastTwo("cat") → "cta" lastTwo("ab") → "ba"
 */
public class lastTwo {
	public String lastTwo(String str) {
		int len = str.length();
		if (len < 2)
			return str;
		String part1 = str.substring(0, len - 2);
		String part2 = str.substring(len - 2, len - 1);
		String part3 = str.substring(len - 1);
		return part1 + part3 + part2;
	}

}
