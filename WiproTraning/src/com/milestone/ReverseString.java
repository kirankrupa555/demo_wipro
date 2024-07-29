package com.milestone;

public class ReverseString {
	
	public void reverseString(String s) {
		String result = "";
		for(int i=(s.length()-1);i>=0;i--) {
			result += s.charAt(i);
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		new ReverseString().reverseString("Hello");;
	}
}
