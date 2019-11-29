package com.raj.fundamentals.arrays;

import java.util.Arrays;

public class MyArrayCopy {
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
		
		System.out.println("array size before copy: "+myArr.length);
		
		int[] newArr = Arrays.copyOf(myArr, 10);
		System.out.println("array size before copy: "+newArr.length+"--"+Arrays.toString(newArr));
	}
}
