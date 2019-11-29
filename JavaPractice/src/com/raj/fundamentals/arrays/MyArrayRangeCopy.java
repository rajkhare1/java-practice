package com.raj.fundamentals.arrays	;

import java.util.Arrays;

public class MyArrayRangeCopy {
    public static void main(String[] args) {
		int[] myArr;
		myArr = new int[7];
		myArr[0] = 2;
		myArr[1] = 4;
		myArr[2] = 2;
		myArr[3] = 4;
		myArr[4] = 5;
		myArr[5] = 6;
		myArr[6] = 3;
		System.out.println("My arrays elements: \n");
		for(int num: myArr) {
			System.out.print(num+" ");
		}
		int[] newArr = Arrays.copyOfRange(myArr, 1, 4);
		System.out.println("\nMy new arrays elements: \n");
		for(int num: newArr) {
			System.out.print(num+" ");
		}
	}
}
