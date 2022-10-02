package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTimeTest {

	@Test(priority = 1)
	public void loginActiTime()
	{
		Reporter.log("Login ActiTime",true);
	}

	@Test(priority = 2)
	public void createUserActiTime()
	{
		Reporter.log("Create User ",true);
	}

	@Test(priority = 3)
	public void logoutActiTime()
	{
		Reporter.log("logout Actitime ",true);
	}
}

