package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		Actions act=new Actions(driver);
		driver.findElement(By.name("firstname"));
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		//act.moveToElement(firstname).sendKeys("Yogendra").build().perform();
		act.moveToElement(firstname).keyDown(Keys.SHIFT).sendKeys("k").keyUp(Keys.SHIFT).sendKeys("shitij").build().perform();
		Thread.sleep(500);
		act.click(month).perform();
		// Thread.sleep(500);
		// act.sendKeys(Keys.ARROW_DOWN).perform();
		// Thread.sleep(500);
		// act.sendKeys(Keys.ARROW_DOWN).perform();
		// Thread.sleep(500);
		// act.sendKeys(Keys.ARROW_DOWN).perform();
		// Thread.sleep(500);
		// act.sendKeys(Keys.ENTER).perform();
		
		for (int i=0;i<=7;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(120);
		}
		act.sendKeys(Keys.ENTER).perform();


	}

}
