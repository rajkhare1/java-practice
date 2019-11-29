package com.raj.fundamentals.arrays;

import java.util.Arrays;

public class MyArrayFill {
   public static void main(String[] args) {
	  String[] myArr;
	  myArr = new String[10];
	  Arrays.fill(myArr, "Assigned");
	  for(String srt : myArr) {
		  System.out.println(srt);
	  }
}
}
