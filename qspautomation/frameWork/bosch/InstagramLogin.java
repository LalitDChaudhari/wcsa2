package bosch;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFramework.Flib;

public class InstagramLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/InstaTest.xlsx","invalid");
		for(int i=1;i<rc;i++)
		{
			String username = flib.readExcelData("./data/InstaTest.xlsx","invalid", i,0);
			String password = flib.readExcelData("./data/InstaTest.xlsx","invalid", i,1);

			System.out.println(i);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("username")).clear();
			
			
			
		}

	}

}



