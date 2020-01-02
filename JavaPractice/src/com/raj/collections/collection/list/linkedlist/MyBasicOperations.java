package com.raj.collections.collection.list.linkedlist;

import java.util.LinkedList;

public class MyBasicOperations {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Orange");
		li.add("Apple");
		li.add("Grape");
		li.add("Banana");
		System.out.println(li);
		System.out.println("Size of linked list: "+li.size());
		System.out.println("Is LinkedList Empty? "+li.isEmpty());
		System.out.println("Does LinkedList contains 'Grape' ? "+li.contains("Grape"));
	}
}
