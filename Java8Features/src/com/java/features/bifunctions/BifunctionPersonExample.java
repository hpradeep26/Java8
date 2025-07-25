package com.java.features.bifunctions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.java.features.repositary.Person;
import com.java.features.repositary.PersonRespositary;

public class BifunctionPersonExample {
	
	static BiFunction<List<Person>,Predicate<Person>, Map<String,List<String>>> bf1 = (personList, predicate) -> {
		Map<String,List<String>> map = new HashMap<>();
		personList.forEach(per -> {
		 if(predicate.test(per))
			map.put(per.getName(), per.getHobbies());
		});
		return map;
	};
	
	static Predicate<Person> predicateAge = per -> per.getAge() < 30;

	public static void main(String[] args) {
		System.out.println(bf1.apply(PersonRespositary.getAllPerson(), predicateAge));
	}

}
