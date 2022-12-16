package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
         System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		boolean result1 = checkbox1.isSelected();
		
		System.out.println("check box selection is"+result1);
		checkbox1.click();
		boolean result2 = checkbox1.isSelected();
		System.out.println("check box selection is"+result2);
		
		

	}

}
