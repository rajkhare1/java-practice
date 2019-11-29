package com.raj.collectionsandutils.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class MyHashtableEnumaration {
	
	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		//add the key-value to Hashtable
		ht.put("first", "FIRST INSERTED");
		ht.put("second", "SECOND INSERTED");
		ht.put("third", "THIRD INSERTED");
		Enumeration<String> keys = ht.keys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println("Value of key "+key+" is: "+ht.get(key));
		}
	}
}
