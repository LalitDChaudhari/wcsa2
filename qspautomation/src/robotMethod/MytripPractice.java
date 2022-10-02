package robotMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MytripPractice {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mytrip.com");
		
		WebElement cvb = driver.findElement(By.xpath("//span[.='One-way']"));
		Actions abc = new Actions(driver);
		abc.contextClick(cvb).perform();
		
		Robot abc2 = new Robot();
		

		for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
			abc2.keyPress(KeyEvent.VK_DOWN);
			
		}
		abc2.keyRelease(KeyEvent.VK_DOWN);
		abc2.keyPress(KeyEvent.VK_ENTER);
		
	}

}
