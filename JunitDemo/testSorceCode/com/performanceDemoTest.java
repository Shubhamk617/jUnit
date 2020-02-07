package com;

import org.junit.Test;

public class performanceDemoTest {

	performanceDemo pf = new performanceDemo();

	@Test(timeout = 500)
	public void testPerformance() {
		pf.performance();
	}

}
