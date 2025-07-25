package com.java.features.LambdaExpression;

public class RunnableLambdaExamples {

	public static void main(String[] args) {
		//Before
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread - 1");
				
			}
		};
		new Thread(runnable).start();
	
	//After
	Runnable runnable1 = () -> System.out.println("Thread - 2"); 
	new Thread(runnable1).start();
	
	//before
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Thread - 3");
			
		}
	}).start();
	
	// After
	new Thread(()-> {
		System.out.println("Thread - 4");
		System.out.println("Thread - 4.1");
		}).start();
	}	
}
