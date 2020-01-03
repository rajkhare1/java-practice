package com.raj.collections.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ReadAllElmentsByIterator {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		// adding elements to the end
		li.add("First");
		li.add("Second");
		li.add("Third");
		li.add("Random");
		System.out.println("Reading all elments using Iterator...");
		Iterator<String>  itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
