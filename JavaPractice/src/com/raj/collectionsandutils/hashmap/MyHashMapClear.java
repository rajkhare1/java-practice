package com.raj.collectionsandutils.hashmap;

import java.util.HashMap;

public class MyHashMapClear {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		//add key-value pair to HashMap
		hm.put("first","FIRST INSERTED");
		hm.put("second","SECOND INSERTED");
		hm.put("third","THIRD INSERTED");
		System.out.println(hm);
		System.out.println("Deleting all elments from HashMap...");
		hm.clear();
		System.out.println(hm);
	}
}
