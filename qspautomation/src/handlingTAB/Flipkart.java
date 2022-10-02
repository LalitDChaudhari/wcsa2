package handlingTAB;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException, AWTException {
	

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("https://www.google.com");
	driver.get("https://www.google.com");
	Robot abc = new Robot();
	//transfer control one window to another.
	abc.keyPress(KeyEvent.VK_CONTROL);
	abc.keyPress(KeyEvent.VK_TAB);
	abc.keyRelease(KeyEvent.VK_TAB);
	abc.keyRelease(KeyEvent.VK_CONTROL);
	//Thread.sleep(2000);
//	driver.get("https://www.google.com");
	
	

}
}
