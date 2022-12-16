package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
  @Test
  public void A() 
  {
	   Reporter.log("A tc is runnig", true);
  }
  @Test
  public void B()
  {
	  Reporter.log("B tc is running", true);  
  }
  @Test(enabled= false)
  public void C()
  {
	  Reporter.log("C tc is running", true);
  }
  @Test
  public void D()
  {
	  Reporter.log("D tc is running", true);
  }
}
