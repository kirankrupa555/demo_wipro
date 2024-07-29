package com.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.capg.jse.calculator;

public class NestedTests {
	calculator obj;
	@BeforeEach
	public void inite() {
		obj = new calculator();
	}
	
	@Nested
	public class AddPositive{
		@Test
		public void addsmallPositiveNumbers() {
			int result = obj.sum(10,20);
			System.out.println(result);
		}
		@Test
		public void addBiglPositiveNumbers() {
			int result = obj.sum(100,200);
			System.out.println(result);
		}
	}
	@Nested
	public class AddNegitive{
		@Test
		public void addsmallNegitiveNumbers() {
			int result = obj.sum(-10,-20);
			System.out.println(result);
		}
		@Test
		public void addBiglNegitiveNumbers() {
			int result = obj.sum(-100,-200);
			System.out.println(result);
		}
	}
	

}
