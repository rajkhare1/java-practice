package com.raj.collections.collection.list.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyElementCheck {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		
		List<String> list = new ArrayList<String>();
		list.add("Second");
		list.add("Random");
		
		System.out.println("Does vector contains all list element? "+vct.containsAll(list));
		
		list.add("one");
		System.out.println("List: "+list);
		
		System.out.println("Does vector contains all list element? "+vct.containsAll(list));
	
		
		
	}
}
