package com.tutorialsninja.qa.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends BaseTest {
	@Test(priority=1)
	public void verifyWithValidData() {

		Reporter.log("Started Login Test Case\n");
		//System.out.println("Started Login Test Case");
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("amotoori3@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Reporter.log("Finished Test case Login");
		//System.out.println("Finished Test case Login");

	}
	@Test(priority=2)
	public void test2() {
		//System.out.println("Inside Test2 of Login class...");
		//BaseTest.LaunchTempDriver();
		driver.get("https://stackoverflow.com/questions/71218985/jenkins-pipeline-script-not-running");
		//System.out.println("Intentionally failing this test case...");
		Reporter.log("Intentionally failing this test case...");
		try {
		Assert.assertTrue(false);
		}
		finally{
			//BaseTest.closeTempDriver();
		}
		System.out.println("This line is not executed as the test failed in previous step");
	}
}
