package warmup2;

/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 * 
 * stringSplosion("Code") → "CCoCodCode" stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */
public class stringSplosion {
	public String stringSplosion(String str) {
		int len = str.length();
		String result = "";
		for (int i = 0; i <= len - 1; i++)
			result = result + str.substring(0, i + 1);
		return result;
	}

}
