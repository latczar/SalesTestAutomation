package stepDefinitions.partnerportal.AccountsPage.StackOverflowApp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.partnerportal.Accounts.AccountsPage;
import pageObjects.partnerportal.Accounts.GmailApp.GmailAppPage;
import pageObjects.partnerportal.Accounts.StackOverflow.StackOverflowAppPage;
import pageObjects.partnerportal.home.BasePage;

public class StackOverflowAppSteps extends BasePage {
	
	@Then("User will open the StackOverflow app")
	public void user_will_open_the_stack_overflow_app() {
		StackOverflowAppPage stackoverflowpage = new StackOverflowAppPage();
		stackoverflowpage.navigateToStackOverflowApp();		
	}
	
	@Then("User will click the Log in button")
	public void user_will_click_the_log_in_button() throws Exception {
		StackOverflowAppPage stackoverflowpage = new StackOverflowAppPage();
		stackoverflowpage.clickSOLogInBtn();

	}
}
