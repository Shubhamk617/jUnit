package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDemoClassTest {
	TestDemoClass demo = new TestDemoClass();

	@Test
	public void testHello() {
		assertEquals("Hello EveryBody", demo.sayHello());
		assertNotEquals("Hellos EveryBody", demo.sayHello());
		assertNotSame("Hellos EveryBody", demo.sayHello());
		System.out.println("testHello()");
	}

	@Test
	public void testCompareString() {
		assertTrue(demo.compareString("hello", "hello"));
		assertFalse(demo.compareString("hello", "hi"));
		System.out.println("testCompareString()");
	}
	
	@Test
	public void testConcatString() {
		assertEquals("hi hello", demo.concatString("hi ", "hello"));
		assertEquals("hihello", demo.concatString("hi", "hello"));		
		System.out.println("testConcatString()");
	}

}
