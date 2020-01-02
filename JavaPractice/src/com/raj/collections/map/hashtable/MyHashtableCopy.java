package com.raj.collections.map.hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class MyHashtableCopy {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		// add the key-value pair to hashtable
		ht.put("first", "FIRST INSERTED");
		ht.put("second", "SECOND INSERTED");
		ht.put("third", "THIRD INSERTED");
		System.out.println(ht);
		HashMap<String, String> subMap = new HashMap<String, String>();
		subMap.put("s1", "S1 VALUE");
		subMap.put("s2", "S2 VALUE");
		ht.putAll(subMap);
		System.out.println(ht);
	}
}
