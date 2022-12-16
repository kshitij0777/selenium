package neoStoxUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.BaseNew;

public class Listener extends BaseNew implements ITestListener
{
	public void onTestSuccess(ITestResult result) 
	{
		String methodName = result.getName();
	Reporter.log("TC"+methodName+ "is completed successfuly",true);
	}

	public void onTestFailure(ITestResult result,WebDriver driver) 
	{
	Reporter.log("TC is failed",true);
	try {
		UtiltyNew.takeSceenshot(driver, result.getName());
		} 
		catch (IOException e) 
	{
		e.printStackTrace();
		}


	}
	
	public void onTestSkipped(ITestResult result) 
	{
	Reporter.log("TC is skipped please check",true);
	}

}
