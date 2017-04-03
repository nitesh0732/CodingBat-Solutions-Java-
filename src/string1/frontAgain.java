package string1;

/**
 * Given a string, return true if the first 2 chars in the string also appear at
 * the end of the string, such as with "edited".
 * 
 * frontAgain("edited") → true frontAgain("edit") → false frontAgain("ed") →
 * true
 */
public class frontAgain {
	public boolean frontAgain(String str) {
		int len = str.length();
		if (len < 2)
			return false;
		String ft = str.substring(0, 2);
		String lt = str.substring(len - 2);
		if (ft.equals(lt))
			return true;
		else
			return false;
	}

}
