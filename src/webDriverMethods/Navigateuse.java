package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateuse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
        
        driver.navigate().to("https://www.microsoft.com/en-in/sql-server/sql-server-downloads");
        Thread.sleep(2000);
        
        driver.navigate().back();
        Thread.sleep(2000);
        
        driver.navigate().forward();
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        Thread.sleep(2000);
        driver.quit();
	}

}
