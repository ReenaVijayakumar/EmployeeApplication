package com.training.employinheritance;

public class WrapperClass {

public static void main(String[] args) {
	System.out.println(args.length);
	int numbers = 0;
	for(String numbervalue : args) {
		numbers = Integer.parseInt(numbervalue);
		if(numbers%2==0) {
			System.out.println("Even number");
		}
	}
}
}
