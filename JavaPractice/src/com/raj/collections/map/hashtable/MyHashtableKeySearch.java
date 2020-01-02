package com.raj.collections.map.hashtable;

import java.util.Hashtable;

public class MyHashtableKeySearch {

	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		//add key-value pair to hashtable
		ht.put("first", "FIRST INSERTED");
		ht.put("second", "SECOND INSERTED");
		ht.put("third", "THIRD INSERTED");
		System.out.println(ht);
		
		//search specific key in hashtable
		if(ht.containsKey("first")) {
			System.out.println("The Hashtable contains key 'first'");
		} else {
			System.out.println("The Hashtable does not contains key 'first'");
		}
		if(ht.containsKey("fifth")) {
			System.out.println("The Hashtable contains key 'fifth'");
		}else {
			System.out.println("The Hashtable does not contains key 'fifth'");
		}
	}
}
