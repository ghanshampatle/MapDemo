//TreeMap is sorted based on key

package com.treemap;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(70, "lakhan");
		tm.put(30, "gopal");
		tm.put(40, "shyam");
		tm.put(60, "shubham");
		//direct way 
		System.out.println(tm);
	}

}
