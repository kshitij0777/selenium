package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassScrollinfAss {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
	                                                                                                                                                                                                                                                                                                                      
		WebElement textbox = driver.findElement(By.id("name"));
		Actions act1 = new Actions(driver);
		act1.scrollToElement(textbox).click(textbox).sendKeys("kshitij").build().perform();
		 
		//WebElement fieled = driver.findElement(By.id("displayed-text"));
				//Actions act = new Actions(driver);
			///	act.scrollToElement(fieled).perform();
	}

}
