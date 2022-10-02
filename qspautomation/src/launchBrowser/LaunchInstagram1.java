package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchInstagram1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	   FirefoxDriver driver = new FirefoxDriver();//open firefox browser
	   driver.manage().window().maximize();
	   driver.get("https://www.instagram.com");//open 
	   
	   Thread.sleep(5000);
	   driver.close();
		
	}
	
}
