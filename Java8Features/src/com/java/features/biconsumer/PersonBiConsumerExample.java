package com.java.features.biconsumer;

import java.util.List;
import java.util.function.BiConsumer;

import com.java.features.repositary.PersonRespositary;

public class PersonBiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<String, List<String>> biConsumer = (name, hobbies) -> System.out.println(name +" "+ hobbies);
		PersonRespositary.getAllPerson()
		.forEach(p -> biConsumer.accept(p.getName(), p.getHobbies()));
		
		BiConsumer<String, List<String>> biConsumer1 = BiConsumerInterfaceExample::showDetails;
		PersonRespositary.getPerson();
		biConsumer1.accept(PersonRespositary.getPerson().getName(), PersonRespositary.getPerson().getHobbies());
	}

}
