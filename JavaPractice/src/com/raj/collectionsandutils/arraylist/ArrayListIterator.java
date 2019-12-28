package com.raj.collectionsandutils.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// adding element to the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
