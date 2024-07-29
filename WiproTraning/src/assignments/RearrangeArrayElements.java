package assignments;

import java.util.Scanner;

public class RearrangeArrayElements {
	 
	
	 public void inputAcceptor() {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		 int size = in.nextInt();
		 if(inputArraySizeValidator(size))
		 {
			 int[] input = new int[size];
			 System.out.print("Enter the elements of the array: ");
		     for (int i = 0; i < size; i++) {
		    	 input[i] = in.nextInt();
		      }
			if(inputArrayValidator(input)) {
				int[] result = computeRearrangedArray(input);
		        displayResult(result);
			}
			else {
				System.out.println("Enter elements in sorting order");
			}
		 }
		 else {
			 System.out.println("Give array size atleast one");
		 }
		 
	 }
	
	 public boolean inputArraySizeValidator(int size) {
		 return size>0;
	 }
	 
	 public boolean inputArrayValidator(int[] input) {
	       for(int i=1;i<input.length;i++) {
	    	   if(input[i]<input[i-1]) {
	    		   return false;
	    	   }
	       }
	       return true;
	 }
	 
	 public int[] computeRearrangedArray(int[] inputArray) {
		 int[] result = new int[inputArray.length];
	        int left = 0;
	        int right = inputArray.length - 1;
	        boolean maxTurn = true;

	        for (int i = 0; i < inputArray.length; i++) {
	            if (maxTurn) {
	                result[i] =inputArray[right--];
	            } else {
	                result[i] =inputArray[left++];
	            }
	            maxTurn = !maxTurn;
	        }

	        return result;
	 }
	
	 public void displayResult(int[] outputArray) {
		 if (outputArray == null) {
	            System.out.println("Give proper input");
	        } else {
	            for (int element :outputArray) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	 }
	 public static void main(String[] args) {
		 RearrangeArrayElements obj = new RearrangeArrayElements();
		 obj.inputAcceptor();
	 }
	}
