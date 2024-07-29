package com.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capg.jse.calculator;

public class BeforeAfterTests {
	calculator obj;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Established connection for database");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("Remove the cnnection for database");
	}
	
	@BeforeEach
	public void init() {
		 obj = new calculator();
		System.out.println("init()");
	}
	@Test
	@DisplayName("Adding two positive numbers")
	public void testMethod1() {
		int result = obj.sum(10,20);
		System.out.println(result);
		
	}
	@Test
	@DisplayName("Adding two negitive numbers")
	public void testMethod2() {
		int result = obj.sum(-10,-20);
		System.out.println(result);
	}
	
	@AfterEach
	public void getDown() {
		System.out.println("Executed test method successfully");
	}
}
