package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stseleniumCode {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.youtube.com/");
         
         driver.manage().window().maximize();
         Thread.sleep(10000);
         
         driver.manage().window().minimize();
         
         Thread.sleep(2000);
         
         driver.close();
	}

}
