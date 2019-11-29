package com.raj.fundamentals.arrays;

import java.util.Arrays;

public class MyArraySort {
    public static void main(String[] args) {
		int[] myArr;
		myArr = new int[7];
		myArr[0] = 3;
		myArr[1] = 2;
		myArr[2] = 56;
		myArr[3] = 12;
		myArr[4] = 98;
		myArr[5] = 23;
		myArr[6] = 56;
		System.out.println(Arrays.toString(myArr));
		Arrays.sort(myArr);
		System.out.println("myArr after sort "+Arrays.toString(myArr));
		
		
		
	}
}
