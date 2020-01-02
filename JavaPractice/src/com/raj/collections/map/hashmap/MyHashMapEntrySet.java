package com.raj.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashMapEntrySet {

	public static void main(String[] args) {
		HashMap<String,String> hm =  new HashMap<String,String>();
		//add the key-value pair to HashMap
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		Set<Entry<String, String>> entires = hm.entrySet();
		for(Entry<String,String> entry: entires) {
			System.out.println(entry.getKey()+" ==> "+entry.getValue());
		}
		
	}
}
