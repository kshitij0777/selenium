package sofetAsserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTesting 
{
	WebDriver driver ;
    @Parameters("browserName")
	@Test
	
	
	public void browserTest(String bName)
	{
    	
		if (bName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		else if (bName.equals("firefox"))
	     {
			 System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe" );
			  driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.phonepe.com/");
		driver.get("https://paytm.com/");
	}

	
}
