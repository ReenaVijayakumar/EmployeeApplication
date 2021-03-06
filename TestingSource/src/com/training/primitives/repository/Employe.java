package com.training.primitives.repository;

import java.util.HashMap;

//import java.util.HashSet;

import java.util.Iterator;

import java.util.Map;

import java.util.Map.Entry;

//import java.util.Set;

import com.training.primitives.Employee;

import com.training.primitives.Department;

public class Employe implements IEmployeerepositry {

	private static Map<Integer, Employee> employeeMap;

	public Employe() {

		Employee employee1 = new Employee("RIO", 1150);

		Employee employee2 = new Employee("George", 250);

		Employee employee3 = new Employee("John", 100);

		Employee employee4 = new Employee("Riya", 350);

		Department department = new Department();

		department.setId(1);
		department.setName("Developer");
		employee1.setDepartm(department);
		Department department1 = new Department();
		department1.setId(2);
		department1.setName("Tester");
		employee2.setDepartm(department1);
		Department department2 = new Department();
		department2.setId(3);
		department2.setName("HPSM");
		employee3.setDepartm(department2);
		Department department3 = new Department();
		department3.setId(4);
		department3.setName("WJA");
		employee4.setDepartm(department3);

		employeeMap = new HashMap<>();

		employeeMap.put(1, employee1);

		employeeMap.put(2, employee2);

		employeeMap.put(3, employee3);

		employeeMap.put(4, employee4);

	}

	@Override
	public void add(Employee emname) {

		int id = employeeMap.size() + 1;

		employeeMap.put(id, emname);

	}

	@Override
	public Map<Integer, Employee> findAll() {

		return employeeMap;

	}

	@Override

	public Employee findById(int id) {

		Employee employee = null;

		for (Map.Entry<Integer, Employee> c : employeeMap.entrySet()) {

			if (c.getKey() == id) {

				employee = c.getValue();

			}

		}

		return employee;

	}

	@Override
	public void update(int id, Employee employee) {

		for (Map.Entry<Integer, Employee> c : employeeMap.entrySet()) {

			if (c.getKey() == id) {

				c.getValue().setId(employee.getId());

			}

		}

	}

	@Override

	public void delete(int id) {

		Iterator<Entry<Integer, Employee>> it = employeeMap.entrySet().iterator();

		while (it.hasNext()) {

			Entry<Integer, Employee> entry = it.next();

			if (entry.getKey() == id) {

				it.remove();

			}

		}

	}

}
