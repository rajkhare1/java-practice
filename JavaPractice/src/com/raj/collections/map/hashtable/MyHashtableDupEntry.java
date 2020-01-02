package com.raj.collections.map.hashtable;

import java.util.Hashtable;
import java.util.Set;

public class MyHashtableDupEntry {

	public static void main(String[] args) {
		
		Hashtable<Empl, String> ht = new Hashtable<Empl, String>();
		ht.put(new Empl(134,100000,"Raj"), "RAJ");
		ht.put(new Empl(234,80000,"Rahul"), "RAHUL");
		ht.put(new Empl(334,45000,"Richa"), "RICHA");
		ht.put(new Empl(434,110000,"Sia"), "SIA");
		System.out.println("Adding duplicate entry:");
		ht.put(new Empl(434,110000,"Sia"), "SIA");
		System.out.println("Hashtable entries:");
		Set<Empl> keys = ht.keySet();
		for(Empl key: keys) {
			System.out.println(key+" ==> "+ht.get(key));
		}
		System.out.println("Duplicate got elminated!!!");
	}
}

class Empl{
	private int id;
	private int salary;
	private String name;
	
	public Empl(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Empl [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("In hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
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
		Empl other = (Empl) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	
	
	
	
}
