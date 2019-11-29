package com.raj.fundamentals.arrays;

import java.util.Arrays;

public class BinarySearchOnCharArray {
   public static void main(String[] args) {
	 char charArr[];
	 charArr = new char[7];
	 charArr[0] = 'a';
	 charArr[1] = 'c';
	 charArr[2] = 'd';
	 charArr[3] = 'y';
	 charArr[4] = 'e';
	 charArr[5] = 'q';
	 charArr[6] = 'b';
	 
	 System.out.println("charArrr:: "+Arrays.toString(charArr));
	 
	 //finding the index using the binary search algo
	 int index = Arrays.binarySearch(charArr, 0, charArr.length -1, 'z');
	 System.out.println("char q index is:: "+index);
	 
	 for(int i =0; i<charArr.length ; i++) {
		 System.out.println(charArr[i]);
	 }
	 
}
}
