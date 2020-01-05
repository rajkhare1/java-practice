package com.raj.collections.collection.list.linkedlist;

import java.util.LinkedList;

public class ClearMyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		// adding elements to the end
		ll.add("First");
		ll.add("Second");
		ll.add("Third");
		ll.add("Random");
		System.out.println("LinekdList: "+ll);
		System.out.println("Now deleting all elments from LinkedList::: ");
		ll.clear();
		System.out.println("LinekdList: "+ll);
	}
}
