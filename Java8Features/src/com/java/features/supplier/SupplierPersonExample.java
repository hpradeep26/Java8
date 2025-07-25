package com.java.features.supplier;

import java.util.List;
import java.util.function.Supplier;

import com.java.features.repositary.Person;
import com.java.features.repositary.PersonRespositary;

public class SupplierPersonExample {

	static Supplier<Person> supplier = () -> PersonRespositary.getPerson();
	static Supplier<List<Person>> supplier1 = () -> PersonRespositary.getAllPerson();
	public static void main(String[] args) {
		System.out.println(supplier.get());
		System.out.println(supplier1.get());
	}

}
