package testNgxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
  @Test
  public void A() 
  {
	  Reporter.log(" A tc is running", true);
  }
  @Test
  public void B()
  {
	  Reporter.log("B tc is runing",true);
	  
  }
  @Test
  public void C()
  {
	  Reporter.log("C tc is runing", true);
  }
  @Test
  public void D()
  {
	  Reporter.log("D tc is runing", true);
  }
  
}
