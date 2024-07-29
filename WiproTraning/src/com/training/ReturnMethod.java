package com.training;

public class ReturnMethod {
	
	public void test(int a) {
	 System.out.println("Krupa kiran");
	 System.out.println(a);
	 System.out.println("nikita");
	 System.out.println(a/0);
	 System.out.println("shinde");
	 
	}

	public static void main(String[] args) {
		System.out.println("main method start");
		new ReturnMethod().test(4); 
		System.out.println("main method end");

	}

}
