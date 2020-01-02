package com.raj.collections.map.hashtable;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashtableEntrySet {

	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		//add key-value pair to Hashtable
		ht.put("first", "FIRST INSERTED");
		ht.put("second", "SECOND INSERTED");
		ht.put("third", "THIRD INSERTED");
		System.out.println(ht);
		
		//getting key-value from Hashtable using EntrySet
		Set<Entry<String,String>> entries = ht.entrySet();
		for(Entry<String,String> ent: entries) {
			System.out.println(ent.getKey()+"==>"+ent.getValue());
		}
	}
}
