package robotMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintPage {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Robot abc = new Robot();
		//generate the print popup
		abc.keyPress(KeyEvent.VK_CONTROL);
		abc.keyPress(KeyEvent.VK_P);
		abc.keyRelease(KeyEvent.VK_P);
		abc.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		//switch control to cancel button 
		abc.keyPress(KeyEvent.VK_TAB);
		abc.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		//press enter to cancel
		abc.keyPress(KeyEvent.VK_ENTER);
		abc.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
