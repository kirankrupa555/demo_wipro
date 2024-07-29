package com.Wipro.beans;

public class CreditCardPayment implements ICardPayment {

	@Override
	public boolean payBill(double Amt) {
		System.out.println("payment of you of"+Amt+"sucessfull");
		return true;
	}

}
