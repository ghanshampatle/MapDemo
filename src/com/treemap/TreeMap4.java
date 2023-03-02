package com.treemap;

import java.util.TreeMap;

public class TreeMap4 {
	public TreeMap getTreeMapData() {
		TreeMap tm = new TreeMap();
		tm.put(60, "raghav");
		tm.put(20, "pune");
		tm.put(30, "nagpur");
		tm.put(100, "delhi");
		return tm;
	}
	public static void main(String[] args) {
		TreeMap4 tree = new TreeMap4();
		TreeMap t = tree.getTreeMapData();
		System.out.println(t);
	}

}
