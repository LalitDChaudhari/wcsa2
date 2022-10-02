package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.calculator.net/");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@onclick=\"r('+')\" and @class='sciop']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@onclick=\"r('-')\" and @class='sciop']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@onclick=\"r('*')\" and @class='sciop']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		 driver.navigate().refresh();
		 driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@onclick=\"r('/')\" and @class='sciop']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
		
		
		 
	}

}
