package com.tutorialsninja.qa.testcases;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.windows.WindowsDriver;
//import io.appium.java_client.windows.WindowsElement;


public class winAppDriverTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello...");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app","D:\\Spectrum\\NET\\Spectrum.exe");
		WindowsDriver driver = new 
		WindowsDriver(new URL("http://127.0.0.1:4723/"),cap);
		Thread.sleep(5000);
		
		driver.findElementByAccessibilityId("txtUserID").sendKeys("TC");
		driver.findElementByAccessibilityId("txtPassword").sendKeys("autoqa");
		driver.findElementByAccessibilityId("btnOk").click();
		//Thread.sleep(120000);
		
		Assert.assertNotNull(driver);
		// Identify the current window handle (you can use Inspect.exe for this)
		String currentWindowHandle = driver.getWindowHandle();
		System.out.println(currentWindowHandle);
		// Wait for 5 seconds for the main window to appear/splash screen to dismiss
		try{
		  Thread.sleep(120000); // Use milliseconds in Java
		} catch (InterruptedException e) {
		  e.printStackTrace();
		}
		// Get all window handles associated with the application
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String handle : allWindowHandles)
		{
		System.out.println("Window handle - > " + handle);
		}
		
		driver.switchTo().window(allWindowHandles.iterator().next());
		// Assuming there's only one window, switch to it
		/*if (allWindowHandles.size() == 1) {
		  driver.switchTo().window(allWindowHandles.iterator().next());
		} 
		else {
		  // Handle scenario with multiple windows (optional)
		  // You can iterate through allWindowHandles and identify the desired window using additional logic
		  System.out.println("Found multiple windows. Please implement logic to choose the correct one.");
		}*/
		
		
		
		
		/*driver.findElementByName("Application Menu").click();
		System.out.println("Found and clicked Application");
		Thread.sleep(5000);
		driver.findElementByName("Transaction Entry").click();
		Thread.sleep(5000);
		System.out.println("Found and clicked Transaction ");
		driver.findElementByName("General").click();
		Thread.sleep(5000);
		System.out.println("Found and clicked General");*/
		
		driver.findElementByName("Common Entry").click();
		Thread.sleep(5000);
		System.out.println("Found and clicked Common");
		
		driver.findElementByName("<select type>").click();
		Thread.sleep(5000);
		System.out.println("Found and clicked type");	
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElementByName("<select type>")).click().doubleClick().build().perform();
		
		driver.findElementByName("Close").click();
		driver.quit();
		
	}

}
