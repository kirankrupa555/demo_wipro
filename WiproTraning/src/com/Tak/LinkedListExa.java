package com.Tak;

import java.util.LinkedList;

public class LinkedListExa {
	static LinkedList<Student> ll = new LinkedList<Student>();
	public static void addStudent(Student s) {
		ll.add(s);	
	}
	public static void removeById(Integer id) {
		for(Student s:ll) {
			if(s.getId()==id) {
				ll.remove(s);
			}
		}
	}
	public static void getByName(String s) {
		for(Student st:ll) {
			if(st.getName().equals(s))
				System.out.println(st.getId()+" "+st.getName()+" "+st.getGrade());
		}
	}
	public static void main(String[] args) {
		addStudent(new Student(1,"kiran","A++"));
		addStudent(new Student(3,"naidu","B++"));
		addStudent(new Student(2,"sanker","B++"));
		removeById(3);
		getByName("kiran");
		System.out.println(ll);
		
	}

}
