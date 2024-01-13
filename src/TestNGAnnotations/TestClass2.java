package TestNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
  @Test
  public void TC3()
  {
	  Reporter.log("Running TC3", false);
  }
  public void TC2()
  {
	  Reporter.log("Running TC4", true);
  }
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("beforemethod is done", true);
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("aftermethod is done", true);
  }
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("before class is running", true);
  }
 @AfterClass
 public void afterclass()
 {
	 Reporter.log(" after class is running", true);
 }
 @BeforeTest
 public void beforetest()
 {
	Reporter.log("before test is running", true); 
 }
 @AfterTest
 public void aftertest()
 {
	 Reporter.log("after test is running", false);
 }
}
