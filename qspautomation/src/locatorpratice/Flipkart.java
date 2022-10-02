package locatorpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		  
		
		// how to use login locator
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("admin");
		driver.findElement(By.cssSelector("a[class='_1_3w1N']")).click();
	}

}
