package com.raj.collections.collection.list.arraylist;

import java.util.ArrayList;

public class MyBasicArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		//add elements to the ArrayList
		al.add("JAVA");
		al.add("C++");
		al.add("PERL");
		al.add("PHP");
		System.out.println(al);
		//get element by index
		System.out.println("Element at index 1: "+al.get(1));
		//add element at specific index
		al.add(2, "PLAY");
		System.out.println(al);
		System.out.println("Is arraylist empty? "+al.isEmpty());
		System.out.println("Index of PERL is: "+al.indexOf("PERL"));
		System.out.println("Size of the arraylist is: "+al.size());
	}
}
