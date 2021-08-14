package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		int[] myIntArray = new int[10];
		myIntArray[4] = 48;
		int number = myIntArray[4];
		
		//another way to do this 
		int[] myOtherIntArray = {1,2,3,4,5,6,7,8,9,10};
		int num = 459874;
		for(int i=0; i<=myOtherIntArray.length; i++) {

			System.out.println(num +"*"+ i+" = "+num*i);
			
		}
		
	}
	
}
