package com.Treeset;

import java.util.Comparator;

public class StidComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStid().compareTo(o2.getStid());
	}

}
