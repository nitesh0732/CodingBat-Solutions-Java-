package string1;

/**
 * Given two strings, append them together (known as "concatenation") and return
 * the result. However, if the strings are different lengths, omit chars from
 * the longer string so it is the same length as the shorter string. So "Hello"
 * and "Hi" yield "loHi". The strings may be any length.
 * 
 * minCat("Hello", "Hi") → "loHi" minCat("Hello", "java") → "ellojava"
 * minCat("java", "Hello") → "javaello"
 */
public class minCat {
	public String minCat(String a, String b) {
		int lena = a.length(), lenb = b.length(), dif;
		dif = Math.abs(lena - lenb);
		if (dif == 0)
			return a + b;
		if (lena > lenb)
			return a.substring(dif) + b;
		else
			return a + b.substring(dif);
	}

}
