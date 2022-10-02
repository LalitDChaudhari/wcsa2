package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 
		//Declaration
	
		@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDopDown;
		@FindBy(xpath="//a[contains(text(),'Create new tasks')]")private WebElement createNewTaskLink;
		@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeButton;
		@FindBy(xpath ="//a[text()='Logout']") private WebElement logOutLink;
		
		//Initialization
		
		
	    public HomePage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		
		
		public WebElement getEnterTimeTrackDopDown() 
		{
			return enterTimeTrackDopDown;
		}
		public WebElement getCreateNewTaskLink()
		{
			return createNewTaskLink;
		}
		public WebElement getSaveLeaveTimeButton() 
		{
			return saveLeaveTimeButton;
		}
		public WebElement getLogOutLink()
		{
			return logOutLink;
		}
		
		
		//opertional Methods
		
		public void logoutActiTime()
		{
			logOutLink.click();
		}
		
		
	}


