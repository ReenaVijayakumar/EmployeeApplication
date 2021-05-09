package com.training.primitives;

 @SuppressWarnings("serial")
public class IncorrectIDFormatException extends Exception {
	 public IncorrectIDFormatException(){
		 super();
	 }
	public IncorrectIDFormatException(String message) {
		System.out.println("Employee ID not found");
	}

}
