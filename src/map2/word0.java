package map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of strings, return a Map<String, Integer> containing a key for
 * every different string in the array, always with the value 0. For example the
 * string "hello" makes the pair "hello":0. We'll do more complicated counting
 * later, but for this problem the value is simply 0.
 * 
 * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0} word0(["a", "b", "a", "c",
 * "b"]) → {"a": 0, "b": 0, "c": 0} word0(["c", "b", "a"]) → {"a": 0, "b": 0,
 * "c": 0}
 */
public class word0 {
	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		Set<String> mySet = new HashSet<String>(Arrays.asList(strings));
		Iterator<String> iterator = mySet.iterator();
		while (iterator.hasNext())
			myMap.put(iterator.next(), 0);
		return myMap;
	}

}
