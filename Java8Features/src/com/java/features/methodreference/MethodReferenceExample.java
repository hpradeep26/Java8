package com.java.features.methodreference;

import java.util.Comparator;

public class MethodReferenceExample {
	
	public static void main(String[] args) {
		MethodReferenceExample.compare(10, 20);
		Comparator<Integer> comparator = MethodReferenceExample::compare;
		int compare = comparator.compare(11, 8);
		System.out.println(compare);
	}
	
	public static int compare(Integer x,Integer y) {
		return x.compareTo(y);
	}

}
