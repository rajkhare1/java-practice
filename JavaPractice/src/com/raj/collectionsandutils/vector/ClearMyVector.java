package com.raj.collectionsandutils.vector;

import java.util.Vector;

public class ClearMyVector {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		//adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector: "+vct);

		//delete all elements from the vector
		vct.clear();
		
		System.out.println("After clear vecotr: "+vct);
		
	}
}
