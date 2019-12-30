package com.raj.collectionsandutils.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseALContent {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// adding elements to the end
		al.add("Java");
		al.add("Cric");
		al.add("Play");
		al.add("Watch");
		al.add("Glass");
		System.out.println("Actual ArrayList: "+al);
		System.out.println("Doing reverse of above ArrayList...");
		Collections.reverse(al);
		System.out.println("ArrayList after reverse: "+al);
	}
}
