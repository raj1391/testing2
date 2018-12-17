package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBLoginPage {

	WebDriver driver;
	
	@FindBy (how = How.ID, using = "email") WebElement loginUsername;
	@FindBy(how = How.ID, using = "pass") WebElement loginPassword;
	@FindBy(how = How.ID, using = "loginbutton") WebElement LoginButton;
	
	public void setEmail(String userEmail)
	
	{
		loginUsername.sendKeys(userEmail);
	}
	
	public void setPasswd(String userPass)
	
	{
		loginPassword.sendKeys(userPass);
	}
	
	public void clickOnLoginButton()
	
	{
		LoginButton.click();
	}
}
