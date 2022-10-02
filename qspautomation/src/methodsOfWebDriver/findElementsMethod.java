package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("bike");
		Thread.sleep(2000);

		List<WebElement> webElementSuggesion = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));

		//for loop
		//  for(int i=0;i<webElementSuggesion.size();i++)
		//{
		// WebElement sugg = webElementSuggesion.get(i);
		//String textOfSugg = sugg.getText();
		//Thread.sleep(2000);
		// System.out.println(textOfSugg);
		// }
       
	    //for each loop
		for(WebElement sugg:webElementSuggesion)
		{
			String textOfWebelement = sugg.getText();
			System.out.println(textOfWebelement);
		}
		}
	

	}


