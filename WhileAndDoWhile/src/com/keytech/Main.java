package com.keytech;

public class Main {

	public static void main(String[] args) {
		int count=0;
		while(count != 6) {
			System.out.println("Count value is "+count);
			count++;//-->By removing this it becomes an endless loop
		}
		System.out.println("****************");//using break
		count = 1;
		while(true) {
			if(count==6) {

				break;
			}
			System.out.println("Count value is "+count);
			count++;
		}
		System.out.println("****************");//do while
		count=6;
		do {
			System.out.println("Count value is "+count);
			count++;
			if(count>100) {
				break;
			}
			
		}while(count != 6);
		
	}
	
}
