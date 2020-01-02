package com.raj.collections.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// adding elements to the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("ArrayList: "+al);
		
		System.out.println("Now convert it into Array...");
		
		String[] arr = new String[al.size()];
		al.toArray(arr);
		System.out.println("Array: "+Arrays.toString(arr));
		
	}
}
