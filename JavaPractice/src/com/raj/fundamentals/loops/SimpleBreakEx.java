package com.raj.fundamentals.loops;

public class SimpleBreakEx {
   public static void main(String[] args) {
	for(int i =0; i<10; i++) {
		if(i==5) {
			System.out.println("breaking the loop...");
			break;
		}
		System.out.println(i);
	}
}
}
