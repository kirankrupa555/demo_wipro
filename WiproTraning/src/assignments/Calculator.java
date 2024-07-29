package assignments;

import java.util.Scanner;

public class Calculator {
	 private static Scanner scan;
	 int firstNumber ;
	 int secondNumber;
	 int    operator;
	 
	 public void getValues(Scanner scan) {
		 char repeat;
		 do {
	     System.out.println("Enter the first number :");
		 firstNumber = scan.nextInt();
		 System.out.println("Enter the second number :");
		 secondNumber = scan.nextInt();
		 System.out.println("Enter the number beside the operation to perform : \n"
				 +"1.Add \n"
				 +"2.subtract \n"
				 +"3.Multiply \n"
				 +"4.Divide");
		 operator   = scan.nextInt();
		 String result=this.calculate(firstNumber,secondNumber,operator);
		 System.out.println(result);
		 System.out.println("Do u want to try again(y/n)");
		 repeat =scan.next().charAt(0);
		 if (repeat == 'n' || repeat=='N')
			 System.exit(0);
		 }while (repeat == 'y' || repeat=='Y');
	 }
	 
	 public static void main(String[] args) {
	 scan = new Scanner(System.in);
	 new Calculator().getValues(scan);
	 } 
	
	 public String calculate(int firstValue, int secondValue, int operator)
	{    
		 String output;
		 int result;
		 switch(operator) {
		 case 1:
			 result = firstValue+secondValue;
			 output=firstValue+" "+"+"+" "+secondValue+" "+"="+" "+result;
			 break;
		 
	     case 2 :
		     result=firstValue-secondValue;
		     output=firstValue+" "+"-"+" "+secondValue+" "+"="+" "+result;
		     break;
		 case 3 :
			 result=firstValue*secondValue;
			 output=firstValue+" "+"*"+" "+secondValue+" "+"="+" "+result;
			   break;
	     case 4 :
			  if(secondValue!=0)
			  {
			  result=firstValue/secondValue;
			  output=firstValue+" "+"/"+" "+secondValue+" "+"="+" "+result;
			  }
			  else {
			  output="The divider (secondValue) cannot be zero";
			  }
			  break;
		default:
			  output="Entered wrong option"+" "+Integer.toString(operator);
			  
			  }
			  return output;
		 }
		}
	 