package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe" );
	  
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.flipkart.com/");

	 driver.manage().window().maximize();
	 
	 Thread.sleep(500);
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 
	 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptops");
	 
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 
	}

}
