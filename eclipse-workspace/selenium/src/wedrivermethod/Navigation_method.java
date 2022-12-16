package wedrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_method {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.phonepe.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.samsung.com/" );
		
		Thread.sleep(1100);
		
		driver.navigate().back();
		
		Thread.sleep(1100);
		
		driver.navigate().forward();
		Thread.sleep(1100);
		
		driver.navigate().refresh();
			
	}

}
