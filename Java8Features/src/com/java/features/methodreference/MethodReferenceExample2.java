package com.java.features.methodreference;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java.features.repositary.Person;
import com.java.features.repositary.PersonRespositary;

public class MethodReferenceExample2 {
	
	static Function<String, String> f1 = name -> name.toUpperCase();
	static Function<String, String> f2 = String::toUpperCase;
	
	static Predicate<Person> p1 = per -> per.getAge() > 30;
	static Predicate<Person> p2 = MethodReferenceExample2::ageCheck;
	static BiPredicate<Person,Integer> p3 = MethodReferenceExample2::ageCheckwithParam;
	

	public static void main(String[] args) {
		System.out.println("Using Lamba Expression "+ f1.apply("Constants"));
		System.out.println("Using Method Refernce "+ f2.apply("Constants"));
		
		System.out.println("Using Lamba Expression "+ p1.test(PersonRespositary.getPerson()));
		System.out.println("Using Method Refernce "+ p2.test(PersonRespositary.getPerson()));
		System.out.println("Using Method Refernce "+ p3.test(PersonRespositary.getPerson(),35));
	}
	
	static boolean ageCheck(Person per) {
		return per.getAge() > 30;
	}
	
	static boolean ageCheckwithParam(Person per,Integer age) {
		return per.getAge() > age;
	}
}
