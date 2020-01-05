package com.raj.collections.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IsLinkedLIstContainsAllListElements {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		// adding elements  to the end
		ll.add("First");
		ll.add("Second");
		ll.add("Third");
		ll.add("Random");
		System.out.println("LinkedList: "+ll);
		
		List<String> li = new ArrayList<String>(List.of("Second","Random"));
		System.out.println("List: "+li);
		System.out.println("Is LinkedList contains ALL List elments? "+ll.containsAll(li));
		
		System.out.println("Now we add one more different element to the list");
		li.add("Raj");
		System.out.println("List: "+li);
		System.out.println("Is LinkedList contains  ALL List elments? "+ll.containsAll(li));
	}
}
