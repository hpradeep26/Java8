package com.java.features.repositary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonRespositary {
	
	public static Person getPerson() {
		return new Person("Pradeep", 34, "Male", Arrays.asList("Cricker","Dancing","Coding"));
	}
	
	public static List<Person> getAllPerson() {
		List<Person> list = new ArrayList<>();
		Person p1 = new Person("Pradeep", 34, "Male", Arrays.asList("Cricker","Trading","Coding"));
		Person p2 = new Person("Sudha", 30, "Female", Arrays.asList("Singing","Cooking"));
		Person p3 = new Person("Aradhya", 02, "Female", Arrays.asList("Sleeping","Playing"));
		Person p4 = new Person("Sachin", 35, "Male", Arrays.asList("Cricker","football"));
		list.add(p4);
		list.add(p3);
		list.add(p2);
		list.add(p1);
		return list;
	}

}
