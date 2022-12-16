package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void myTest1() 
  {
	 Reporter.log("myTest Test method 1 is running", true);
  }
  @Test
  public void myTest2()
  {
	  Reporter.log("myTest Test method 2 is running", true);
  }
  @BeforeMethod
  public void Bf()
  {
	  Reporter.log("Beforeb  method is running", true);
  }
  @AfterMethod
  public void Af()
  {
	  Reporter.log("After method is running", true);
  }
  @AfterClass
  public void Ac()
  {
	  Reporter.log("After class is running",true);
  }
}

