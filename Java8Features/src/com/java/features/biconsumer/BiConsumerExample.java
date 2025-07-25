package com.java.features.biconsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> additionBiConsumer = (a,b) -> System.out.println("Addition of 2 - " + (a+b));
		BiConsumer<Integer, Integer> subBiConsumer = (a,b) -> System.out.println("substraction of 2 - " + (a-b));
		BiConsumer<Integer, Integer> multiplyBiConsumer = (a,b) -> System.out.println("Addition of 2 - " + (a*b));
		
		additionBiConsumer.accept(10, 20);
		subBiConsumer.accept(20, 10);
		multiplyBiConsumer.accept(3, 3);
		
		additionBiConsumer.andThen(subBiConsumer).andThen(multiplyBiConsumer).accept(30, 30);
		
		List<Integer> alist1 = Arrays.asList(1,2,3,4);
		List<Integer> alist2 = Arrays.asList(5,6,7,8);
		
		BiConsumer<List<Integer>, List<Integer> > disp = (list1, list2) ->
        {
            list1.stream().forEach(a -> System.out.print(a + " "));
            System.out.println();
            list2.stream().forEach(a -> System.out.print(a + " "));
            System.out.println();
        };
        
        BiConsumer<List<Integer>, List<Integer>> equals = (l1,l2) -> {
        	if(l1.size()==l2.size())
        		System.out.println("True");
        	else 
        		System.out.println("False");
        };
        equals.accept(alist1, alist2);
        disp.accept(alist1, alist2);

	}

}
