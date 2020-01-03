package com.raj.collections.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddListToLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		// add elements to the end
		ll.add("First");
		ll.add("Second");
		ll.add("Third");
		ll.add("Random");
		System.out.println("LinkedList: "+ll);
		
		List<String> li = new ArrayList<String>(List.of("one","two","three","four"));
		System.out.println("List: "+li);
		System.out.println("Now we add List to LinkdList at the end...");
		ll.addAll(li);
		System.out.println("LinkedList: "+ll);
		
	}
}
