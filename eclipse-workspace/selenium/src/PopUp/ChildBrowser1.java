package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe"  );
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		 Set<String> Allwindow = driver.getWindowHandles();
		System.out.println(Allwindow);
		Iterator<String> it = Allwindow.iterator();
		String mainpage = it.next();
		String childpage = it.next();
		Thread.sleep(1000);
		driver.switchTo().window(childpage);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("good morning");
		
		driver.close();
		driver.switchTo().window(mainpage);
		Thread.sleep(1000);
		driver.findElement(By.name("home")).click();
		driver.close();
		
		

		

	}

}
