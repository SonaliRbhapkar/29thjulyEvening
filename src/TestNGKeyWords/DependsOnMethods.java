package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test
  public void payment() 
  
  {
	  Reporter.log("payment done", true);
  }
  @Test(timeOut=30)
  public void couponcode()
  {
	  Reporter.log("50% discount is done", true);
  }
  @Test(dependsOnMethods= {"couponcode"})
  public void discount()
  {
	  Reporter.log("discount is used", true);
  }
  
}
