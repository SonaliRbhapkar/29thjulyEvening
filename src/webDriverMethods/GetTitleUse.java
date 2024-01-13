package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.youtube.com/");
      Thread.sleep(2000);
      String title = driver.getTitle();
      System.out.println("title is "+title);
	}

}
