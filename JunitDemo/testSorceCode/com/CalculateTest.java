package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
	Calculate cr=new Calculate();
	@Test
	public void testCalculator() {
		assertEquals(30	, cr.add(10, 20));
		assertEquals(30	, cr.sub(60, 30));
		assertEquals(30	, cr.mul(5, 6));
		assertEquals(30	, cr.div(1800, 60));
	}

}
