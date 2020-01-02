package com.raj.collections.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SuffleArrayLIst {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// Adding elements to the end
		al.add("Java");
		al.add("Cric");
		al.add("Play");
		al.add("Watch");
		al.add("Glass");
		al.add("Movie");
		al.add("Girl");
		System.out.println("ArrayList: "+al);
		System.out.println("Now see the magic i gonna to suffle above list...");
		Collections.shuffle(al);
		System.out.println("ArrayList: "+al);
		
		
		System.out.println("Now see the magic i gonna to suffle above list...");
		Collections.shuffle(al);
		System.out.println("ArrayList: "+al);
		
	}
}
