package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass3 {
  @Test
  public void TC1()
  {
	  
	  Reporter.log("", true);
  }
  @Test
  public void TC2()
  {
		  Reporter.log("TC2 is running", true);
  }
  @Test
  public void TC3()
  {
	
	  
	  	  Reporter.log("TC3 is running", true);
}
  @Test
  public void TC4()
  {
		  Reporter.log("TC4 is running", true);
  }
  @Test
  public void TC5()
  {
	//Assertion.fail();
	  Reporter.log("TC5 IS running", true);
  }
}
