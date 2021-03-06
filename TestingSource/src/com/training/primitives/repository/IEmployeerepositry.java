package com.training.primitives.repository;

import java.util.Map;

import com.training.primitives.Employee;


public interface IEmployeerepositry {
	
	public void add(Employee emname);
	public Map<Integer, Employee> findAll();
	public Employee findById(int id);
	public void update(int id, Employee employee);
	public void delete(int id);
}
