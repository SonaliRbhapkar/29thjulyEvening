package webElementStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Testing@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).clear();

	}

}
