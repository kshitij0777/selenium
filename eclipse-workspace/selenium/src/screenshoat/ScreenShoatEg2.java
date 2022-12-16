package screenshoat;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.standard.MediaSize.Other;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShoatEg2 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s1 = RandomString.make(5);
		
		File destination1 = new File("E:\\selenium\\screenshoat\\test"+s1+".png");
		
		FileHandler.copy(source, source);
				

	}

}