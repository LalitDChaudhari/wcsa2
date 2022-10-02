package singleSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/singleselectdropdown.html");
		
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("misal");
		
		

	}

}

