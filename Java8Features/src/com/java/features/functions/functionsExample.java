package com.java.features.functions;

import java.util.function.Function;

public class functionsExample {

	public static void main(String[] args) {
		Function<String,String> upperCaseFunction =  name -> name.toUpperCase();
		System.out.println(upperCaseFunction.apply("Pradeep"));
	}

}
