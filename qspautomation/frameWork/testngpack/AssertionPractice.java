package testngpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/");
	}



	@Test(priority = -1)
	
	public void selenium() throws InterruptedException
	{
		String loginPageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		//softAssert
		softassert.assertEquals(loginPageTitle, "Selenium");

		Reporter.log("login page title is verified",true);
		
		//hard assert
		boolean statusOfusernameTextBox = driver.findElement(By.id("selenium_logo")).isDisplayed();
		Assert.assertEquals(statusOfusernameTextBox, true);
		Reporter.log("logo should be displayed",true);
		softassert.assertAll();

	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
