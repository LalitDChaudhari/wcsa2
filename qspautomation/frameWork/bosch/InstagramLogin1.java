package bosch;

import java.io.IOException;

import org.openqa.selenium.By;

public class InstagramLogin1 extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();//open the browser

		Flib flib = new	Flib();
		//read the data from property file
		String username = flib.readPropertyfile(PROP_PATH1,"username");
		String password = flib.readPropertyfile(PROP_PATH1,"password");

		//valid login

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).clear();

		bt.closeBrowser();//close all browsers

	}

}
