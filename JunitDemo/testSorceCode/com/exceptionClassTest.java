package com;

import org.junit.Test;

public class exceptionClassTest {

	@Test(expected=ArithmeticException.class)
	public void testOperate() {
		System.out.println("testOperate");
		exceptionClass ec=new exceptionClass();
		ec.operate(2);
		
	}

}
