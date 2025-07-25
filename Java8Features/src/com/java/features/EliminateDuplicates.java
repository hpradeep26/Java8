package com.java.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EliminateDuplicates {

	public static void main(String[] args) {
		
		//before
		List<String> nameList = Arrays.asList("Peter","sam","sam");
		List<String> uniqueList = new ArrayList<>();
		for (String string : nameList) {
			if(!uniqueList.contains(string)) {
				uniqueList.add(string);
			}
		}
		System.out.println(uniqueList);
		
		//After
		
		List<String> nameList1 = Arrays.asList("Peter","sam","sam");
		List<String> distinctList = nameList1.stream()
		.distinct()
		.collect(Collectors.toList());
		System.out.println(distinctList);
	}

}
