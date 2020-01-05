package com.raj.collections.collection.list.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class CopyLinkedListToArray {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		// adding elements to the end
		ll.add("First");
		ll.add("Second");
		ll.add("Third");
		ll.add("Random");
		System.out.println("LinkedList: "+ll);
		
	 	String[] strArr = new String[ll.size()];
	 	ll.toArray(strArr);
	 	System.out.println("String Array: "+Arrays.deepToString(strArr));
				
	}
}
