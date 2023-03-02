package com.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<Integer,Integer>();
		lhm.put(10, 120);
		lhm.put(20, 230);
		lhm.put(30, 150);
		lhm.put(50, 60);
		
		Set<Integer> s = lhm.keySet();
		//by using iterator 
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println("Key>>"+i);
			System.out.println("Value>>"+lhm.get(i));
		}
	}

}
