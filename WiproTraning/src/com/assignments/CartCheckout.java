package com.assignments;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CartCheckout {
	
	public String billGenerator(Map<String, BigDecimal> cart, Double tax) {
		
		if(tax<0) {
			return "The taxPercent cannot be negative";
		}
		 BigDecimal totalCost = cart.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		 
		 BigDecimal taxAmount = totalCost.multiply(BigDecimal.valueOf(tax / 100));
	     BigDecimal totalCostWithTax = totalCost.add(taxAmount);

	     return totalCostWithTax.toString();
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, BigDecimal> cart = new HashMap<>();
		
		String input = scanner.nextLine();
		String taxx = scanner.next();
		if(taxx.equalsIgnoreCase("null") || taxx.isEmpty()) {
			System.out.println("The taxPercent cannot be null");
			return;
		}
		input = input.replaceAll("[{}]","");
		if(!input.isEmpty()) {
		String[] inputs = input.split(",\\s*");
		
		for(String s:inputs) {
			String[] parts = s.split("=");
			String name = parts[0].trim();
			BigDecimal val  = new BigDecimal(parts[1].trim());
			cart.put(name, val);
		}
		}
		else {
			System.out.println("The cart Map is empty");
			return;
		}
		Double tax = Double.valueOf(taxx);
		CartCheckout obj = new CartCheckout();
		System.out.println(obj.billGenerator(cart, tax));
		
	}

	

}
