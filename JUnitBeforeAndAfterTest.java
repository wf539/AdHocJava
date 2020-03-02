package com.cardinus.udemy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitBeforeAndAfterTest {
	
	@BeforeClass
	public static void beforeClassTest() {
		
		System.out.println("Before class test");
	}
	
	@Before
	public void beforeTest() {
		
		System.out.println("Before test");
	}
		
	@Test
	public void this1Test() {
		
		System.out.println("This is 1 test");
	}
	
	@Test
	public void this2Test() {
		
		System.out.println("This is 2 test");
	}
	
	@Test
	public void this3Test() {
		
		System.out.println("This is 3 test");
	}
	
	@After
	public void afterTest() {
		
		System.out.println("After test");
	}
	
	@AfterClass
	public static void afterClassTest() {
		
		System.out.println("After class test");
	}
}
