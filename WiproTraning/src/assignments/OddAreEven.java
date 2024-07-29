package assignments;

import java.util.Scanner;

public class OddAreEven {
	public void checkEvenOdd(int n) {
		if(n>=20 && n<=30) {
			if(n%2==0) {
				System.out.println("Jerry");
			}
			else {
				System.out.println("TOM");
			}
		}
		else {
			System.out.println("invalid number please enter the number between 20 to 30");
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number between 20 to 30");
		int n = in.nextInt();
		new OddAreEven().checkEvenOdd(n);

	}

}
