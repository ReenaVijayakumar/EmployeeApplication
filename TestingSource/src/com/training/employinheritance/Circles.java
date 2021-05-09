package com.training.employinheritance;

public class Circles implements Calculation {
	
		@Override
	public void Print() {
		// TODO Auto-generated method stub
			System.out.println("Circle shape");
	}

		@Override
		public void calculate() {
			// TODO Auto-generated method stub
				int radius= 10;
				 int Area= (int) (3.14*radius*radius);
				 System.out.println("Area of circle is" + " " +Area);
			}
		}


