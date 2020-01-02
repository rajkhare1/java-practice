package com.raj.collections.map.hashtable;

import java.util.Hashtable;

public class MyHashtableOperations {
	
	public static void main(String[] args) {
		//Creating hashtable instance
		Hashtable<String,String> ht = new Hashtable<String,String>();
		//Add key-value pair to hashtable
		ht.put("first", "FIRST INSERTED");
		ht.put("second", "SECOND INSERTED");
		ht.put("third", "THIRD INSERTED");
		System.out.println(ht);
		//getting value for the given key from hashtable
		System.out.println("Value of key 'second' :"+ht.get("second"));
		System.out.println("Is hastable empty?"+ht.isEmpty());
		
		//remove value by passing key
		System.out.println("Removing the value...");
		ht.remove("third");
		System.out.println(ht);
		System.out.println("Size of hashtable:"+ht.size());
	}

}
