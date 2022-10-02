package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver a = new ChromeDriver();
		a.get("https://opensource-demo.orangehrmlive.com/");
		a.manage().window().maximize();


		// xpath using unique attributes
		a.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		a.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin@123");
		a.findElement(By.xpath("//input[@id='btnLogin']")).click();

      

	}

}
