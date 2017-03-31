package warmup2;

/**
 * Count the number of "xx" in the given string. We'll say that overlapping is
 * allowed, so "xxx" contains 2 "xx".
 * 
 * countXX("abcxx") → 1 countXX("xxx") → 2 countXX("xxxx") → 3
 */
public class countXX {
	int countXX(String str) {
		int c = 0, len = str.length();
		if (len < 3 && str.equals("xx"))
			return 1;
		for (int i = 0; i <= len - 2; i++) {
			if (str.substring(i, i + 2).equals("xx"))
				c = c + 1;
		}
		return c;
	}

}
