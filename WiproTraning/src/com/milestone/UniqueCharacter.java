package com.milestone;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharacter {
	public static void firstNonRepeatingString(String str) {
	    LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
	    char[] charArray = str.toCharArray();
	    for (char character : charArray) {
	        if (lhm.get(character) == null) {
	            lhm.put(character, 1);
	        } else {
	            lhm.put(character, lhm.get(character) + 1);
	        }
	    }

	    for (Map.Entry<Character, Integer> entry : lhm.entrySet()) {
	        if (entry.getValue() == 1) {
	            System.out.print(entry.getKey());
	            break;
	        }
	    }
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		firstNonRepeatingString(str);
}
}
