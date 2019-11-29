package com.raj.collectionsandutils.hashtable;

import java.util.Hashtable;
import java.util.Set;

public class MyHashtableRead {

	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		//add key-value pair to hashtable
		ht.put("first", "FIRST INSERTED");
		ht.put("second", "SECOND INSERTED");
		ht.put("third", "THIRD INSERTED");
		System.out.println(ht);
		
		//iterate the hashtable
		Set<String> keys = ht.keySet();
		for (String key : keys) {
			System.out.println("value of key '"+key+"' is: "+ht.get(key));
		}
	}
}
