package com.example.shapes;

import java.util.Scanner;

public class Circle {
	public void areaOfCircle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your circle radius: ");
		int num = scan.nextInt();
		System.out.println(3.14*(num*num));
	}
}
