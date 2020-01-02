package com.raj.collections.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListNewCollection {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// adding element to the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList: "+al);
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		al.addAll(list);
		System.out.println("After adding another collection to the ArrayList: "+al);
		System.out.println("...See it added to the end of arraylist!!!");
		
	}
}
