package xpathLocator;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Way3Syantax2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.selenium.dev/");
		 String text = driver.findElement(By.xpath("//h4[contains(@class,'webdriver')]")).getText();
		 System.out.println(text);
	}

}
