package com.raj.collectionsandutils.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListToCsv {

	public static void main(String[] args) {
		ArrayList<String> al =  new ArrayList<String>();
		//adding elements to the end
		al.add("Java");
		al.add("Spring MVC");
		al.add("Spring Boot");
		al.add("RESTful Web Services");
		
		ListToCsv objListToCsv = new ListToCsv();
		System.out.println(objListToCsv.getListAsCsvString(al));
		
		ArrayList<String> al2 = new ArrayList<String>(List.of("One","Two","Three"));
		System.out.println(objListToCsv.getListAsCsvString(al2));
		
	}
	
	public String getListAsCsvString(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for(String str: list) {
			if(sb.length()!=0) {
				sb.append(",");
			}
			sb.append(str);
		}
		return sb.toString();
	}
}
