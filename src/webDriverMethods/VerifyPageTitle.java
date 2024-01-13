package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      String expectedResult = "Velocity | best software training centre";
      WebDriver driver=new ChromeDriver();
      driver.get("https://vctcpune.com/");
      Thread.sleep(2000);
      String actualResult = driver.getTitle();
      
      if(expectedResult.equals(actualResult));
      {
    	  System.out.println("title is matching and TC is passed");
      }
      
      {
    	  System.out.println("title is not matching and TC is failed");
      }
    	  
      }
	}


