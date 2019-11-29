package com.raj.collectionsandutils.vector;

import java.util.Arrays;
import java.util.Vector;

public class MyVectorArrayCopy {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector: "+vct);
		
		//copy vector to array
		String[] copyArr = new String[vct.size()];
		vct.copyInto(copyArr);
		System.out.println("Copied Array: "+Arrays.toString(copyArr));
	}
}
