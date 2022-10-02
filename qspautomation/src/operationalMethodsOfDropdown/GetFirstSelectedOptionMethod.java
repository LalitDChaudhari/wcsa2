package operationalMethodsOfDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class GetFirstSelectedOptionMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/multiselectdropdown.html");
		
		WebElement multiselect = driver.findElement(By.name("menu"));
       Select sel = new Select(multiselect);
		
		for(int i=2;i<=6;i++)
		{
			sel.selectByIndex(i);
		}
		
		WebElement op = sel.getFirstSelectedOption();
		String textOfFirstSelectedop = op.getText();
		System.out.println(textOfFirstSelectedop);
		

		// String op = sel.getFirstSelectedOption().getText();
		 //System.out.println(op);
}
}

