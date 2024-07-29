package com.main;
import com.Wipro.beans.CreditCardPayment;
import com.Wipro.beans.PaymentProcess;
public class Main {
	public static void main(String[] args) {
		
		PaymentProcess pp = new PaymentProcess();
		pp.setCardPayment(new CreditCardPayment());
		boolean paymentStatus = pp.doPayment(100.25);
		if(paymentStatus)
			System.out.println("payment processed successfully");
		else
			System.out.println("Failed to process payment ");
	}

}
