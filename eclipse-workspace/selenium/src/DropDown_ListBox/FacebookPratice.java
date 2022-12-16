package DropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPratice {

	

	public static void main(String[] args ) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a(@role='button'])[2]")).click();
	
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement Email = driver.findElement(By.xpath("//input[@name='reg_email_']"));
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement ReEmail = driver.findElement(By.xpath("//*[@name='reg_email_comfirmation_']"));
		
		
		firstname.sendKeys("kshitij");
		lastname.sendKeys("Jadhav");
		Email.sendKeys("kshitijjadhav3333@gmail.com");
		Password.sendKeys("775598985");
		ReEmail.sendKeys("kshitijjadhav3333@gmail.com");
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s=new Select(Day);
		
		 Select s1=new Select(Month);
		
		Select s2=new Select(year);

      	s.selectByIndex(17);
		s1.selectByVisibleText("Oct");
		s2.selectByValue("19994");
		
	     Thread.sleep(3000);
	     WebElement Gender_m = driver.findElement(By.xpath("//label[texe()='male']"));
		
	     Gender_m.click();
	      Thread.sleep(3000);
          driver.close();
	


	}

}
