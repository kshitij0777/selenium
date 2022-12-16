package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		WebElement Source = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement Target = driver.findElement(By.id("amt8"));
		
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		//act.clickAndHold(Source).moveToElement(Target).release().build().perform();
		
		act.dragAndDrop(Source, Target).perform();
		
		
	

	}

}
