package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass3 {
  @Test
  public void FbLaunch()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login.php/");
	  Reporter.log("Fb launching", true);
  }
  @Test
  public void instaLaunching()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.instagram.com/?hl=en");
	  Reporter.log("insta launching", true);
			  
  }
  @Test
  public void twitterLaunching()
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://twitter.com/i/flow/login");
	Reporter.log("twitter Launching", true);
  }
}
