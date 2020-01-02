package com.raj.collections.collection.list.arraylist;

import java.util.ArrayList;

public class ClearMyArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// adding elements to the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList: "+al);
		al.clear();
		System.out.println("ArrayList after clear :"+al);
	}
}
