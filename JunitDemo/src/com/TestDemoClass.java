package com;

class TestDemoClass {
	public String sayHello() {
		return "Hello EveryBody";
	}

	public boolean compareString(String str1, String str2) {
		if (str1.equalsIgnoreCase(str2))
			return true;
		else
			return false;
	}
	public String concatString(String str1, String str2) {
		return str1.concat(str2);
	}
}