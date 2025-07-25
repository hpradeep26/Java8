package com.java.features.LambdaExpression;

import java.util.Comparator;

public class ComparatorLamabaExample {

	public static void main(String[] args) {
		//Before
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		int compare = comparator.compare(10, 10);
		System.out.println(compare);
		//After
		//Type 1
		Comparator<Integer> comparator2 = (x,y) -> {return x.compareTo(y); };
		int compare2 = comparator2.compare(20, 10);
		System.out.println(compare2);
		//type 2
		Comparator<Integer> comparatorType2 = (Integer x, Integer y) -> x.compareTo(y);
		int compare3 = comparatorType2.compare(20, 50);
		System.out.println(compare3);
		
	}

}
