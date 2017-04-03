package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Loop over the given array of strings to build a result string like this: when
 * a string appears the 2nd, 4th, 6th, etc. time in the array, append the string
 * to the result. Return the empty string if no string appears a 2nd time.
 * 
 * wordAppend(["a", "b", "a"]) → "a" wordAppend(["a", "b", "a", "c", "a", "d",
 * "a"]) → "aa" wordAppend(["a", "", "a"]) → "a"
 */
public class wordAppend {
	public String wordAppend(String[] strings) {
		StringBuilder str = new StringBuilder();
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < strings.length; i++) {
			if (map.containsKey(strings[i])) {
				if ((map.get(strings[i]) + 1) % 2 == 0) {
					map.put(strings[i], map.get(strings[i]) + 1);
					str.append(strings[i]);
				} else
					map.put(strings[i], map.get(strings[i]) + 1);
			} else
				map.put(strings[i], 1);
		}

		return str.toString();
	}

}
