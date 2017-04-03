package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Boolean> where each different
 * string is a key and its value is true if that string appears 2 or more times
 * in the array.
 * 
 * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
 * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */
public class wordMultiple {
	public Map<String, Boolean> wordMultiple(String[] strings) {
		boolean isFalse = false;
		Map<String, Boolean> map = new HashMap<String, Boolean>();

		for (String str : strings) {
			if (map.containsKey(str)) {
				map.put(str, stringOccurance(strings, str));
			} else
				map.put(str, isFalse);
		}

		return map;
	}

	public boolean stringOccurance(String[] strings, String str) {
		int c = 0;
		for (String strSearch : strings) {
			if (strSearch == str)
				c++;
		}
		if (c >= 2)
			return true;

		return false;
	}
}
