package com.tutorialsninja.qa.testcases;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	@Test
	public void verifyWithValidData() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("amotoori3@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	}
}
