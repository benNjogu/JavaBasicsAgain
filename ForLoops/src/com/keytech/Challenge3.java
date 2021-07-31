package com.keytech;

public class Challenge3 {

	public static void main(String[] args) {
		
		int count = 0;
		for(int i=10; i<50; i++) {
			if(isPrime(i)) {
				count++;
				System.out.println("Number "+i+" is a prime number");
				if(count==10) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		
		}
		else {
			//this minimizes number of loops it has to loop
			for(int i=2;i<=(double)Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	
}
