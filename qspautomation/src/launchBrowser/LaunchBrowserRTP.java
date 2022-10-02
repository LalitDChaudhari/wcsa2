package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser name,chrome or browser");
		String browserValue=sc.nextLine();
		
	//browserValue variable contains the name of the browser which is supposed to be opened
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		     WebDriver driver = new ChromeDriver();//open chrome browser
			 driver.manage().window().maximize();// maximize the browser 
			 driver.get("https://www.google.com");// launch the web applications
			 Thread.sleep(5000);// wait 5 seconds 
		}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		     WebDriver driver = new FirefoxDriver();//open chrome browser
			 driver.manage().window().maximize();// maximize the browser 
			 driver.get("https://www.google.com");// launch the web applications
			 Thread.sleep(5000);// wait 5 seconds 
		}
		else
			
		{
			System.out.println("type valid input");
			
			
		}
			
		
		
	}

}
