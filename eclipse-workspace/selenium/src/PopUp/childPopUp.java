package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe"  );
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]")).click();
	Thread.sleep(1000);
	Set<String> alltab = driver.getWindowHandles();
	
	for(String a:alltab)
	{
		System.out.println(a);
	}
	
	System.out.println("all tab id is"+alltab);
	Iterator<String> it1 = alltab.iterator();
	String main = it1.next();
	System.out.println("1st tab id is"+main);
	String child = it1.next();
	System.out.println("child tab is"+child);
	driver.switchTo().window(child);
	driver.findElement(By.id("checkBoxOption1")).click();
	driver.findElement(By.id("checkBoxOption2")).click();
	driver.findElement(By.id("checkBoxOption3")).click();
	
	driver.switchTo().window(main);
	WebElement MyText = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']"));
	System.out.println("Text is home page is"+MyText.getText());
	
	
	
	
	
	
	
		

	}

}
