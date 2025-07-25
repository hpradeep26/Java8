package com.java.features.consumer;

import java.util.List;
import java.util.function.Consumer;

import com.java.features.repositary.Person;
import com.java.features.repositary.PersonRespositary;

public class ConsumerPersonExample {

	static Consumer<Person> c1 = (p) -> System.out.println(p);
	static Consumer<Person> c2 = (p) -> System.out.println(p.getName().toUpperCase());
	static Consumer<Person> c3 = (p) -> System.out.println(p.getHobbies());
	public static void main(String[] args) {
		
		c1.accept(PersonRespositary.getPerson());
		c2.accept(PersonRespositary.getPerson());
		c3.accept(PersonRespositary.getPerson());
		
		c1.andThen(c2).andThen(c3).accept(PersonRespositary.getPerson());
		
		List<Person> allPerson = PersonRespositary.getAllPerson();
		
		allPerson.stream().forEach(c3);
		
		allPerson.stream().forEach(p -> {
			if(p.getGender().equals("Male")) {
				c2.accept(p);
			}
		});
	}

}
