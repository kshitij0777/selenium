package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		//using webElemnt method clicking on Element
		
		//WebElement HomePageButtonClick = driver.findElement(By.xpath("//a[text()='HOME ']"));
		
	//	HomePageButtonClick.click();
		//Thread.sleep(1000);
		
		//1.Identify an Element and store in ref variable
		WebElement HomePageButtonClick	=driver.findElement(By.xpath("//a[text()='HOME ']"));
		//2. Create an object of Actions class and pass driver object
		
		Actions act= new Actions(driver);
		//3. Using one of the actions class method take action
		//1st way
		act.moveToElement(HomePageButtonClick).perform();
		act.click().perform();
		
		//2nd way
		act.moveToElement(HomePageButtonClick).click().build().perform();
		
		//3rd way
		act.click(HomePageButtonClick).perform();

	}

}
