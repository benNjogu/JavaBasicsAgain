package com.keytech;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ben","Njau", "Kamande","Muiruri", "Wanjiru","Wangui");
		
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
			
		};
		names.forEach(consumer);
	}
	
}
