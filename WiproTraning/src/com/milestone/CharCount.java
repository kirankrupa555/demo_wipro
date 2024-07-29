package com.milestone;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CharCount {
	public static void countcharacter(String s) {
		char[] c= s.toCharArray();
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(Character ch : c) {
			lhs.add(ch);
		}
		System.out.println(lhs);
		for(Character chare : lhs) {
			int count = 0;
			for(Character cha :c) {
				if(chare==cha) {
					count++;
				}
			}
		 al.add(count);
		}
		System.out.println(al);
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		countcharacter(str);
	}

}
