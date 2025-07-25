package com.java.features.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java.features.repositary.Person;
import com.java.features.repositary.PersonRespositary;

public class PredicatePersonExample {

	public static void main(String[] args) {
		Predicate<Person> agePredicate = p -> p.getAge() > 18;
		Predicate<Person> genderPredicate = p -> p.getGender().equals("Male");
		Predicate<Person> hobbPredicate = p -> p.getHobbies().contains("Coding");
		
		List<Person> allPerson = PersonRespositary.getAllPerson();
		
		List<Person> list = allPerson.stream()
		.filter(agePredicate)
		.filter(genderPredicate)
		.filter(hobbPredicate)
		.collect(Collectors.toList());
		
		System.out.println(list);
		
		
	}

}
