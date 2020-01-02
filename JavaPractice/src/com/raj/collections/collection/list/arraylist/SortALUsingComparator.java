package com.raj.collections.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SalaryComparator implements Comparator<Employee>{
// here we put our own logic for sorting
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary() < e2.getSalary()) {
			return 1;
		}else {
			return -1;
		}
	}}

public class SortALUsingComparator {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		// adding elements to the end
	    employees.add(new Employee("Raj Khare",100000));
	    employees.add(new Employee("Prasanta Paul",50000));
	    employees.add(new Employee("Richa",200000));
	    employees.add(new Employee("Sia",40000));
	   System.out.println("Sorting the Employee list...");
	   Collections.sort(employees, new SalaryComparator());
	   for ( Employee employee : employees) {
		System.out.println(employee);
	}
		
	}
}

class Employee {
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
