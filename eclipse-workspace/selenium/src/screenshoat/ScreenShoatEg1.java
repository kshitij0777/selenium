
package screenshoat;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShoatEg1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//Byte b=(byte)a;
		
		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source1);
		
		File destination = new File("E:\\selenium\\screenshoat\\myscrrenshot.png");
		
		FileHandler.copy(source1, destination);
	

	}

	
		
	}


