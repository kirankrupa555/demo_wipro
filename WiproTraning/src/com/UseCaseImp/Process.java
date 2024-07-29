package com.UseCaseImp;

import java.util.Scanner;

import com.UseCase.Employee;

public class Process {
	Scanner in = new Scanner(System.in);
	JdbcOperations obj = new JdbcOperations();
	Employee em = new Employee();
	static Process pos = new Process();
	
    public void process() {
    	int n;
		do {
    	System.out.println("Select the option");
    	System.out.println("1 insert Employee Details");
    	System.out.println("2 update Employee Details by using id");
    	System.out.println("3 Delete Employee Details by using id");
    	System.out.println("4 show the all the details of employess");
    	System.out.println("5 for exit");
    	
    	 n = in.nextInt(); 
    	
    	switch(n) {
    	case 1:
    		obj.values();
    		obj.insert();
    		  break;
    	case 2:
    		obj.values();
    		obj.update();
    		  break;
    	case 3:
    		System.out.println("Enter Employee id: ");
    		int num = in.nextInt();
    		obj.delete(num);
    		  break;
    	case 4:
    		  obj.select();
    		  break;
    	case 5:
    		System.out.println("Exited Successfully");
    		break;
    	default:
    		System.out.println("Invalid option");
    	}
    	}while(n!=5);
    }
    public static void main(String[] args) {
	pos.process();	
	}

}
