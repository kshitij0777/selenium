package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethodUes {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		
		WebElement showbutton = driver.findElement(By.id("show-textbox"));
		
		//hidebutton.click();
		
		if(textBox.isDisplayed())
		{
			textBox.sendKeys("good morning");
		}
		else
		{
			showbutton.click();
			textBox.sendKeys("good night");
			
			
		}

	}

}
