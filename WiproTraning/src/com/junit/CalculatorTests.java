package com.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capg.jse.calculator;



public class CalculatorTests {
	@Test
	@DisplayName("Adding two positive numbers")
	public void testMethod1() {
		calculator obj = new calculator();
		int result = obj.sum(10,20);
		System.out.println(result);
		
	}
	@Disabled
	@Test
	@DisplayName("Adding two negitive numbers")
	public void testMethod2() {
		calculator obj = new calculator();
		int result = obj.sum(-10,-20);
		System.out.println(result);
		
	}

}
