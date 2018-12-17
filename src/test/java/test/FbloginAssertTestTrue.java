package test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.FBLoginPage;
import Pages.FbHomePage;

public class FbloginAssertTestTrue extends TestBase {

	FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
		
	
	FbHomePage fb1 = new FbHomePage();
	
	@Test
	
	public void TestLoginPage (){
		
		
	FBLoginPage loginPage = PageFactory.initElements(driver, FBLoginPage.class);
		
		loginPage.setEmail("9035915124");
		loginPage.setPasswd("selenium!!!");
		loginPage.clickOnLoginButton();

		
	}
	
	@Test(priority=1)
	public void TestAssert () {
		
		
		Assert.assertEquals(homepage.verifyText(), "Find Friends");
		System.out.println("Assert has passed, hence this line executed");

		Assert.assertEquals(homepage.verifyText(), "Find Friendsss", "this assert failed");
		System.out.println("Assert failed, hence this line executed");

		Assert.assertNotEquals(homepage.verifyText(), "Find","nnot equls fails");
		System.out.println("Assert has passed, hence this line executed 1");

	}
	
	//@Test
	public void TestAssertNegation () {
		

	}
	
	
	@ Test(priority=2)
	public void TestLogout() {
		

		
		homepage.clickOnProfileDropDown();
		homepage.clickOnLogOut();
	}
}