package synchronizationOrWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.upstox.com/");
		Thread.sleep(2000);
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(15000));
		driver.findElement(By.id("mobileNumber")).sendKeys("9763045674");
		WebElement element = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		w.until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor click_element=((JavascriptExecutor)driver);
		click_element.executeScript("arguments[0].click();", element);

	}

}
