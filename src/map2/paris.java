package map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of non-empty strings, create and return a Map<String, String>
 * as follows: for each string add its first character as a key with its last
 * character as the value.
 * 
 * pairs(["code", "bug"]) → {"b": "g", "c": "e"} pairs(["man", "moon", "main"])
 * → {"m": "n"} pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n",
 * "n": "t"}
 */
public class paris {
	public Map<String, String> pairs(String[] strings) {
		Set<String> set = new HashSet<String>(Arrays.asList(strings));
		Map<String, String> map = new HashMap<String, String>();

		for (String str : set) {
			map.put(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(str.length() - 1)));
		}
		return map;
	}

}
