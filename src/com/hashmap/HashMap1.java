package com.hashmap;
//here insertion order is not preserved
//store the object in key value pair.
//null insertion is possible in HashMap
//key has a unique value
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		 HashMap hm = new HashMap();
		 hm.put(10, "Shyam");
		 hm.put(20, "Akshay");
		 hm.put(30, "Sagar");
		 hm.put(05, "Rupesh");
		 hm.put(15, "shubham");
		 hm.put(null, null);
		 
		 //by using direct way
		 System.out.println(hm);
		 //step 1  set value of object first in set
		 Set s = hm.keySet(); // // set is interface
		 //by using iterator
		 //step 2 iterator
		 Iterator itr =s.iterator();
		 while(itr.hasNext()) {
			 Object a = itr.next();
			 System.out.println("key >>"+a);
			 System.out.println("value>>"+hm.get(a));
		 }
		
		 
		 
		 
	}

}
