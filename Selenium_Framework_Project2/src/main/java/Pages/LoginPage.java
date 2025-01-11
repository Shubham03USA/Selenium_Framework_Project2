package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase
{
	
	// Object Repository find out by @Findby annotation
	
	@FindBy(xpath = "//input[@name='user-name']") private WebElement userTxtBox;
	@FindBy(xpath = "//input[@name='password']") private WebElement passwordTxtBox;
	@FindBy(xpath = "//input[@name='login-button']") private WebElement loginbtn;
	
	
	
	public LoginPage()
	{
		super();
		PageFactory.initElements(driver,this);
	}
	
	public String loginToApplication()
	{
		userTxtBox.sendKeys("standard_user");
		passwordTxtBox.sendKeys("secret_sauce");
		loginbtn.click();;
		return driver.getCurrentUrl();
		
	}

	public String verifyTitleofApplication()
	{
		return driver.getTitle();
	}
	
	public String verifyURLofApplication()
	{
		return driver.getCurrentUrl();
	}

}
