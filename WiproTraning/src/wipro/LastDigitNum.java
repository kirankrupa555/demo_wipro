package wipro;

import java.util.Scanner;

public class LastDigitNum {
    public static void getLastDigit(int n) {
    	int res = n%10;
    	if(res<0) {
    		System.out.println(Math.abs(res));
    	}
    	else {
    	System.out.println(res);
    	}
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		getLastDigit(n);
	}

}
