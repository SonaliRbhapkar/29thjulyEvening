package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrenturl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
             WebDriver driver=new ChromeDriver();
             driver.get("https://vctcpune.com/");
             Thread.sleep(2000);
             String url = driver.getCurrentUrl();
             System.out.println("url is "+url);
	}

}
