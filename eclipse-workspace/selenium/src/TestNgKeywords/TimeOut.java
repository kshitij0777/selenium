package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
  @Test
  public void A() 
  {
	  Reporter.log("A tc is running",true);
  }
  @Test
  public void B() 
  {
	  Reporter.log("B tc is running", true);
  }
  @Test(timeOut=200)
  public void D() throws InterruptedException
  {
	  Thread.sleep(500);
	  Reporter.log("D tc is running", true);
  }
  @Test
  public void C()
  {
	  Reporter.log("C  tc is running", false);
  }
}
