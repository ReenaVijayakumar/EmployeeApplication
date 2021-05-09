package com.training.primitives;

public class ArithmeticOperation {
	int number1 ;
	int number2 ;
	void Add() {
		int sum = number1 + number2;
		System.out.println(sum);
	}
	void sub() {
		int minus = number1 - number2;
		System.out.println(minus);
	}
	public static void main(String[] args) {
		ArithmeticOperation obj = new ArithmeticOperation();
		obj.number1 = 5;
		obj.number2 = 4;
		obj.Add();
		obj.sub();
	}

}
