package assignments;

import java.util.Scanner;

public class BankAccount {
	long accountNumber = 12548795424l;
	static long balance = 5000;
	public void deposit() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter deposit amount");
		long amount = in.nextLong();
	  	balance += amount;
	  	System.out.println("your balnace is "+balance);
	}
	public void withdraw() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter withdraw amount");
		long amount = in.nextLong();
		balance -= amount;
		System.out.println("your balnace is "+balance);
	}
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		 BankAccount obj =new BankAccount();
		System.out.println("ENter one(1) for deposit");
		System.out.println("Enter two(2) for withdraw");
		int n=in.nextInt();
		if(n==1)
			obj.deposit();
		else if(n==2)
			obj.withdraw();
		else
			System.out.println("invalid option");
	}

}
