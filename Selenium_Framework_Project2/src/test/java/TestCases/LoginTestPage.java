package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginTestPage extends TestBase
{
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		login = new LoginPage();
		
	}
	@Test
	public void verifyTitleofApplication()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitleofApplication();
		Assert.assertEquals(expTitle,actTitle);
	}
	
	@Test
	public void verifyURLofApplication()
	{
		String expURL = "https://www.saucedemo.com/";
		String actURL = login.verifyURLofApplication();
		Assert.assertEquals(expURL, actURL);
	}
	
	@Test
	public void loginToApplication()
	{
		String expURL = "https://www.saucedemo.com/inventory.html";
		String actURL = login.loginToApplication();
		Assert.assertEquals(expURL, actURL);
	}
	
	@AfterMethod(alwaysRun = true)
	public void CloseBrowser()
	{
		driver.close();
	}

}
