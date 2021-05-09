package com.training.primitives;

public class EmployeeArray {
	
	public static void main(String[] args) {
		
		String[] empname = {"Rio","George","Gail"};
		int[] empid = {234,345,657};
		Employee[] mploye = new Employee[3];
		for(int i=0;i<mploye.length;i++) {
			mploye[i] = new Employee (empname[i] , empid[i]);
		}
	}

}
