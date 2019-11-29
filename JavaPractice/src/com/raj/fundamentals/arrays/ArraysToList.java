package com.raj.fundamentals.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysToList {
   public static void main(String[] args) {
	 String[] strArr;
	 strArr = new String[5];
	  strArr[0] = "JAVA";
	  strArr[1] = "C++";
	  strArr[2] = "PERL";
	  strArr[3] = "STRUTS";
	  strArr[4] = "PLAY";
	  System.out.println("strArr:: "+Arrays.toString(strArr)+" Size of array: "+strArr.length);
	  
	  //now convert arrays into List
	  
	  List<String> strList = Arrays.asList(strArr);
	  System.out.println("Created List Size: "+strList.size());
	  System.out.println(strList);
}
}
