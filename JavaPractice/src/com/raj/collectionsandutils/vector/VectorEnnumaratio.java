package com.raj.collectionsandutils.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnnumaratio {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		//adding element at the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		
		//iterate through  Enumeration
		Enumeration<String> enm  = vct.elements();
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}
}
