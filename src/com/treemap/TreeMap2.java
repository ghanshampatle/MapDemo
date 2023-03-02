package com.treemap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.put("shyam", "patle");
		tm.put("akash", "kale");
		tm.put("ashok", "sharma");
		
		Set<String> s = tm.keySet();
		System.out.println(s);
		//by using iterator 
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println("key>>"+str);
			System.out.println("Value>>"+tm.get(str));
			
		}
	}

}
