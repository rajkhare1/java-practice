package com.raj.collections.collection.list.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		//adding element at the end
		vct.add("First");
		vct.add("Secong");
		vct.add("Third");
		vct.add("Random");
		
		//iterate the vector
		Iterator<String> itr = vct.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
