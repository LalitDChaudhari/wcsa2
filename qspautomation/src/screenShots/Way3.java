package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		RemoteWebDriver rwd =(RemoteWebDriver)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("http://www.selenium.dev");
         
         File src = rwd.getScreenshotAs(OutputType.FILE);
         File dest = new File("./screenShots/screenShot3.jpg");
         Files.copy(src, dest);


	}

}
