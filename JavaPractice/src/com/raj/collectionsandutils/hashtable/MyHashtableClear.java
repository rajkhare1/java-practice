package com.raj.collectionsandutils.hashtable;

import java.util.Hashtable;

public class MyHashtableClear {

	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		//add key-value to the Hashtable
		ht.put("first", "FIRST INSERTED");
		ht.put("second", "SECOND INSERTED");
		ht.put("third", "THIRD INSERTED");
		System.out.println("My Hastable content: ");
		System.out.println(ht);
		System.out.println("Clearing Hashtable:");
		ht.clear();
		System.out.println("Content after clear:");
		System.out.println(ht);
	}
}
