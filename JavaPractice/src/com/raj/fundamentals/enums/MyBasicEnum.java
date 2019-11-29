package com.raj.fundamentals.enums;

public class MyBasicEnum {
	private Fruits myFruits;
	
	public MyBasicEnum(Fruits myFruits) {
		super();
		this.myFruits = myFruits;
	}
	
public void getFruitDesc() {
	switch(myFruits) {
	case GRAPE:
		System.out.println("A grape is non-climacteric fruit.");
		break;
	case APPLE:
		System.out.println("The apple is a pomaceous fruit.");
		break;
	case MANGO:
		System.out.println("The mango is a fleshy stone fruit.");
		break;
	case LEMON:
		System.out.println("Lemons are slow growing varieties of citrus.");
		break;
	default:
		System.out.println("No desc available for "+myFruits);
		break;
	}
}





	public static void main(String[] args) {
		MyBasicEnum grape =  new MyBasicEnum(Fruits.GRAPE);
		grape.getFruitDesc();
		
		MyBasicEnum apple = new MyBasicEnum(Fruits.APPLE);
		grape.getFruitDesc();
		
		MyBasicEnum mango = new MyBasicEnum(Fruits.MANGO);
		mango.getFruitDesc();
		
		MyBasicEnum lemon = new MyBasicEnum(Fruits.LEMON);
		lemon.getFruitDesc();
		
		MyBasicEnum guava = new MyBasicEnum(Fruits.GUAVA);
		guava.getFruitDesc();
		
		
	}
}

enum Fruits{
	GRAPE, APPLE, MANGO, LEMON, GUAVA
}