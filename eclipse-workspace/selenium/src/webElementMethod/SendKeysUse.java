package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.facebook.com");
		
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kshitij jadhav");
	
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jadhav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" kshtij ");
	}

}

