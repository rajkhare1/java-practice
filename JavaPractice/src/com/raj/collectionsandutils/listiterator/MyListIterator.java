package com.raj.collectionsandutils.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(23);
		li.add(98);
		li.add(29);
		li.add(71);
		li.add(5);
		
		ListIterator<Integer> liItr = li.listIterator();
		System.out.println("Elements in forword direction");
		while(liItr.hasNext()) {
			System.out.println(liItr.next());
		}
		System.out.println("Elements in backward direction");
		while(liItr.hasPrevious()) {
			if(29 == liItr.previous()){
				liItr.remove();
			}
		}
		
		while(liItr.hasNext()) {
			if(98 == liItr.next()){
				liItr.remove();
			}
		}
			System.out.println(li);
	}
}
