package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap3 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		lhm.put("ram", 100);
		lhm.put("shubham", 120);
		lhm.put("vaibhav", 130);
		
		Set<String> s = lhm.keySet();
		//by using for each loop
		for(String str:s) {
			System.out.println(str);
			System.out.println(lhm.get(str));
		}
	
	}

}
