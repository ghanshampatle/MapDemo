package com.LinkedHashMap;
// insertion order is preserved
//null insertion is possible
import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(100, "Shyam");
		lhm.put(20, "vikash");
		lhm.put(30, "gopal");
		lhm.put(null, null);
		
		//direct way
		System.out.println(lhm);
	}

}
