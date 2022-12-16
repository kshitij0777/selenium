package dnyamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException
	{
		
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi note10 pro"+ "");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		

	}

}
