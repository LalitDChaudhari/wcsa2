package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchInstagram{
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//handle Exception
		ChromeDriver driver = new ChromeDriver();//open chrome browser
		driver.manage().window().maximize();//for maxmize
		driver.get("https://www.instagram.com");//open instagram
		
		Thread.sleep(5000);//delay of 5 sec
		driver.close();//close the browser
}

}