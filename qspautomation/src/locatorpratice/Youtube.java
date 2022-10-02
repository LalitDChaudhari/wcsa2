package locatorpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("old song");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	driver.findElement(By.xpath("//div[@id='dismissible']")).click();
	WebElement abc = driver.findElement(By.xpath("//button[@title='Full screen (f)']"));
	Thread.sleep(2000);
//	Actions ac = new Actions(driver);
//	ac.doubleClick(abc);
	driver.manage().window().fullscreen();
	}

}
