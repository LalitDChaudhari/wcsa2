package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrice {
	public static void main(String[] args) throws InterruptedException {
		  
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		 driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("oppof11");
		 driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
		 Thread.sleep(3000);
		 String Priceoff11 = driver.findElement(By.xpath("(//div[.='OPPO F11 (Marble Green, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		 System.out.println("Price of f11 :"+Priceoff11);
		 
	}

}
