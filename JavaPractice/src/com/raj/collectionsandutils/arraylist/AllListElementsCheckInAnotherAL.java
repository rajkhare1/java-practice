package com.raj.collectionsandutils.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AllListElementsCheckInAnotherAL {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// adding elements  to the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList: "+al);
		
		List<String> list = new ArrayList<String>();
		list.add("Random");
		list.add("Second");
		System.out.println("List: "+list);
		
		System.out.println("Now we'll check if all of List elements inside the ArrayList or not?...");
		System.out.println(al.containsAll(list));
		
		System.out.println("So we found all the elments...now we add one more element in the List...");
		list.add("differentElement");
		System.out.println("List: "+list);
		
		System.out.println("Now we'll check again if all of List elements inside the ArrayList or not?...");
		System.out.println(al.containsAll(list));
	}
	
}
