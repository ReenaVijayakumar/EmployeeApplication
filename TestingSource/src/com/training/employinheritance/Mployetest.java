package com.training.employinheritance;

public class Mployetest {
	
	public static void main(String[] args) {
		Mployee mployee = new Mployee("George","Tester");
		System.out.println("Name of the employee :" +" " +mployee.getName());
		System.out.println("Designation :" + " " +mployee.getdesignation());
		Managerr managerr = new Managerr("Rio","Developer");
		System.out.println("Name of the employee" + " " + managerr.getName());
		System.out.println("Designation :" + " " +managerr.getdesignation());
		
		
	}

}
