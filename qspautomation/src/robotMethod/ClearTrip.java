package robotMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearTrip {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cleartrip.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='px-1 plNew  flex flex-middle nmx-1 pb-1']")).click();
		Thread.sleep(3000);
		WebElement abc = driver.findElement(By.xpath("//h2[@class='fs-6 px-4 c-neutral-400 fw-400']"));
		Actions set = new Actions(driver);
		for(int i=0;i<=2;i++)
		{
		set.clickAndHold(abc).perform();
		}
		Robot sfg = new Robot();
		sfg.keyPress(KeyEvent.VK_CONTROL);
		sfg.keyPress(KeyEvent.VK_C);
		sfg.keyRelease(KeyEvent.VK_C);
		sfg.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).click();
		Thread.sleep(3000);
		sfg.keyPress(KeyEvent.VK_CONTROL);
		sfg.keyPress(KeyEvent.VK_V);
		sfg.keyRelease(KeyEvent.VK_V);
		sfg.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		
		
	}

}
