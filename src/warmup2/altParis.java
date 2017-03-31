package warmup2;

/**
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
 * ... so "kittens" yields "kien".
 * 
 * altPairs("kitten") → "kien" altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 */
public class altParis {
	public String altPairs(String str) {
		int len = str.length(), end;
		String result = "";
		if (len <= 1)
			return str;
		for (int i = 0; i < len; i = i + 4) {
			end = i + 2;
			if (end > len)
				end = len;
			result = result + str.substring(i, end);
		}
		return result;
	}

}
