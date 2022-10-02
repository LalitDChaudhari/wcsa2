package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      //without method chaining
	      driver.manage().window().maximize();

	}

}
