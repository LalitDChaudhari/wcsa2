package testpackage;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.LoginPage;
import pagepackage.UserPage;
@Listeners(CustomListner.class)
public class TestActiTimeCreateUser extends BaseTest {
	
	@Test
	public void createuserActitime() throws IOException, InterruptedException, AWTException
	{
	//object creation
	LoginPage lp = new LoginPage(driver);
	Flib flib = new Flib();

	//method calling
	lp.validLoginActiTime(flib.readPropertyFile(PROP_PATH,"username"), flib.readPropertyFile(PROP_PATH, "password"));

	UserPage up = new UserPage(driver);
	up.clickOnusersTab();
	Thread.sleep(3000);
	up.createUserAccount("lalitchaudhari", "lalit19","lalit19", "lalit", "chaudhari");
	Thread.sleep(3000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(up.getSuccessmsg(),"created"));
	up.clickOnusersTab();
	up.deleteTheCreatedUser("");


	WebDriverCommonLib wb = new WebDriverCommonLib();
	wb.hitTheEnterButton();

	}

	
	


	
	

}
