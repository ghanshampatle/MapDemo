package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(100, "ram");
		hm.put(101, "shyam");
		hm.put(102, "Gopal");
		
		Set<Integer> s =hm.keySet();
		
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println("Key>>"+i);
			System.out.println(("Value>>"+hm.get(i)));
		}
		for(int j:s) {
			System.out.println(j);
			System.out.println(hm.get(j));
		}
	}

}
