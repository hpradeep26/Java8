package com.java.features.supplier;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Double> sup = () -> Math.random();
		System.out.println(sup.get());
	}

}
