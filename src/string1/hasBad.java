package string1;

/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the
 * string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may
 * be any length, including 0. Note: use .equals() to compare 2 strings.
 * 
 * hasBad("badxx") → true hasBad("xbadxx") → true hasBad("xxbadxx") → false
 */
public class hasBad {
	public boolean hasBad(String str) {
		int len = str.length(), c;
		if (len < 3)
			return false;
		if (len == 3)
			c = len;
		else
			c = 4;
		String fh = str.substring(0, 3);
		String sh = str.substring(1, c);
		if (fh.equals("bad") || sh.equals("bad"))
			return true;
		else
			return false;
	}

}
