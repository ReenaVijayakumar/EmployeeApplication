package com.training.primitives;

public class HelloWorld {
	static int[] arr = {1,2,3,4,5,6,7,8,9,10};
	public void method1(int i,int j,int arr[]) {
		if(i<j) {
			if(arr[i]%2==0)
				System.out.println(arr[i]);
			method1(i+1,j,arr);
		}
		else {
			return;
		}
	}
	public static void main(String [] args) {
		HelloWorld ob = new HelloWorld();
		ob.method1(0,10,arr);
		
	}
}

	

		
		
		
	
	
	


