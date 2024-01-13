package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass2 {
  @Test
  public void myMethod()
  {
	  System.out.println("Hii this is printing statment");
	  Reporter.log("Hii this is Reporter, Without boolean parameter");
	  Reporter.log("Hii this is Reporter,with boolean parameter",true);
  }
}
