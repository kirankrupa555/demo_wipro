package com.Tak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ArrayListTask {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(52);
		al.add(54);
		al.add(14);
		al.add(57);
		al.add(46);
		al.add(7);
		al.add(4);
		al.add(9);
		al.add(78);
		al.add(4);
		Collections.sort(al);
		System.out.println("the minimum value is: "+al.get(0));
		System.out.println("the maximum value is: "+al.get(al.size()-1));
		
		System.out.println("sorted in ascending order: "+al);
		Collections.reverse(al);
		System.out.println("sorted in reverse order: "+al);
		
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>(al);
		al.clear();
		for(Integer o : s) {
			al.add(o);
		}
		Collections.sort(al);
		System.out.println("After deleting duplicates: "+al);
	}
}
