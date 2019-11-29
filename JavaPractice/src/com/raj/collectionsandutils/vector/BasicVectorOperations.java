package com.raj.collectionsandutils.vector;

import java.util.Vector;

public class BasicVectorOperations {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		//adding element to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		System.out.println(vct);
		
		//adding element at specified index
		vct.add(2, "Random");
		System.out.println(vct);
		
		//getting element by index
		System.out.println("Element at index 3 is: "+vct.elementAt(3));
		
		//getting first element
		System.out.println("The first element of the vector is: "+vct.firstElement());
		
		//getting last element
		System.out.println("The last element of the vector is: "+vct.lastElement());
		
		//how to check vector is empty or not
		System.out.println("Is this vector is empty? "+vct.isEmpty());
	}
}
