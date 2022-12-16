package setSizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println(defaultsize);
		//To set the size we need to Dimension class
		//Create the object of Dimension  class & pass width & height
		Thread.sleep(1000);
		Dimension d = new Dimension(190, 350);
		//Now set the size
		//Use setSize method and pass Dimension class as parameter
		
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Dimension d1 = new Dimension(800, 900);
		driver.manage().window().setSize(d1);
		
		Thread.sleep(1000);
		Dimension d2 = new Dimension(808,200);
		driver.manage().window().setSize(d2);
		
		
		
	}

}
