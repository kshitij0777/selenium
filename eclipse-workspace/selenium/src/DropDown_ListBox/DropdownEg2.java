package DropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement cars = driver.findElement(By.id("cars"));
	
		 Select s1= new Select(cars);
		 
		 System.out.println(s1.isMultiple());
		 
		 s1.selectByVisibleText("Opel");
		 Thread.sleep(1200);
		 s1.selectByIndex(0);
		 Thread.sleep(1200);
		 s1.selectByValue("saab");
		 s1.deselectByIndex(3);
		 
		 s1.getFirstSelectedOption().getText();
		 System.out.println("1st selection is done by"+s1.getFirstSelectedOption().getText());
		
				
		

	}

}
