package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Csign%20in%20to%20facebook%7C&placement=&creative=589460569891&keyword=sign%20in%20to%20facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-11079269337%26loc_physical_ms%3D9062114%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw4bipBhCyARIsAFsieCzdz4Hx4CR1_p1jCa4R9WNQnDq10rybLbOKvDRA8hXizmH8RjIVyhUaAuV8EALw_wcB");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='u_0_g_7V']")).sendKeys("testing@gmail.com");
	}

}
