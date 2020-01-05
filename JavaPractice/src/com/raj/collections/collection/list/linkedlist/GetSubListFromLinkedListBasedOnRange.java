package com.raj.collections.collection.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class GetSubListFromLinkedListBasedOnRange {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>(List.of("First","Second","Third","Random","Click"));
		System.out.println("LinkedList: "+ll);
		
		List<String> subList = ll.subList(2, 5);
		System.out.println("SubList start(inclusive) from 2 to end 5(last index is exclusive): "+subList);
	}
}
