package com.raj.collections.collection.list.arraylist;

import java.util.ArrayList;

public class MyArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// adding element to the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual arraylis: "+al);
		ArrayList<String> copy = (ArrayList<String>) al.clone();
		System.out.println("Cloned ArrayList: "+copy);
	}
}
