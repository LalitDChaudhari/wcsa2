package locatorpratice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonFilter {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://www.amazon.com");
		 
		
		 driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @id='twotabsearchtextbox']")).sendKeys("laptop");
		 driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'  and @id='nav-search-submit-button']")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[.='ASUS']")).click();
		 driver.findElement(By.xpath("//span[.='Windows 10 Home']")).click();
		 //Thread.sleep(2000);
		 String laptopvalue = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole'])[1]")).getText();
          System.out.println("laptop value :"+laptopvalue);		 
		 
				 
		 

	}
}