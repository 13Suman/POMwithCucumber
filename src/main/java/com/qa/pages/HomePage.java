package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath = "//a[text()='Welcome Admin']")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//b[text()='Admin']")
	WebElement adminLink;
	
	@FindBy(xpath = "//a[text()='Nationalities']")
	WebElement nationality;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	

	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(adminLink).build().perform();
		nationality.click();
		
	}

}
