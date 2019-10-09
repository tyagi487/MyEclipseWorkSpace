package com.Testng.Sel;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log(result.getName()+" "+"Script execution start", true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" "+"Script is passed", true);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" "+"Script is failed", true);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" "+"Script is skipped", true);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("onTestFailedButWithinSuccessPercentage is executed");
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log("Suite execution start", true);

		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		Reporter.log("Script execution ends", true);

		
	}
	
	
	
	
	

}
