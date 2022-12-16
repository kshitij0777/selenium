package neoStoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{

	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
	File myFile= new File("E:\\selenium\\Kshitij\\myfile.xlsx");
	  Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet7");
	 String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	Reporter.log("entering data from excel ", true);
	return value;
	}
	
	public static void takeSceenshot(WebDriver driver, String fileName) throws 
	IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("E:\\selenium\\screenshoat\\myScreenshoat\\"+fileName+".png");
	FileHandler.copy(src, dest);
	Reporter.log("taking screenshot ",true);
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",element );
	Reporter.log("scrolling into view "+element.getText(),true);
	}
	
	public static void wait(WebDriver driver, int waittime)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
	Reporter.log("waiting for "+waittime+"milis",true);
	}


	

	

	}
	
