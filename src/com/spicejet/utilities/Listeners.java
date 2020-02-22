package com.spicejet.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	@Override
	public void onFinish(ITestContext testname) {
		Reporter.log(testname.getName()+" Suite finished executing successfully.");
		System.out.println(testname.getName()+" Suite finished executing successfully.");
	}
	@Override
	public void onStart(ITestContext testname) {
		Reporter.log(testname.getName()+" Suite started executing.");
		System.out.println(testname.getName()+" Suite started executing.");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}
	@Override
	public void onTestFailure(ITestResult testname) {
		Reporter.log(testname.getName()+" failed.");
		System.out.println(testname.getName()+" failed.");
	}

	@Override
	public void onTestSkipped(ITestResult testname) {
		Reporter.log(testname.getName()+" skipped executing.");
		System.out.println(testname.getName()+" skipped executing.");
	}
	@Override
	public void onTestStart(ITestResult testname) {
		Reporter.log(testname.getName()+" started executing successfully.");
		System.out.println(testname.getName()+" started executing successfully.");
	}
	@Override
	public void onTestSuccess(ITestResult testname) {
		Reporter.log(testname.getName()+" successful.");
		System.out.println(testname.getName()+" successful.");
	}

}