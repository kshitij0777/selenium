package DropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		//1.Identify list box to be handled and store it in reference variable
		WebElement dropDown = driver.findElement(By.name("Dropdown Example"));
	
		//2.Create an object of Select class which will accept WebElement as argument
		
		Select s1=new Select(dropDown);
		// 3. By using one of the select class methods we can select values form list box like 
		// 1. selectByVisibleText: selectByVisibleText(String arg0) 
		// 2. selectByIndex: selectByIndex(int arg0) 
		// 3. selectByValue: selectByValue(String arg0)
		//1.selectByVisibleText
		
		s1.selectByVisibleText("Option1");
		
		// 2. selectByIndex: selectByIndex(int arg0) 
		Thread.sleep(2000);
		s1.selectByIndex(2);
		
		//3. selectByValue
		Thread.sleep(1000);
		s1.selectByValue("option1");

		
		
		
		
		
		

		

	}

}
