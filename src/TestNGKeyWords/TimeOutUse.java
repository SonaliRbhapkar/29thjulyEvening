package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test(timeOut=6000)
  public void payment() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  Reporter.log("payment done successfully", true);
  }
}
