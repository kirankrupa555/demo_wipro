package com.milestone;


import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[4];
		for(int i=0;i<arr.length;i++) {
			arr[i]= scanner.nextInt();
		}
		int target = scanner.nextInt();
		for(int i=1;i<arr.length;i++) {
			if((arr[i]+arr[i-1])==target) {
				System.out.println((i-1)+" "+i);
			}
		}

	}

}
