package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePageSteps extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^User launches the browser$")
	public void user_launches_the_browser()  {
		TestBase.initialization(); 
	}

	@Then("^User is on login Page$")
	public void user_is_on_login_Page() throws Throwable {
		loginpage = new LoginPage();
	   String title= loginpage.validateLoginPageTitle(); 
	   Assert.assertEquals("OrangeHRM",title);
	    
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}

	@Then("^Validate Home Page title$")
	public void validate_Home_Page_title() throws Throwable {
		String homeTitle= homepage.verifyHomePageTitle();
		Assert.assertEquals("OrangeHRM", homeTitle);  
	}
	
	@Then("^Validate logged in user$")
	public void validate_logged_in_user() throws Throwable{
	boolean flag = homepage.verifyCorrectUserName();
	Assert.assertTrue(flag);
	homepage.clickOnNewContactLink();
		
		
		
	}



}
