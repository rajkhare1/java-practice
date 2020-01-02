package com.raj.collections.collection.list.vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class MyVectorNewCollection {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		//adding element to  the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Randon");
		System.out.println("Actual vector: ");
		Iterator<String> itr = vct.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<String> list = new ArrayList<String>();
		//adding element to the end
		list.add("Item1");
		list.add("Item2");
		list.add("Item3");
		
		vct.addAll(list);
		System.out.println("After copy: ");
		ListIterator<String> litr = vct.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
	}
}
