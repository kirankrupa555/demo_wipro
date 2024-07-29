package com.milestone;

public class ReverseStringRecursion {
	public String reverseString(String s) {
		if(s.isEmpty())
			return s;
		return (s.substring(1)+s.charAt(0));
	}
	public static void main(String[] args) {
		System.out.println(new ReverseStringRecursion().reverseString("Hello"));
	}

}
 