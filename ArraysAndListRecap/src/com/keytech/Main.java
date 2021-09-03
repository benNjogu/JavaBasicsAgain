package com.keytech;

import java.util.ArrayList;

class IntClass{
	
	private int myValue;

	public IntClass(int myValue) {
		super();
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		String[] sArray = new String[10];
		int[] nums = new int[10];
		
		ArrayList<IntClass> iList = new ArrayList<>();
		iList.add(new IntClass(12));
		Double double1 = new Double(12.34);
		
		ArrayList<Integer> integers = new ArrayList<>();
		for(int i=0; i<=10; i++) {
			integers.add(Integer.valueOf(i));
		}
		for(int i=0; i<=10; i++) {
			System.out.println(i+" --> "+integers.get(i).intValue());
		}
		
		Integer value = 57;
		int myInt = value;
	}
	
}
