package handlingTAB;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");

		
		
	driver.findElement(By.xpath("//button[.='✕']")).click();
	
	driver.findElement(By.name("q")).sendKeys("Iphone 13pro max");
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	String parenthandle = driver.getWindowHandle();
	 Set<String> alltabs = driver.getWindowHandles();
	
	for(String tab:alltabs)
	{
		System.out.println(tab);
		if(!parenthandle.equals(tab))
		{
			System.out.println(tab);
			driver.switchTo().window(tab);
			
		}
		else
		{
			
		}
	}
	
	
	
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//div[contains(text(),'Gold')]/ancestor::div[@class='_2OTVHf _3NVE7n _1mQK5h _2J-DXM']/preceding-sibling::a[@class='kmlXmn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'256')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("pincodeInputId")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[contains(text(),'Check')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(text(),'Remove')]")).click();
	

	
}

}



