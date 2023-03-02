package com.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMap3 {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("shyam", "patle");
		hm.put("aman", "yelekar");
		hm.put("ram ", "patil");
		
		Set<String> s = hm.keySet();
		
		for(String str : s) {
			System.out.println(str);
			System.out.println(hm.get(str));
		}
	}

}
