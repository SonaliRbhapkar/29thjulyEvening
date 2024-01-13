package webElementStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN826G0&p=naukri.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='s-img bdr-4']")).click();

	}

}
