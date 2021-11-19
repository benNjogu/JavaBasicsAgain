package com.keytech;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ben","Njau", "Kamande","Muiruri", "Wanjiru","Wangui");
		
		names.forEach(s -> System.out.println(s));
	}
	
}
