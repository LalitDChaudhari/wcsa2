package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagepackage.LoginPage;
@Listeners(CustomListner.class)
public class TestActiTimeInvalidLogin extends BaseTest{


	@Test
	public void invalidLoginTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreads");
		for(int i=1;i<rc;i++)
		{
			lp.InvalidLoginActiTime(flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 0), flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 1));;
		}
	}
}
