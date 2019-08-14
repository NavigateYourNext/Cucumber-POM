package com.qa.stepDefination;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBaseClass{

	public HomePageSteps() {

		super();
	}
	
	HomePage hp = new HomePage();

	@Given("^user opens browser$")
	public void user_opens_browser()  {
		// Write code here that turns the phrase above into concrete actions

		TestBaseClass.initialization();

	}

	@When("^user is on login page$")
	public void user_is_on_login_page()  {
		// Write code here that turns the phrase above into concrete actions
		LoginPage lp = new LoginPage();
		String title = lp.validatePageTitle();
		Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Then("^user enters Username and Password$")
	public void user_enters_Username_and_Password()  {
		LoginPage lp = new LoginPage();
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate logged in user$")
	public void validate_logged_in_user()  {
		// Write code here that turns the phrase above into concrete actions

		boolean value = false;
		String title = hp.validateHomePage();

		if(title.contains("Hello"))
			value = true;
		else
			value = false;

		Assert.assertTrue(value);
	}
	
	@Then("^user closed the browser$")
	public void user_closed_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		TestBaseClass.closedBrowser();
	}




}
