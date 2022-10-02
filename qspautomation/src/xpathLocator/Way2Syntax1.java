package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2Syntax1{

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	// xpath using text syntax1
	 driver.get("https://www.selenium.dev/");
   String text = driver.findElement(By.xpath("//h4[text()='selenium-webdriver']")).getText();
   System.out.println(text);
   
   
   
   
		
	
	
	}
	
}
