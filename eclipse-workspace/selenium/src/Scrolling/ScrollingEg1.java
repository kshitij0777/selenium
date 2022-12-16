package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.phonepe.com/");
		driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(10,7000)");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(10,-1000)");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(10,800)");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(-10,800)");
	}

}
