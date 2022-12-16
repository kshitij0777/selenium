package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stclass1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.map.com/");
		//driver.get("https://www.gogle.com/");
		//Thread.sleep(2000);
		//2. close: to close the current tab of the browser opened by Selenium tool.
		//driver.close();
		//3. quit: to close the all the tabs present in browser opened by Selenium tool.
		//driver.quit();
		//4.maximize/ minimize() - used to maximize/ minimize the browser
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		//driver.manage().window().minimize();

	}

}
