package com.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap4 {
	public LinkedHashMap getLinkedHashMap() {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(20, "shyam");
		lhm.put(30, "ram");
		lhm.put(40,"bhupesh");
		
		return lhm;
	}
	public static void main(String[]args) {
		LinkedHashMap4 linked = new LinkedHashMap4();
		LinkedHashMap link = linked.getLinkedHashMap();
		System.out.println(link);
		
	}
}
