package com.milestone;

import java.util.Scanner;

public class ConcusiveCharacters {
	public static void SequenceCharacters(String s) {
		StringBuffer sb = new StringBuffer();
		int count = 1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
			else {
				sb.append(s.charAt(i-1)).append(count);
				count = 1;
			}
		}
		sb.append(s.charAt(s.length()-1)).append(count);
		System.out.println(sb);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		SequenceCharacters(str);
	}

}
