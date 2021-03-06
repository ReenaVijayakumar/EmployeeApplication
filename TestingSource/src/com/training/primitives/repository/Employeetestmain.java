package com.training.primitives.repository;

import com.training.primitives.Employee;

import com.training.primitives.IncorrectIDFormatException;

import com.training.primitives.repository.Employe;

import java.util.Map;

public class Employeetestmain {

	public static void main(String[] args) {

		System.out.println("1.Create a New Employee");

		Employeeservice employeeservice = new Employeeservice();

		Employee employee = new Employee();

		employee.setName("christ");

		employee.setId(1090);

		employeeservice.createemployee(employee);
		System.out.println("2.Find All Employee");

		Map<Integer, Employee> employees = employeeservice.findAllEmployee();

		for (Map.Entry<Integer, Employee> c : employees.entrySet()) {

			System.out.println(c.getKey() + ": " + c.getValue());

		}

		System.out.println("3.Find A employee By Given Id");

		int id = 1;

		try {

			Employee foundemployee = employeeservice.findCarById(id);

			System.out.println(foundemployee);

		} catch (IncorrectIDFormatException e) {

		}

		System.out.println("4.Update A employee By Given Id");

		int updateId = 4;

		Employee newCar = new Employee();

		newCar.setId(900);

		employeeservice.updateemployee(updateId, newCar);

		employees = employeeservice.findAllEmployee();

		for (Map.Entry<Integer, Employee> c : employees.entrySet()) {

			System.out.println(c.getKey() + ": " + c.getValue());

		}

		System.out.println("5.Delete A Employee By Given Id");

		int deleteId = 5;

		employeeservice.deleteemployee(deleteId);

		employees = employeeservice.findAllEmployee();

		for (Map.Entry<Integer, Employee> c : employees.entrySet()) {

			System.out.println(c.getKey() + ": " + c.getValue());

		}

	}

}
