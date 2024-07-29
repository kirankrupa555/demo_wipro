package assignments;

import java.util.Scanner;

public class Palindrome {
	public void checkPalindrome(Long num) {
		long temp = num;
		long res = 0;
		long sum = 0;
		while(temp>0) {
			long rem = temp%10;
			if(rem%2==0) {
				sum += rem;
			}
			res = (res*10)+rem;
			temp /=10;
		}
		if(res==num) {
			if(sum>25)
			System.out.println(num+" is palindrome and the sum of even numbers is greater than 25");
			else
				System.out.println(num+" is palindrome and sum of even numbers is less than25");
		}
		else {
			System.out.println(num +" not a palindrome");
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long num = in.nextLong();
		new Palindrome().checkPalindrome(num);

	}

}
