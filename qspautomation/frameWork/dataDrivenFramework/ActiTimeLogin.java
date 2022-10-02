
package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do");
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/TestDataAct.xlsx","validCreads",1,0);
		String password = flib.readExcelData("./data/TestDataAct.xlsx","validCreads",1,1);

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//input[@type='button' and @value='Create New User']")).click();
		Thread.sleep(2000);
		String username1 = flib.readExcelData("./data/TestDataAct.xlsx","validCreads",2,0);
		String password1 = flib.readExcelData("./data/TestDataAct.xlsx","validCreads",2,1);
		String username2 = flib.readExcelData("./data/TestDataAct.xlsx","validCreads",3,0);
		String password2 = flib.readExcelData("./data/TestDataAct.xlsx","validCreads",3,1);
		driver.findElement(By.name("username")).sendKeys(username1);
		driver.findElement(By.name("passwordText")).sendKeys(password1);
		driver.findElement(By.name("passwordTextRetype")).sendKeys(password1);
		driver.findElement(By.name("firstName")).sendKeys(username2);
		driver.findElement(By.name("lastName")).sendKeys(password2);
		driver.findElement(By.name("rightGranted[12]")).click();
		driver.findElement(By.name("rightGranted[2]")).click();
		driver.findElement(By.xpath("//label[@for='right13']")).click();
		driver.findElement(By.xpath("//label[@for='right1']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='CHAUDHARI, LALIT (LALIT)']")).click();
		driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
		Thread.sleep(4000);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		

		
		

	}

}
