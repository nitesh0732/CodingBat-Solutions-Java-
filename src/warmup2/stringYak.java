package warmup2;

/**
 * Suppose the string "yak" is unlucky. Given a string, return a version where
 * all the "yak" are removed, but the "a" can be any char. The "yak" strings
 * will not overlap.
 * 
 * stringYak("yakpak") → "pak" stringYak("pakyak") → "pak" stringYak("yak123ya")
 * → "123ya"
 */
public class stringYak {
	public String stringYak(String str) {
		int len = str.length();
		String result = "";
		for (int i = 0; i < len - 3; i++) {

			if (str.substring(i, i + 3).equals("yak"))
				i = i + 3;
			if (i >= len - 3) {
				result = result + str.substring(i);
			} else {
				result = result + str.charAt(i);
				if ((str.substring(i + 1).equals("yak")))
					i = i + len;
				if (i <= len - 3 && i >= len - 4)
					result = result + str.substring(i + 1);
			}
		}
		return result;
	}

}
