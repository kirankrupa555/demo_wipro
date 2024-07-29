package com.Treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCustomObject {
	public static void main(String[] args) {
		
	
	SortedSet<Student> s = new TreeSet(new SnameComparator());
	
	Student st1 = new Student(500,"Kiran");
	Student st2 = new Student(300,"Krupa");
	Student st3 = new Student(100,"naidu");
	
	 s.add(st1);
	 s.add(st2);
	 s.add(st3);
	 
	 for(Student o: s) {
		 
		 System.out.println(o.getStid()+" "+ o.getSname());
	 }
	}
	
}
