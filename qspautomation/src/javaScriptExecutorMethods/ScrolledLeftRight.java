package javaScriptExecutorMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolledLeftRight {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		Thread.sleep(2000);
		JavascriptExecutor sdf = (JavascriptExecutor)driver;
		sdf.executeScript("window.scrollBy(1000,0)");
		Thread.sleep(2000);
		sdf.executeScript("window.scrollBy(-1000,0)");
	     

	}

}
