package locatorpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSmartBear {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://community.smartbear.com/t5/user/userloginpage");
		  
		
		// how to use login locator
		driver.findElement(By.id("profilecustom_email")).sendKeys("admin");
		driver.findElement(By.id("lia-password")).sendKeys("manager");
        
         driver.findElement(By.id("submitContext")).click();
         
        
        
	}

}
