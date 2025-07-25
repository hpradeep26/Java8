package com.java.features.bipredicate;

import java.util.function.BiPredicate;

import com.java.features.repositary.PersonRespositary;

public class BiPredicateExample {

	public static void main(String[] args) {
		BiPredicate<Integer, String> personPredicate = (age,gender) -> age >18 && gender.equals("Male");
		
		PersonRespositary.getAllPerson()
		.stream()
		.forEach( p -> {
			if(personPredicate.test(p.getAge(), p.getGender())) {
				System.out.println(p.getName());
			}
		});

	}

}
