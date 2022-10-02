package methodsOfWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class sumbitMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		
		// it is used to replace for click method
		driver.findElement(By.name("username")).sendKeys("lalit");
		driver.findElement(By.name("password")).sendKeys("wrongpassword");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).submit();


	}
}
