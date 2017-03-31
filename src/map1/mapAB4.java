package map1;

import java.util.Map;

/**
 * Modify and return the given map as follows: if the keys "a" and "b" have
 * values that have different lengths, then set "c" to have the longer value. If
 * the values exist and have the same length, change them both to the empty
 * string in the map.
 * 
 * mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c":
 * "aaa"} mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb",
 * "c": "bbb"} mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c":
 * "bbb"}
 */
public class mapAB4 {
	public Map<String, String> mapAB4(Map<String, String> map) {
		int lena = -1, lenb = -1;
		if (map.containsKey("a")) {
			lena = map.get("a").length();
		}
		if (map.containsKey("b")) {
			lenb = map.get("b").length();
		}

		if (lena >= 0 && lenb >= 0 && lena == lenb) {
			map.put("a", "");
			map.put("b", "");
		}
		if (lena >= 0 && lenb >= 0 && lena > lenb)
			map.put("c", map.get("a"));
		else if (lena >= 0 && lenb >= 0 && lena < lenb)
			map.put("c", map.get("b"));

		return map;
	}

}
