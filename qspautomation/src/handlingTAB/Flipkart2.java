package handlingTAB;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13 pro max");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String abc = driver.getWindowHandle();
		Set<String> xyz = driver.getWindowHandles();
		
		for(String tab:xyz)
		{
		  System.out.println(tab);
		  if(!abc.equals(tab))
		  {
			  System.out.println(tab);
			  driver.switchTo().window(tab);
		  }
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),'Gold')]/ancestor::div[@class='_2OTVHf _3NVE7n _1mQK5h _2J-DXM']/preceding-sibling::a[@class='kmlXmn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_1fGeJ5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Check')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Remove' ) and @class='_3dsJAO']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Remove' and @class='_3dsJAO _24d-qY FhkMJZ']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
