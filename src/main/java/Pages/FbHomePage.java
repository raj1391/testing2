package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbHomePage {

	@FindBy (how = How.XPATH , using = "//*[@id='userNavigationLabel']") WebElement HomePageDropDown ; 
//	@FindBy (how = How.XPATH , using = "//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span") WebElement homePageText;
	@FindBy (how = How.PARTIAL_LINK_TEXT , using = "Log Out") WebElement logOutButton;
	@FindBy (how = How.ID , using = "findFriendsNav") WebElement FindFreinds ; 
	
	
	
	public void clickOnProfileDropDown()
	
		{
			
			HomePageDropDown.click();
		}
		
	public void clickOnLogOut()
		{
			
			logOutButton.click();
		}
	
	
	
	public String verifyText()
	
	{
		String exp =  FindFreinds.getText();
		return exp;
	}

}
