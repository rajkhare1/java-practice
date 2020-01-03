package com.raj.collections.collection.list.linkedlist;

import java.util.LinkedList;

public class CloneOrCopyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		// adding element to the end
		li.add("First");
		li.add("Second");
		li.add("Third");
		li.add("Random");
		System.out.println("LinkedList: "+li);
		System.out.println("Now Copy or Clone to LinkedList in another LinkedList::::");
		LinkedList<String> cloneLinkedList = (LinkedList<String>) li.clone();
		System.out.println("cloneLinkedList: "+cloneLinkedList);
	}
}
