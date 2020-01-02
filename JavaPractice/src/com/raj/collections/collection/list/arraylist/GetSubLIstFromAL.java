package com.raj.collections.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GetSubLIstFromAL {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// adding elements to the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList: "+al);
		System.out.println("Now get sublist from this ArrayList by passing....");
		System.out.println("start index and end index for sublist...");
		
		//fromIndex: inclusive ; toIndex: exclusive
		List<String> subList = al.subList(0, 2);
		System.out.println("subList: "+subList);
	}
}
