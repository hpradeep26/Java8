package com.java.features.lambalocalVariable;

import java.util.function.Consumer;

public class LambaLocalVariable {

	public static void main(String[] args) {
		Integer num = 10;
		Consumer<Integer> c1 = i -> {
			//num++;
			System.out.println(num);
		};
		c1.accept(15);
	}

}
