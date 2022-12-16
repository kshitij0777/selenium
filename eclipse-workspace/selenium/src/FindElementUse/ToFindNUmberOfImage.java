package FindElementUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToFindNUmberOfImage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		 
		 Actions act = new  Actions(driver);
		 
		 act.sendKeys("Iphone14").sendKeys(Keys.ENTER).build().perform();
		 driver.findElement(By.xpath("//a[text()='Images']")).click();
		 
		List<WebElement> Images = driver.findElements(By.tagName("img"));
		
		System.out.println("Image present in webpage is"+Images.size());
		
		
			
	

	}

}
