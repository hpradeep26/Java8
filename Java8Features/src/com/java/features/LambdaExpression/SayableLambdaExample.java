package com.java.features.LambdaExpression;

public class SayableLambdaExample {

	public static void main(String[] args) {
		Sayable  sayable = () -> {
		return "I have Nothing to Say";
		};
		
		System.out.println(sayable.say());
	}
	

}
