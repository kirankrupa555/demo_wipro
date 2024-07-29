package com.milestone;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void verifyAnagram(String st1, String st2) {
		String s1 = st1.replaceAll("\\s", "").toLowerCase();
		String s2 = st2.replaceAll("\\s", "").toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("it is a anagram");
		}
		else {
			System.out.println("not a anagram");
		}
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String st1 = in.nextLine();
		String st2 = in.nextLine();
		verifyAnagram(st1,st2);
	}

	
}
