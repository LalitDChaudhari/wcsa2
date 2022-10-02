package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// declaration

	@FindBy(name = "username")
	private WebElement usn;
	@FindBy(name = "pwd")
	private WebElement pass;
	@FindBy(id = "loginButton")
	private WebElement loginbutton;
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement checkBox;
	@FindBy(xpath = "//a[contains(text(),'Actimind Inc.')]")
	private WebElement linkActiTime;
	@FindBy(xpath = "//a[contains(text(),'License')]")
	private WebElement licenselink;
	@FindBy(xpath = "//img[contains(@src,'timer')]")
	private WebElement logoActiTime;
	

	// initialization

	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	// utilization

	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginButton() {
		return loginbutton;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getLinkActiTime() {
		return linkActiTime;
	}

	public WebElement getLicenselink() {
		return licenselink;
	}

	public WebElement getLogoActiTime() {
		return logoActiTime;
	}

	// operational method
	public void validLoginActiTime(String validUsername,String validPassword) throws InterruptedException
	
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginbutton.click();
	}

	public void InvalidLoginActiTime(String InvalidUsername,String InvalidPassword) throws InterruptedException
	{
		usn.sendKeys(InvalidUsername);
		pass.sendKeys(InvalidPassword);
		loginbutton.click();
		Thread.sleep(2000);
		usn.clear();
	}

}
