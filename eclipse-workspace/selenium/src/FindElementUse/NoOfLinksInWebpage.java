package FindElementUse;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksInWebpage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		// for each loop
		
		for(WebElement kj:links)
		{
			System.out.println(kj.getText());
		}
		
		
         ///     Iterator<WebElement>  tt1 = links.iterator();
	//	while(tt1.hasNext())
	//	{
	//		System.out.println(tt1.next());
	//	}
		
		
		

	}

}
