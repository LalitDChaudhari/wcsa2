package methodsOfWebElement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//WebElement loginButton = driver.findElement(By.name("signup1"));//Exception
		WebElement loginButton = driver.findElement(By.name("login"));//true
		boolean status = loginButton.isDisplayed();
		System.out.println(status);
		
	}
}