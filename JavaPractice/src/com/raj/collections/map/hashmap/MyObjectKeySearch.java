package com.raj.collections.map.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyObjectKeySearch {

	public static void main(String[] args) {
		HashMap<Price1,String> hm = new HashMap<Price1,String>();
		hm.put(new Price1("Banana", 20),"Banana");
		hm.put(new Price1("Apple", 40),"Apple");
		hm.put(new Price1("Orange", 20),"Orange");
		printMap(hm);
		Price1 key = new Price1("Banana",20);
		System.out.println("Does key availabe? "+hm.containsKey(key));
	}
	
	public static void printMap(HashMap<Price1,String> map) {
        
		Set<Price1> keys = map.keySet();
		for(Price1 key: keys) {
			System.out.println(key+" ==> "+map.get(key));
		}
	
	}
}








class Price1{
	private String item;
	private int price;
	
	public Price1(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}

	@Override
	public int hashCode() {
		System.out.println("In hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price1 other = (Price1) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price1 [item=" + item + ", price=" + price + "]";
	}
	
	
	
	
	
	
}