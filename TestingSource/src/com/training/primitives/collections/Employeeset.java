package com.training.primitives.collections;

import com.training.primitives.Employee;
import java.util.HashSet;

public class Employeeset {
	public static void main(String[] args) {
		
	HashSet<Employee> Employees = new HashSet<Employee>();
	Employee employee1 = new Employee("RIO",1);
	Employee employee2 = new Employee("George",2);
	Employee employee3 = new Employee("Georges",21);
	Employee employee4 = new Employee("John",20);
	
	System.out.println(employee1.hashCode());

	System.out.println(employee2.hashCode());
	
	System.out.println(employee3.hashCode());
	
	System.out.println(employee4.hashCode());
	
	Employees.add(employee1);

	Employees.add(employee2);
	
	Employees.add(employee3);
	
	Employees.add(employee4);
}
}
