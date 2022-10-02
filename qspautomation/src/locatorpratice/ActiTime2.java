package locatorpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("http://127.0.0.1/login.do");
	    String text = driver.getTitle();
	    System.out.println(text);
	    
	   driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   driver.findElement(By.id("loginButton")).click();
	   
	   driver.get("http://127.0.0.1/user/submit_tt.do");
	   String text1 = driver.getTitle();
	   System.out.println(text1);
	}
	


}
