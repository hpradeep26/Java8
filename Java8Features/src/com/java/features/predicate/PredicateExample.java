package com.java.features.predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> agePredicateLessthan50 = a -> (a<50);
		Predicate<Integer> agePredicateGreaterthan50 = a -> (a>50);
		Predicate<Integer> agePredicateEquals50 = a -> (a==50);
		
		System.out.println(agePredicateLessthan50.test(48));
		System.out.println(agePredicateGreaterthan50.test(48));
		System.out.println(agePredicateGreaterthan50.test(48));
		
		
		System.out.println(agePredicateLessthan50.or(agePredicateEquals50).test(50));
		System.out.println(agePredicateLessthan50.and(agePredicateEquals50).test(50));
		System.out.println(agePredicateLessthan50.negate().test(50));

	}

}
