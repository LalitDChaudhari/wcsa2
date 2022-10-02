package testpackage;

import java.io.IOException;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagepackage.LoginPage;
@Listeners(CustomListner.class)
public class TestActiTimeValidLogin extends BaseTest   {

	@Test
	public void testvalidlogin() throws IOException
	{
		//object creation
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername=flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		
		//method calling
		lp.validLoginActiTime(validUsername, validPassword);
	}
	

}
