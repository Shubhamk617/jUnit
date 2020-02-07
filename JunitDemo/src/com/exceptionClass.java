package com;

public class exceptionClass {
	public void operate(int x) {
		for(int i=1;i<=10;i++) {
			if(i==x) throw new ArithmeticException("exception occcured");
		}
	}

}
