package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
@Listeners 
public class Listener implements ITestListener
{


		public void onTestSuccess(ITestResult result) 
		{
			String methodName = result.getName();
		Reporter.log("TC"+methodName+ "is completed successfuly",true);
		}
	
		public void onTestFailure(ITestResult result) 
		{
		Reporter.log("TC is failed",true);
		}
		
		public void onTestSkipped(ITestResult result) 
		{
		Reporter.log("TC is skipped please check",true);
		}
		
		
	}


