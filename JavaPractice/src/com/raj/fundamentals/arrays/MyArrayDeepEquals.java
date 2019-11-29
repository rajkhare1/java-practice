package com.raj.fundamentals.arrays;

import java.util.Arrays;

public class MyArrayDeepEquals {
    public static void main(String[] args) {
		 String[] strArr;
		 strArr = new String[5];
		 strArr[0] = "JAVA";
		 strArr[1] = "C++";
		 strArr[2] = "PERL";
		 strArr[3] = "STRUTS";
		 strArr[4] = "PLAY";
		 System.out.println("strArr:: "+Arrays.toString(strArr));
		 String[] strArrCopy = Arrays.copyOf(strArr, 5);
		 System.out.println("strArrCopy:: "+Arrays.deepToString(strArrCopy));
		 System.out.println("Are strArr and strArrCopy are equal? "+Arrays.deepEquals(strArr, strArrCopy));
		 String[] strArrCopy2 = Arrays.copyOfRange(strArr, 0, 3);
		 System.out.println("strArrCopy2:: "+Arrays.deepToString(strArrCopy2));
		 System.out.println("Are strArr and strArrCopy2 are equal? "+Arrays.deepEquals(strArr, strArrCopy2));
		 
		 
	}
}
