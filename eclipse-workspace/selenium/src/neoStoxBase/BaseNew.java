package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.Utility;
import neoStoxUtility.UtiltyNew;

public class BaseNew 
{
	
	protected WebDriver driver;
	public void launchBrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(UtiltyNew.readDataFromPropertyFile("url"));
	driver.manage().window().maximize();
	Reporter.log("Launching browser",true);
	Utility.wait(driver, 1000);
	}
	public static void closingBrowser(WebDriver driver) throws 
	InterruptedException
	{
	Reporter.log("closing browser", true);
	Thread.sleep(500);
	driver.close();
	}


}
