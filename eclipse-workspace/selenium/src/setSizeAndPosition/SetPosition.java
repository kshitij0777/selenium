package setSizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		Point defaultposition = driver.manage().window().getPosition();
		
		System.out.println("Default position is"+defaultposition);
		
		// create an object of point class and pass x and y coordinate
		
		Point p = new Point(200, 90);
		
		//set the position  by using setPositin method and pass Point class object as a parameter
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		
		
		Point p1 = new Point(90, 300);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p1);
		
		
		Point p2 = new Point(-90, -200);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p2);
		
	}
	

}
