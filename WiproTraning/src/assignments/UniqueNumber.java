package assignments;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumber {
	public boolean isUnique(int num) {
		int flag = 0;
		String numStr = String.valueOf(num); 
        HashSet set = new HashSet();
        for (char c : numStr.toCharArray()) {
        	if(set.contains(c)) {
        		return false;
        	}
        	set.add(c);
        }
        return true;
        
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = in.nextInt();
        if(num<0) {
        	System.out.println("it not a unique number");
        }
        else {
        	if(new UniqueNumber().isUnique(num)) {
        		System.out.println("it is unique number");
        	}
        	else {
        		System.out.println("it not a unique number");
        	}
        }

	}

}
