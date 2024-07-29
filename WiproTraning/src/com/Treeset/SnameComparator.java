package com.Treeset;

import java.util.Comparator;

public class SnameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getSname().compareTo(o1.getSname());
	}

}
