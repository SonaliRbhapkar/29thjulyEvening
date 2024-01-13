package webElementStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		//1
		WebElement dropdownfield = driver.findElement(By.id("dropdown-class-example"));
		//2
		Select s=new Select(dropdownfield);
		//3
		s.selectByValue("option2");
		
		
		
		

	}

}
