package com.hashmap;

import java.util.HashMap;

public class HashMap4 {
	
	public static HashMap<String,Integer> getHashMapData(){
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		hs.put("Shyam", 10);
		hs.put("ram", 20);
		hs.put("krushna", 30);
		return hs;
	}
	
	public static void main(String []args) {
		HashMap h = getHashMapData();
		System.out.println(h);
		
	}

}
