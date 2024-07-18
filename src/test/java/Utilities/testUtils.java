package Utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Common.BaseTest;

public class testUtils extends BaseTest{
	
	public void getScreenshot(String methodName) {
		 String filepath = "C:\\Users\\jakkula.vinay\\TestNGHybridFramework\\TutorialsNinjaSelenium\\test-output\\Screenshots\\";
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with test method name 
		
		 try {
            	//System.out.println(filepath+methodName+".png");
			 	Date currentdate = new Date(0);   
            	String date = currentdate.toString().replace("","-").replace(":","-");
				FileUtils.copyFile(scrFile, new File(filepath+methodName+date+".png"));
				System.out.println("***Placed screen shot in "+filepath+" ***");
			} catch (IOException e) {
				e.printStackTrace();
			}
    }
		
}

