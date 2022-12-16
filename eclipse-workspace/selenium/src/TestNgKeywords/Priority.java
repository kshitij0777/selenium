package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority =1)
  public void A() 
  {
	  Reporter.log(" A tc is runnig", true);
  }
  @Test(priority =-1)
  public void C() 
  {
	  Reporter.log(" C tc is runnig", true);
  }
  @Test(priority =-2)
  public void D() 
  {
	  Reporter.log(" D tc is runnig", true);
  }@Test(priority =1)
  public void B() 
  {
	  Reporter.log(" B tc is runnig", true);
  }
}
