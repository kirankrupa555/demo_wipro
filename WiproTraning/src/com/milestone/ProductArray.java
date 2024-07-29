package com.milestone;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArray {
	public static void productArray(int []arr) {
		int []res  = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int product =1;
			for(int j=0;j<arr.length;j++) {
				if(j==i) {
					continue;
				}
				else {
					product *= arr[j];
				}
				
			}
			res[i]=product;
		}
		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		productArray(arr);
	}

}
