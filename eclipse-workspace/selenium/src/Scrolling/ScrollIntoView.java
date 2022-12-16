package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(0);
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		
		//Scroll into view
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true)",textbox);
		 
		 textbox.sendKeys("Hello");
		 
		 Thread.sleep(1000);
		 
		WebElement textbox1 = driver.findElement(By.id("name"));
		 
            JavascriptExecutor js1 = (JavascriptExecutor)driver;
		 
		 js1.executeScript("arguments[0].scrollIntoView(true)",textbox1);
		 
		 textbox1.sendKeys("Kshitij");
		 
		 
		 WebElement textbox2 = driver.findElement(By.id("hide-textbox"));
		 
         JavascriptExecutor js2 = (JavascriptExecutor)driver;
		 
		 js1.executeScript("arguments[0].scrollIntoView(true)",textbox2);
		 
		 Thread.sleep(500);
		 textbox2.click();
		
		

	}

}
