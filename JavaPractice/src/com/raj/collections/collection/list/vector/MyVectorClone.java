package com.raj.collections.collection.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class MyVectorClone {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		//adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector: ");
		Enumeration<String> enm = vct.elements();
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
		Vector<String> copy = (Vector<String>) vct.clone();
		System.out.println("Copied vector: ");
		Iterator<String> itr = vct.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//Iterate vector through ListIterator in forward direction
		System.out.println("Iterate vector through ListIterator in forward direction: ");
		ListIterator<String> litr = vct.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("Iterate vector through ListIterator in backward direction: ");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
