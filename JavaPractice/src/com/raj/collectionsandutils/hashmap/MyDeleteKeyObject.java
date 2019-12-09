package com.raj.collectionsandutils.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyDeleteKeyObject {

	public static void main(String[] args) {
	HashMap<Price2,String> hm = new HashMap<Price2,String>();
	hm.put(new Price2("Banana",20),"Banana");
	hm.put(new Price2("Apple",40),"Apple");
	hm.put(new Price2("Orange",30),"Orange");
	printMap(hm);
	Price2 key = new Price2("Banana",20);
	System.out.println("Deleting key...");
	hm.remove(key);
	System.out.println("After deleting key...");
	printMap(hm);
		
	}
	public static void printMap(HashMap<Price2,String> map) {
		Set<Price2> keys = map.keySet();
		for(Price2 key: keys) {
			System.out.println(key+" ==> "+map.get(key));
		}
	}
}

class Price2{
	private String item;
	private int price;
	public Price2(String item, int price) {
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
		Price2 other = (Price2) obj;
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
		return "Price2 [item=" + item + ", price=" + price + "]";
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
