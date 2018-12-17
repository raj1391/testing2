package test;
import Pages.FbHomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.FBLoginPage;

public class FbTest extends TestBase {

	@Test
	
	public void testing()
	{
		
		FBLoginPage loginPage = PageFactory.initElements(driver, FBLoginPage.class);
		
		loginPage.setEmail("9035915124");
		loginPage.setPasswd("selenium!!!");
		loginPage.clickOnLoginButton();
		
		FbHomePage HomePage = PageFactory.initElements(driver, FbHomePage.class);
		
		HomePage.clickOnProfileDropDown();
		HomePage.clickOnLogOut();
	}
}