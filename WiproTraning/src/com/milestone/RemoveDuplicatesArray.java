package com.milestone;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs.size());
	}

}
