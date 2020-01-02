package com.raj.collections.map.hashmap;

import java.util.HashMap;

public class MyBasicHashMap {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		//add key-value pair to HashMap
		hm.put("first","FIRST INSERTED");
		hm.put("second","SECOND INSERTED");
		hm.put("third","THIRD INSERTED");
		System.out.println(hm);
		
		//getting value from given key from HashMap
		System.out.println("Second of second: "+hm.get("second"));
		
		//checking the isEmpty()
		System.out.println("Is HashMap empty? "+hm.isEmpty());
		
		//remove value by passing key to HashMap
		System.out.println("removing the value...");
		hm.remove("third");
		System.out.println("removed the value!");
		System.out.println(hm);
		
		//checking the no. of elements in HashMap
		System.out.println("Size of the HashMap: "+hm.size());
		
				
		
	}
}
