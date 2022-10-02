package multiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Durations;

public class DeselectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/multiselectdropdown.html");
      
		Thread.sleep(3000);
		//WebElement ssdropdown = driver.findElement(By.id("menu"));
		//Select sel = new Select(ssdropdown);
		//sel.selectByIndex(5);
		//Thread.sleep(2000);
		//sel.deselectByIndex(5);
		
		WebElement multiselected = driver.findElement(By.id("menu"));
		Select sel1 = new Select(multiselected);
		sel1.selectByValue("v3");
		Thread.sleep(2000);
		sel1.deselectByIndex(2);
		
				
	}

}