package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseTest {
	
	public static WebDriver driver;
	//public static WebDriver driver2;
	
	@BeforeSuite
	public void LaunchChromeDriver() {
		
		System.out.println("Strating Chrome ...");
		//Reporter.log("Strating Chrome ...");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void closeDriver() {
		//Reporter.log("Closing Chrome ...");
		System.out.println("Closing Chrome ...");
		driver.quit();
	}
	
	/*public static void LaunchTempDriver() {
		
		System.out.println("Strating New Chrome Instance...");
		
		driver2 = new ChromeDriver();
		
		driver2.manage().window().maximize();
	}
	
	public static void closeTempDriver() {
		System.out.println("Closing Temp Chrome Instance...");
		driver2.close();
	} */


}
