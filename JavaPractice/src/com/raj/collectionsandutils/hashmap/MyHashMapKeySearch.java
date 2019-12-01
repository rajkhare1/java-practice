package com.raj.collectionsandutils.hashmap;

import java.util.HashMap;

public class MyHashMapKeySearch {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		//add key-value pair to HashMap
		hm.put("first","FIRST INSERTED");
		hm.put("second","SECOND INSERTED");
		hm.put("third","THIRD INSERTED");
		System.out.println(hm);
		if(hm.containsKey("first")) {
			System.out.println("The HashMap contains key 'first'");
		} else {
			System.out.println("The HashMap does not contains key 'first'");
		}
		if(hm.containsKey("fifth")) {
			System.out.println("The HashMap contains key 'fifth'");
		} else {
			System.out.println("The HashMap does not contains key 'fifth'");
		}
	}
}
