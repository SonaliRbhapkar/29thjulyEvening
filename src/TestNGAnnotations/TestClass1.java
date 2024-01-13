package TestNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void TC1()
  {
	  Reporter.log("Running TC1", true);
  }
  public void TC2()
  {
	  Reporter.log("Running TC2", true);
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
 @BeforeSuite
 public void beforesuite()
 {
	 Reporter.log("Before Suite is running", true);
 }
 @AfterSuite
 public void aftersuite()
 {
	 Reporter.log("After Suite is running", true);
 }
}
