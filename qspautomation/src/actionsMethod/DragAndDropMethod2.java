package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("//a[.=' BANK ' and @class='button button-orange']"));
       Thread.sleep(3000);
        WebElement target1 = driver.findElement(By.xpath("//div[@class='shoppingCart' and @id='shoppingCart1']"));
        
        Actions set = new Actions(driver);
        set.dragAndDrop(target, target1).perform();
	}

}
