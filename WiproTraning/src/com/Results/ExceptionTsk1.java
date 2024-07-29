package com.Results;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTsk1 {
	public void divideNumbers(){
		try {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int fnum = in.nextInt();
		System.out.println("Enter second numbr: ");
		int snum = in.nextInt();
		int div = fnum/snum;
		System.out.println(div);
		}
		catch(Exception e){
			if(e instanceof ArithmeticException)
				System.out.println("please don't give second number as zero");
			else if (e instanceof InputMismatchException)
				System.out.println("ENter only numbers as  values");
		}
	}

	public static void main(String[] args) {
		new ExceptionTsk1().divideNumbers();
	}

}
