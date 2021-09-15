package com.keytech;

public class ScopeCheck {

	public int publicVar = 0;
	private int varOne = 1;
	
	public ScopeCheck(){
		System.out.println("ScopeCheck created, publicVar = "+publicVar+": varThree = "+varOne);
	}

	public int getVarOne() {
		return varOne;
	}
	
	public void timesTwo() {
		int varTwo = 2;
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" times "+ this.varOne+" is "+i*this.varOne);
		}
	}
	
	public void useInner() {
		InnerClass innerClass = new InnerClass();
		System.err.println("varThree from outer class: "+innerClass.varThree);
	}
	
	public class InnerClass{
		private int varThree = 3;

		public InnerClass() {
			System.out.println("Inner class created varThree is "+varThree);
		}
		
		public void timesTwo() {
			System.out.println("VarOne is still available here");
			for (int i = 0; i < 10; i++) {
				System.out.println(i+" times "+ varThree+" is "+i*varThree);
			}
		}
		
	}
	
}
