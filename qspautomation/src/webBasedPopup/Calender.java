package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cleartrip.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='px-1 plNew  flex flex-middle nmx-1 pb-1']")).click();
		Thread.sleep(3000);
	//	Alert abc = driver.switchTo().alert();
		//Thread.sleep(2000);
		//abc.dismiss();
		//driver.findElement(By.xpath("//div[@class='card']/ancestor::div[@class='p-absolute bg-white homeba ml-6 mb-6 btr-8 bbr-8 popup-container show']")).click();
		
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-relative homeCalender']/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Wed Aug 24 2022']")).click();

	}

}
