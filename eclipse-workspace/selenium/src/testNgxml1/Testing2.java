package testNgxml1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {
	@Test(groups= {"un","funds"})
	  public void E()
	  {
		  Reporter.log(" E t is runing", false);
	  }
	  @Test
	  public void F () 
	  {
		  Reporter.log(" F tc is runing", true);
	  }
	  @Test(groups="un")
	  public void G()
	  {
		  Reporter.log("G tc is runing", true);
	  }
	  @Test(groups="funds")
	  public void H()
	  {
		  Reporter.log("H tc is runing", true);
	  }
}
