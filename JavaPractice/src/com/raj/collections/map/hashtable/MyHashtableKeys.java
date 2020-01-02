package com.raj.collections.map.hashtable;

import java.util.Hashtable;
import java.util.Set;

public class MyHashtableKeys {

	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		//add key-value pair to Hashtable
		ht.put("first", "FIRST INSERTED");
		ht.put("second", "SECOND INSERTED");
		ht.put("third", "THIRD INSERTED");
		System.out.println(ht);
		Set<String> keys = ht.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
	}
}
