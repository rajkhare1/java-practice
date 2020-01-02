package com.raj.collections.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// adding elements to the end
		al.add("Java");
		al.add("Cric");
		al.add("Play");
		al.add("Watch");
		al.add("Glass");
		al.add("Movie");
		al.add("Girl");
		System.out.println("ArrayList: "+al);
		
		System.out.println("Now we'll swap the value Java with Girl...");
		Collections.swap(al, 0, 6);
		System.out.println("ArrayList: "+al);
		
		
	}
}
