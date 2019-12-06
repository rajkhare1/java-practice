package com.raj.collectionsandutils.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyDuplicateKeyEx {

	public static void main(String[] args) {
		HashMap<Price, String> hm = new HashMap<Price, String>();
		hm.put(new Price("Banana", 20), "Banana");
		hm.put(new Price("Apple", 40), "Apple");
		hm.put(new Price("Orange", 30), "Orange");
		printMap(hm);
		
		Price key = new Price("Banana", 20);
		System.out.println("Adding duplicate key...");
		hm.put(key, "Grape");
		System.out.println("After adding duplicate key:");
		printMap(hm);

	}

	public static void printMap(HashMap<Price, String> map) {
		Set<Price> keys = map.keySet();
        for(Price p:keys) {
        	System.out.println(p+" ==> "+map.get(p));
          }
        }
	}

/**
 * @author RK00333040
 *
 */
class Price{
	private String item;
	private int price;
	
	public Price(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price other = (Price) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "Price [item=" + item + ", price=" + price + "]";
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
	
	
	
	
}