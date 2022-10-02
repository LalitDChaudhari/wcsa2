package bosch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Instagramlogin3 {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.instagram.com/accounts/login/");	

	}
	
	
	@Test
	public void loginInstagram()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("manager");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}
