package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_ContextClick {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//1.Identify an Element and store in ref variable
		WebElement RightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//2
		Actions act = new Actions(driver);
		
		//act.moveToElement(RightClickButton).perform();
	//	act.contextClick().perform();
	//	act.moveToElement(RightClickButton).contextClick().build().perform();
		act.contextClick(RightClickButton).perform();
		
		
		

	}

}
