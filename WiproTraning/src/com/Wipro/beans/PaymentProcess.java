package com.Wipro.beans;

public class PaymentProcess {
	private ICardPayment cardPayment;
	public void setCardPayment(ICardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}

	public boolean doPayment(double billAmt) {
		return cardPayment.payBill(billAmt);
		
	}
}
