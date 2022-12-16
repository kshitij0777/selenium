package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount = 7)
  public void A()
  {
	  Reporter.log(" A test is running ",true);
  }
}
