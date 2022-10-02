package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickOrRightClickMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("http://127.0.0.1/login.do;jsessionid=gj6vq4kbkajn");
		
		driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.xpath("//a[@class='content administration']")).click();
        driver.findElement(By.xpath("//a[@class='item active']")).click();
		WebElement abc = driver.findElement(By.xpath("//a[.='Logo & Color Scheme' and@class='item' ]"));
		 Actions xyz = new Actions(driver);
		 xyz.contextClick(abc).perform();

	}

}
