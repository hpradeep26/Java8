package com.java.features;

import java.util.stream.IntStream;

public class SumofNumberUsingJava8 {

	public static void main(String[] args) {
		
		//Before Java 8
		int total=0;
		for(int i=1;i<=50;i++) {
			total += i;
		}
		System.out.println("Total = "+ total);
		
		//After java 8
		int sum = IntStream.rangeClosed(1, 50)
			.map(Integer::valueOf)
			.sum();
		System.out.println("Total = "+ sum);
	}

}
