package testNgxml1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 
{
	@Test(groups= "un")
	  public void A() 
	  {
		  Reporter.log(" A tc is running", true);
	  }
	  @Test(groups="un")
	  public void B()
	  {
		  Reporter.log("B tc is runing",true);
		  
	  }
	  @Test(groups="Funds")
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

