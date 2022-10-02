package methodsOfWebDriver;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	      ChromeDriver driver = new ChromeDriver();
	      // method chaining
	       Options m1= driver.manage();
	       Window w1 = m1.window();
	       w1.maximize();
	      
	}

}
