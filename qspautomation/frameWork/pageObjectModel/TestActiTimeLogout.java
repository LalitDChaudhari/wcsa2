package pageObjectModel;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException {
		
         		BaseTest bt = new BaseTest();
         		bt.openBrowser();
         		LoginPage lp = new LoginPage(driver);
         		Flib flib = new Flib();
         		lp.InvalidLoginActiTime(flib.readPropertyfile(PROP_PATH, "username"),flib.readPropertyfile(PROP_PATH, "password"));
         		Thread.sleep(3000);
         		HomePage hp = new HomePage(driver);
         		hp.logoutActiTime();
	}

}
