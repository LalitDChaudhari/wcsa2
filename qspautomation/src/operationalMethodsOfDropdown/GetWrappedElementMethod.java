package operationalMethodsOfDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/QSP/Desktop/wcsa2htmldocs/multiselectdropdown.html");
			WebElement multiselectdd = driver.findElement(By.id("menu"));
			Select sel = new Select(multiselectdd);
			
			WebElement op = sel.getWrappedElement();
			String options = op.getText();
			System.out.println(options);

	}

}
