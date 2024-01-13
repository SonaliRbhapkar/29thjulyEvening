package TestNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassUse {
  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 is running", true);
  }
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 is running", true);
  }
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("before method is running", true);
  }
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("after method is running", true);
  }
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("open broser-->before class", true);
  }
 @AfterClass
 public void afterclass()
 {
	 Reporter.log(" close broser--> after class", true);
 }
  
}
