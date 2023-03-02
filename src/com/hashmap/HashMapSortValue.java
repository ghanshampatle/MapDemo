//1. Suppose I have Map<String,Integer> contain key as Ram, Sohan, Ashok, Ajay, Prasanna
//and value is 3,2,1,6,5 now I want to sort the value from map and print it.
package com.hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortValue {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Ram", 3);
		map.put("Sohan", 2);
		map.put("Ashok", 1);
		map.put("Ajay", 6);
		map.put("Prasanna", 5);
		
		Set<Entry<String, Integer>> entry = map.entrySet();
		
		List<Entry<String,Integer>> list = new LinkedList<Entry<String,Integer>>();
		
		
		
	}

}
