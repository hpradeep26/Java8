package com.java.features.functions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java.features.repositary.Person;
import com.java.features.repositary.PersonRespositary;

public class FunctionPersonExample {

	public static void main(String[] args) {
		Function<String, Integer> f1 = name -> name.length();
		Integer length = f1.apply("Hello");
		System.out.println(length);
		
		Predicate<Person> p1 = per -> per.getAge()>30;
		
		Function<List<Person>,Map<String,List<String>>> personf2 = personList -> {
			Map<String,List<String>> map = new HashMap<>();
			personList.forEach(per -> {
			 if(p1.test(per))
				map.put(per.getName(), per.getHobbies());
			});
			return map;
		};
		
		Map<String, List<String>> apply = personf2.apply(PersonRespositary.getAllPerson());
		System.out.println(apply);
	}

}
