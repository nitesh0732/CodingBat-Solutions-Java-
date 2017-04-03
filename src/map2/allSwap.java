package map2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * We'll say that 2 strings "match" if they are non-empty and their first chars
 * are the same. Loop over and then return the given array of non-empty strings
 * as follows: if a string matches an earlier string in the array, swap the 2
 * strings in the array. When a position in the array has been swapped, it no
 * longer matches anything. Using a map, this can be solved making just one pass
 * over the array. More difficult than it looks.
 * 
 * allSwap(["ab", "ac"]) → ["ac", "ab"] allSwap(["ax", "bx", "cx", "cy", "by",
 * "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
 * allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by",
 * "ax", "bx", "aj", "ai", "by", "bx"]
 */
public class allSwap {
	public String[] allSwap(String[] strings) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		if (strings.length > 0)
			map.put(strings[0], 0);
		for (int i = 1; i < strings.length; i++) {
			boolean put = false;
			for (Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext();) {
				Map.Entry<String, Integer> entry = it.next();
				String key = entry.getKey();
				int value = entry.getValue();
				if (key.charAt(0) == strings[i].charAt(0)) {
					swap(strings, i, value);
					put = true;
					it.remove();
				}

			}
			if (!put)
				map.put(strings[i], i);
		}
		return strings;
	}

	public void swap(String[] str, int i, int j) {
		String temp;
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

}
