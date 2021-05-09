package com.training.employinheritance;

public class Circle extends Shape{

	
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		int radius= 2;
		 float Area= (float) (3.14*radius*radius);
		 System.out.println("Area of circle is" + " " +Area);
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		circle.calculateArea();
		
	}
}
