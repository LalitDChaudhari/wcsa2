package operationalMethodsOfDropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingTreeset {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/multiselectdropdown.html");
		WebElement multiselected = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselected);
		
		List<WebElement> allOps = sel.getOptions();
		TreeSet<String> set = new TreeSet<String>();
		for(int i=0;i<allOps.size();i++)
		{
			WebElement op = allOps.get(i);
			String text = op.getText();
			set.add(text);
		
		}
		
		for(String abc:set)
		{
			System.out.println(abc);
		}

			

	}

}
