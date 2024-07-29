package com.Treeset;

import java.util.TreeMap;

public class TreeMapEX {
	public static void main(String[] args) {
		TreeMap<Student,Integer> tm = new TreeMap<Student, Integer>(new SnameComparator());
		
		tm.put(new Student(27,"kiran"), -3);
		tm.put(new Student(73,"Rk"), 500);
		tm.put(new Student(52,"Naidu"), 10);
		
		System.out.println(tm);
		
	}
}
