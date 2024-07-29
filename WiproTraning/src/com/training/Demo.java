package com.training;

import java.util.Scanner;

public class Demo {
	static int a ;
	public static void isEligible(int a) {
		if(!(a%2 == 0)){
			System.out.println("2 div");
		}
		else {
			System.out.println("invalid");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		isEligible(a);
	}

}
