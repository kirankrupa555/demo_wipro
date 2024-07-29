package assignments;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter integers separated by spaces (enter q to finish) ");
	        int sum = 0;
	        while (scanner.hasNext()) {
	            if (scanner.hasNextInt()) {
	                int num = scanner.nextInt();
	                sum += num;
	            }
	            else {
	                String input = scanner.next();
	                if (input.equals("q")) 
	                    break;
	                else 
	                System.out.println("Error: is not an integer.");
	               
	                break;
	            
	        }
	}
	        System.out.println("Sum of the integers entered: " + sum);

	}
}
