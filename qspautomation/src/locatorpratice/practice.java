package locatorpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodrivers.exe" );
		 ChromeDriver a = new ChromeDriver();
		 a.get("https://www.google.com");
		 a.manage().window().maximize();
		 a.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	 Thread.sleep(3000);
		 a.switchTo().activeElement().sendKeys("javatpoint",Keys.ENTER);
		// Thread.sleep(3000);
		 a.switchTo().activeElement().sendKeys("java Tutorial",Keys.ENTER);
		// Thread.sleep(3000);
         a.navigate().back();
    	 //Thread.sleep(3000);
    	 a.navigate().forward();
    	 //Thread.sleep(3000);
    	 a.navigate().refresh();
    	 
                          
		Point targetPosition = new Point(100,600);
		a.manage().window().setPosition(targetPosition);
        Thread.sleep(2000);
        Dimension targetSize= new Dimension(500,200);
		a.manage().window().setSize(targetSize);
	}
	

}
