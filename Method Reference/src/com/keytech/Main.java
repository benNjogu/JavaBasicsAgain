package com.keytech;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ben","Njau", "Kamande","Muiruri", "Wanjiru","Wangui");
		
		names.forEach(str -> System.out.println(str));
	}
	
}
