package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeysuse1 {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe" );
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("velocity");
			//
			// Thread.sleep(1000);
			// driver.findElement(By.xpath("//input[@id='email']")).clear();
			//
			// Thread.sleep(1000);
			// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pune");
			//
			// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("velocity");
			WebElement userID= driver.findElement(By.xpath("//input[@id='email']"));
			userID.sendKeys("Pune");
			Thread.sleep(1000);
			userID.clear();
			Thread.sleep(1000);
			userID.sendKeys("Velocity Pune");
			driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
	}

		
}
	



