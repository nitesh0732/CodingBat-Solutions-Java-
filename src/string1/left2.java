package string1;

/**
 * Given a string, return a "rotated left 2" version where the first 2 chars are
 * moved to the end. The string length will be at least 2.
 * 
 * left2("Hello") → "lloHe" left2("java") → "vaja" left2("Hi") → "Hi"
 */
public class left2 {
	public String left2(String str) {
		String ft = str.substring(0, 2);
		String rest = str.substring(2);
		return (rest + ft);
	}

}
