package dnyamicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleList {



	

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(500);
		List<WebElement> results = driver.findElements(By.xpath("(//ul[@class='erkvQe'])[1]//li"));
		// how many result i got
		System.out.println(results.size());
		//what are results
		for(WebElement r:results)
		{
			System.out.println(r.getText());
			String expected="honda amaze";
			String actual=r.getText();
		
		if(expected.equals(actual))
		{
			r.click();
			break;
		}
		}
			   
		
		
		
		

	}

}
