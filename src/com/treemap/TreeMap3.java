package com.treemap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String[] args) {
		TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
		tm.put(10, 30);
		tm.put(20, 40);
		tm.put(50, 100);
		
		Set<Integer> s = tm.keySet();
		System.out.println(tm);
		//for each loop
		for(Integer i : s) {
			System.out.println("Key>>"+i);
			System.out.println("Value>>"+tm.get(i));
		}
	}

}
