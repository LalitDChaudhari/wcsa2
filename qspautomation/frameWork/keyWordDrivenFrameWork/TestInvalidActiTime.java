package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestInvalidActiTime extends BaseTest {


	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();//open the browser 

		//start reading invalid data
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestdataAct.xlsx","invalidcreads");

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData("./data/TestDataAct.xlsx","invalidcreads",i,0);

			String password = flib.readExcelData("./data/TestDataAct.xlsx","invalidcreads",i,1);

			System.out.println(i);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("username")).clear();
		}

		//close all the browsers
		bt.closeBrowser();

}

}
