package com.Tak;

import java.util.HashSet;


public class HashSetExm {
	static HashSet<String> hs = new HashSet<String>();
	
	
	public void uniqueElement() {
		for(String st:hs) {
			System.out.println(st);
		}
	}
	public void presentElement(String s) {
		if(hs.contains(s))
			System.out.println("The String is present");
		else
			System.out.println("it is not present");
	}
	public static void main(String[] args) {
		hs.add("krupa kiran");
		hs.add("bhavanya");
		hs.add("nikita");
		hs.add("naidu");
		hs.add("sankar");
		
		hs.add("krupa kiran");
		hs.add("naidu");
		hs.add("sankar");
		new HashSetExm().uniqueElement();
		new HashSetExm().presentElement("krupa kiran");
	}

}
