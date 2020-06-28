package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.HomePage;
import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id = "txtPassword")
	WebElement Password;
	
	@FindBy(id = "btnLogin")
	WebElement loginBtn;
	
	@FindBy(id = "logInPanelHeading")
	WebElement loginPnl;
	
	//Initializing Page Objects
		public LoginPage() {
			PageFactory.initElements(driver, this);	
		}
	
		//Actions
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public Boolean validateHrmPanel() {
			return loginPnl.isDisplayed();
		}
		
		public HomePage login(String usr, String pwd) {
			Username.sendKeys(usr);
			Password.sendKeys(pwd);
			loginBtn.click();
			return new HomePage();
		}

}
