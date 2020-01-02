package com.raj.collections.map.hashtable;

import java.util.Hashtable;

public class MyHashtableUserKeys {

	public static void main(String[] args) {
		
		Hashtable<Emp,String> ht = new Hashtable<Emp,String>();
		ht.put(new Emp("Raj",100000,111), "RAJ");
		ht.put(new Emp("Sia",80000,222), "SIA");
		ht.put(new Emp("Rahul",70000,232), "RAHUL");
		ht.put(new Emp("Richa",45000,333), "RICHA");
		System.out.println("Fetching value by creating new key:");
		
		Emp e = new Emp("Richa",45000,333);
		System.out.println(e +"==> "+ht.get(e));
	}
}

class Emp {
	private String name;
	private int salary;
	private int id;
	public Emp(String name, int salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		System.out.println("In equals");
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
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
	
	
}
