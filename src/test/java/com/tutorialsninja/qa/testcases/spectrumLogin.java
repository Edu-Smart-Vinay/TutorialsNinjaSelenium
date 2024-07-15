package com.tutorialsninja.qa.testcases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class spectrumLogin {
	@Test
	public void test() throws InterruptedException{

		WebDriver driver ;

		driver = new ChromeDriver(); 
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://vm-qc-rt-5.iongroup.net/ClientPortal/login.aspx"); 
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.name("ctl00$MasterPageContent$txtUserName"));
		username.sendKeys("fss");
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$MasterPageContent$txtPassword")).sendKeys("fssfss");
		driver.findElement(By.name("ctl00$MasterPageContent$btnSubmit")).click();
		Thread.sleep(5000);
		
		
		
		driver.findElement(By.xpath("//*[contains(text(),'Dealing')]")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),' New Transactions ')]")).click();
		
		driver.findElement(By.xpath("//input[@value = 'New Transaction']")).click();
		Thread.sleep(5000);
	    //Entering contract amount
		driver.findElement(By.xpath("//input[@formcontrolname='contractAmount']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='contractAmount']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@formcontrolname= 'contractAmount']")).sendKeys("100000");
		Thread.sleep(5000);
	    //clicking counter currency combo box	and selecting EUR    
	    driver.findElement(By.id("mat-select-28")).click();
	    Thread.sleep(5000);
	    WebElement counterCurrency = driver.findElement(By.xpath("//input[@placeholder='Search Currencies']"));
	    counterCurrency.click();
	    counterCurrency.sendKeys("EUR");
	    //counterCurrency.sendKeys(Keys.ENTER);
	    //counterCurrency.sendKeys(Keys.RETURN);
	    Thread.sleep(3000);
	    Actions action = new Actions(driver);
	    action.sendKeys(counterCurrency,Keys.ENTER).build().perform();
	    System.out.println("Done");
	    Thread.sleep(5000);
	    
	    //clicking calendar
	    driver.findElement(By.id("mat-input-12")).click();
	    Thread.sleep(5000);
	    
	    //selecting 26th February 2024
	    driver.findElement(By.xpath("//table[@class='mat-calendar-table']/tbody/tr[2]/td[2]")).click();
	    Thread.sleep(5000);
	    
	    //Saving the trade	
	    driver.findElement(By.id("saveButton")).click();
	    Thread.sleep(5000);

		//System.out.println(driver.getTitle());
	    
	    driver.close();
	    driver.quit();
	
	}
}
