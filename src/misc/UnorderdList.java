package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderdList {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.google.co.in/");
       Thread.sleep(2000);
       driver.findElement(By.name("q")).sendKeys("honda");
       Thread.sleep(2000);
       List<WebElement>search=(List<WebElement>) driver.findElement(By.xpath("(//div[@class='0BMEnb'])[1]/ul/li)"));
               
       
       for(WebElement s:search)
       {
    	   System.out.println(s.getText());
       }
       System.out.println("================================================================");
       String expResult = "honda elevate";
       
       for(WebElement s1:search);
       
       {
    	   
       }
       
       
	}

}
