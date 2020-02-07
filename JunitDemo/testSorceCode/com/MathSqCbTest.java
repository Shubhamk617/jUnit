package com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class MathSqCbTest {
	MathSqCb mc = new MathSqCb();

	@Test
	public void squareTest() {
		assertEquals(4, mc.square(2));
		System.out.println("squareTest()");
	}

	@Test
	public void cubeTest() {
		assertEquals(8, mc.cube(2));
		System.out.println("cubeTest()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()");
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
	}

}
