package warmup1;

/**
 * Return true if the given string contains between 1 and 3 'e' chars.
 * 
 * stringE("Hello") → true stringE("Heelle") → true stringE("Heelele") → false
 */
public class stringE {
	public boolean stringE(String str) {
		int len = str.length();
		int c = 0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'e')
				c = c + 1;
		}
		if (c >= 1 && c <= 3)
			return true;
		else
			return false;
	}
}
