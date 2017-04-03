package map2;

import java.util.HashMap;
import java.util.Map;

/**
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.

firstSwap(["ab", "ac"]) → ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
 */
public class firstSwap {
	public String[] firstSwap(String[] strings) {
		 Map<String,Integer> map= new HashMap<String,Integer>();
				
				
				  for(int i=0;i<strings.length;i++){
					  if( !map.containsKey( Character.toString( strings[i].charAt(0) ) ) )
				    map.put(Character.toString(strings[i].charAt(0)),i);
				  }
				  
				  for(int i=0;i<strings.length;i++){
					  String key=Character.toString(strings[i].charAt(0));
					  int value=map.get( Character.toString( strings[i].charAt(0) ) );
				    if(map.containsKey(key) && value!=-1 && value!=i) {
				        swap(strings,value,i);
				        map.put( key,-1 )  ; 
				    }
				    else if(map.get(key)!=value && map.get(key)!=-1)
				    map.put(key,i);
				  }
		  
		  return strings;
		}

		public void swap(String[] str,int i, int j){
				String temp;
				temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
}
