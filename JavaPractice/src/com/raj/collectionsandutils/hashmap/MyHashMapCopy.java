package com.raj.collectionsandutils.hashmap;

import java.util.HashMap;

public class MyHashMapCopy {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		//add key-value to the HashMap
		hm.put("first","FIRST INSERTED");
		hm.put("second","SECOND INSERTED");
		hm.put("third","THIRD INSERTED");
		System.out.println(hm);
		HashMap<String,String> subMap = new HashMap<String,String>();
		subMap.put("s1", "S1 VALUE");
		subMap.put("s2", "S2 VALUE");
		System.out.println("Putting subMap with the HashMap...");
		hm.putAll(subMap);
		System.out.println(hm);
	}
}
