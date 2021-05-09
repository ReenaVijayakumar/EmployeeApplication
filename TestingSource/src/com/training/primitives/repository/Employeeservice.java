package com.training.primitives.repository;

import java.util.Map;

 import com.training.primitives.Employee;
 
 import com.training.primitives.IncorrectIDFormatException;
 
 import com.training.primitives.repository.Employe;

public class Employeeservice {
	
	private Employe employe;



	public Employeeservice() {

		 employe = new Employe();

	}



	public void createemployee(Employee employee) {

		employe.add(employee);

	}







	public Map<Integer, Employee> findAllEmployee() {

		return employe.findAll();

	}



	public Employee findCarById(int id) throws IncorrectIDFormatException {

		Employee employee = employe.findById(id);

		if (employee == null) {

			throw new IncorrectIDFormatException("Employee ID is not found");

		} else {

			return employee;

		}

	}



	public void updateemployee(int id, Employee employee) {

		employe.update(id, employee);

	}



	public void deleteemployee(int id) {

		employe.delete(id);

	}

}


