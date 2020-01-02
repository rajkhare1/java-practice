package com.raj.collections.map.hashtable;

import java.util.Hashtable;

public class MyHashtableValueSearch {

	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		//add key-value pair to Hashtable
		ht.put("first", "FIRST INSERTED");
		ht.put("second", "SECOND INSERTED");
		ht.put("third", "THIRD INSERTED");
		System.out.println(ht);
		if(ht.containsValue("SECOND INSERTED")) {
			System.out.println("The Hashtable contains value SECOND INSERTED");
		}else {
			System.out.println("The Hashtable does not contains value SECOND INSERTED");
		}
		if(ht.containsValue("first")) {
			System.out.println("The Hashtable contains value first");
		}else {
			System.out.println("The Hashtable does not contains value first");
		}
	}
}
