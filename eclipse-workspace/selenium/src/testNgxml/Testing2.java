package testNgxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {
  @Test
  public void E()
  {
	  Reporter.log(" E t is runing", false);
  }
  @Test
  public void F () 
  {
	  Reporter.log(" F tc is runing", true);
  }
  @Test
  public void G()
  {
	  Reporter.log("G tc is runing", true);
  }
  @Test
  public void H()
  {
	  Reporter.log("H tc is runing", true);
  }
}
