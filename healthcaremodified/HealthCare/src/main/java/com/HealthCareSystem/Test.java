package com.HealthCareSystem;
public class Test {
	int testId ;
	 String testName;
	public Test(int testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}
	public Test() {
		super();
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getTestId() {
		return testId;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestName() {
		return testName;
	}
	 
}
