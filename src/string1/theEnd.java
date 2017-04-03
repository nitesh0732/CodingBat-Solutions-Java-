package string1;

/**
 * Given a string, return a string length 1 from its front, unless front is
 * false, in which case return a string length 1 from its back. The string will
 * be non-empty.
 * 
 * theEnd("Hello", true) → "H" theEnd("Hello", false) → "o" theEnd("oh", true) →
 * "o"
 */
public class theEnd {
	public String theEnd(String str, boolean front) {
		int len = str.length();
		if (front == false)
			return str.substring(len - 1, len);
		else
			return str.substring(0, 1);
	}

}
