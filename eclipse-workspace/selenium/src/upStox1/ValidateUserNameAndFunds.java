package upStox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshoat1.Scrolling;

public class ValidateUserNameAndFunds {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://login-v2.upstox.com/");
	     Thread.sleep(1000);
	     //login to application
	     //sending user id
	     driver.findElement(By.id("userCode")).sendKeys("6WB4LB");
	     //sending password
	     driver.findElement(By.name("password")).sendKeys("Rr1x=%I$p4");
	     //click in sign in button
	     driver.findElement(By.id("submit-btn")).click();
	     
	     Thread.sleep(3000);
	    //navigating to passcode page
	     driver.findElement(By.xpath("//input[@name='yob']")).sendKeys("1994");
	   //click on cancel trip(no I am good)
	     Thread.sleep(7000);
	     driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	   //navigating to Home page
	     Thread.sleep(1000);
	     //validate to user name
		  String expectedUN = "kshitij j.";
		  WebElement userNameFiled = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]"));
		  //Scrolling into view
		  //calling common method of scrolling
		  Scrolling.scrollIntoView(driver, userNameFiled);
		
		String actualUN = userNameFiled.getText();
		  if(expectedUN.equals(userNameFiled)) 
		  {
			  System.out.println("actual and expected user neme are matching tc is pass");
		  }
		  else
		  {
			  System.out.println("actual and expected user neme are not matching tc is fail");
		  }
		  //validate fund button
		  //clicking on fund button
		  driver.findElement(By.id("funds")).click();
		  Thread.sleep(1000);
		  String funds = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
		  
		  System.out.println("Funds Available to trade"+funds);
		  
		  
		  

	     
	     
	     
				
				

		

	}

}
