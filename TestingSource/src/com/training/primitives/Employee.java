package com.training.primitives;

public class Employee {

	private int empid;
	private String empname;
	private Department department;
	public Employee() {
	}
	public Employee	(String empname,int empid) {
		this.empname = empname;
		this.empid = empid;
	}
	public void setName(String empname) {
		this.empname = empname;
	}
	public String getName() {
		return empname;
	}
	public void setId(int empid) {
		this.empid = empid;
	}
	public int getId() {
		return empid;
	}
	public void setDepartm(Department department) {
		this.department= department;
	}
	public Department getpart() {
		return department;
	}
	
	public String toString() {

		return "Name : " + empname + " ID : " + empid +" Department :"+ department;
}
}
