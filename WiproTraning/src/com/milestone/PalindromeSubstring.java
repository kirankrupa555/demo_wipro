package com.milestone;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeSubstring {
	public static String longPalindrome(String str) {
		int n = str.length();
		if(n<2) {
			return str;
		}
		boolean[][] b= new boolean[5][5];
		int start =0;
		int maxlength = 1;
		for(int i=0;i<n;i++) {
			b[i][i]=true;
		}
		for(int i=0;i<n-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				b[i][i+1]=true;
				start=i;
				maxlength=2;
			}
		}
		for(int len=3;len<=n;len++) {
			for(int i=0;i<n-len+1;i++) {
				int j=i+len-1;
				if (str.charAt(i) == str.charAt(j) && b[i + 1][j - 1]) {
                    b[i][j] = true;
                    start = i;
                    maxlength = len;
			}
		}
		}
		
			return str.substring(start, start + maxlength);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String result = longPalindrome(str);
		System.out.println(result);
		
	}

}
