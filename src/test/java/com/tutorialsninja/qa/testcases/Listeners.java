package com.tutorialsninja.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.testUtils;


public class Listeners extends testUtils implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		//System.out.println(result.getName() + " Test Case has been started...");
		Reporter.log(result.getName() + " Test Case has been started...");
	}
	
	public void onTestSuccess(ITestResult result) {
		//System.out.println(result.getName() + " Test Case has been successful...");
		//System.out.println("------************------");
		Reporter.log(result.getName() + " Test Case has been successful...");
		Reporter.log("------************------");
	}

	public void onTestFailure(ITestResult result) {
		//System.out.println("Error: "+ result.getName() + " Test has failed so taking a screenshot...");
		Reporter.log("Error: "+ result.getName() + " Test has failed so taking a screenshot...");
		String methodName=result.getName().toString().trim();
        ITestContext context = result.getTestContext();
        //WebDriver driver = (WebDriver)context.getAttribute("driver2");
        getScreenshot(methodName);		
		//System.out.println("------************------");
		Reporter.log("------************------");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println();
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println();
	}
	
	public void onStart(ITestContext context) {
		//System.out.println(context.getName() + " Test Suite has started...");
		Reporter.log(context.getName() + " Test Suite has started...");
	}
	
	public void onFinish(ITestContext context) {
		//System.out.println(context.getName() + " Test Suite has been completed...");
		Reporter.log(context.getName() + " Test Suite has been completed...");
	}
}
