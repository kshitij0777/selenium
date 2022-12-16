package actionclass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		WebElement DoubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//System.out.println(DoubleClick.getText());
		
		Actions act=new Actions(driver);
		
		//act.doubleClick().doubleClick(DoubleClickButton).perform();
		
		act.moveToElement(DoubleClickButton).doubleClick().build().perform();
	}

}
