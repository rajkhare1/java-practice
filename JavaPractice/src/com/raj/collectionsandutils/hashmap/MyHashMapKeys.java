package com.raj.collectionsandutils.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyHashMapKeys {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		//add key-value pair to HashMap
		hm.put("first","FIRST INSERTED");
		hm.put("second","SECOND INSERTED");
		hm.put("third","THIRD INSERTED");
		System.out.println(hm);
		Set<String> keys = hm.keySet();
		System.out.println("Printing all keys from the HashMap:");
		for(String key:keys) {
			System.out.println(key);
		}
	}
}
