package com.Treeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExam {
	public static void main(String[] args) {
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		h.put("kiran",27);
		h.put("RK", 73);
		h.put("Sanker",58);
		h.put("naidu",52);
		
		for(Map.Entry m :h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
