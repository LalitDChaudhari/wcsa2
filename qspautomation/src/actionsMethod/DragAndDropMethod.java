package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(3000);
		//WebElement abc = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement abc = driver.findElement(By.xpath("//img[contains(@src,'images/high_tatras_')]"));
		Thread.sleep(2000);
		WebElement xyz = driver.findElement(By.id("trash"));
		Actions act = new Actions(driver);
		act.dragAndDrop(abc, xyz).perform();




	}

}
