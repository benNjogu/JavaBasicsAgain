package com.keytech;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		for(int i=0; i<values.size(); i++) {
			System.out.println(values.get(i));
		}
	}

}
