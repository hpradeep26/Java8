package com.java.features.bifunctions;

import java.util.function.BiFunction;

public class BiFunctionExample {

	static BiFunction<String, String, String> bf1 = 
			(firstName,lastName) -> firstName.concat(" ").concat(lastName);
	public static void main(String[] args) {
		System.out.println(bf1.apply("Pradeep", "Huded"));
	}

}
