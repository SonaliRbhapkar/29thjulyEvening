package webElementStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		//driver.findElement(By.linkText(" create new account")).click();
        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(2000);
        WebElement date = driver.findElement(By.id("Day"));
        Select sDay=new Select(date);
		sDay.selectByVisibleText("15");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select smonth= new Select(month);
		smonth.selectByIndex(10);
	    
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select syear=new Select(year);
		syear.selectByValue("2002");

	
	}

}
