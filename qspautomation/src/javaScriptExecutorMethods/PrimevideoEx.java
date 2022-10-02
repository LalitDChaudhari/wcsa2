package javaScriptExecutorMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimevideoEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.primevideo.com/");
	     
		WebElement str = driver.findElement(By.xpath("(//div[@class='DVPAWebWidgetsCustomComponents_Grid__gridItem'])[5]"));
		Point ghr = str.getLocation();
		int xaxis = ghr.getX();
		int yaxis = ghr.getY();
		
		System.out.println(yaxis);
		JavascriptExecutor dfg = (JavascriptExecutor)driver;
		//dfg.executeScript("window.scrollBy("+xaxis+","+(yaxis-50)+")");
       // dfg.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
         for(int i=0;i<5;i++)
         {    Thread.sleep(2000);
        	 dfg.executeScript("window.scrollBy(0,500)");
         }
	}

}
