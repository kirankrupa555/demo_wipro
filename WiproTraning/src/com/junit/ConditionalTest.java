package com.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {
	
	@Test
	@EnabledOnOs(OS.MAC)
	public void testMethod1() {
		System.out.println("Execute ony on Mac os");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_11)
	public void testMethod2() {
		System.out.println("Executes this program you require java 11 version");
	}
	
	@Test
	@EnabledForJreRange(min=JRE.JAVA_8,max=JRE.JAVA_13)
	public void testMethod3() {
		System.out.println("it will be executed java8 to java13 version");
	}
	
	@Test
	@EnabledIfSystemProperty(named = "user.dir",matches = "E:\\wipro\\WiproTraning")
	public void testMethod4() {
		System.out.println(System.getProperty("user.dir"));
	}
}
