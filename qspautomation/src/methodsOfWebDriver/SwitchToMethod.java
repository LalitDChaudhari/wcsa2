package methodsOfWebDriver;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	
	
	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();//1
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");//2
	      driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);//3
	      
	}
}
