package com.raj.fundamentals.loops;

public class SimpleForLoop {
	public static void main(String[] args) {
	   for(int i = 1; i <=10; i++) {
		   System.out.print(i+" ");
	   }
	   System.out.println();
	   /**
	    * Another example increase by 2 steps
	    */
	   for(int i=1; i<=10; i =  i+2) {
		   System.out.print(i+" ");
	   }
	   System.out.println();
	   /**
	    * below loops print numbers in reverse order
	    */
	   for(int i = 10; i>=1; i--) {
		   System.out.print(i+" ");
	   }
}
}
