package com.keytech;

public class Challenge3 {

	public static void main(String[] args) {
		
	}
	
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	
}
