package com.raj.collections.map.hashmap;

import java.util.HashMap;

public class MyHashMapValueSearch {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		// add key-value pair to HashMap
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		if (hm.containsValue("FIRST INSERTED")) {
			System.out.println("The HashMap contains value FIRST INSERTED");
		} else {
			System.out.println("The HashMap does not contains value FIRST INSERTED");
		}
		if (hm.containsValue("FIRST")) {
			System.out.println("The HashMap contains the value FIRST");
		} else {
			System.out.println("The HashMap does not contains the value FIRST");
		}

	}
}
