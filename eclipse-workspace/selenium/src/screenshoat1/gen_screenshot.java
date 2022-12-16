package screenshoat1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class gen_screenshot
{
	public static void takeScreenshot(WebDriver driver,String element) throws IOException
	{
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("E:\\selenium\\chromedriver.exe"+element+".jpg");
	FileHandler.copy(src, dest);


}
}