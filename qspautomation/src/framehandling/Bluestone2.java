package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		
		
	
		driver.switchTo().frame("chat-widget");
		
		driver.findElement(By.xpath("//p[contains(text(),'CHAT')]")).click();
		driver.findElement(By.id("name")).sendKeys("lalit");
		driver.findElement(By.id("email")).sendKeys("lchaudhari@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Phone:' and @class='Linkify']")).sendKeys("09665357762");
		

	}

}
