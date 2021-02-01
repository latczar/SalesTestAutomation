package stepDefinitions.partnerportal.AccountsPage.GmailApp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.mySunPower.ReviewProposal.ReviewProposalPageMySunPower;
import pageObjects.partnerportal.Accounts.GmailApp.GmailAppPage;
import pageObjects.partnerportal.home.BasePage;
import utils.Constant;

public class GmailAppSteps extends BasePage {
	
	@Then("User will open the Gmail app")
	public void user_will_open_the_gmail_app() {
		GmailAppPage gmailAppPage = new GmailAppPage();
		gmailAppPage.navigateToGmailApp();
	}
	
	@Then("User will enter username and password credentials for the User")
	public void user_will_enter_username_and_password_credentials_for_the_User() throws Exception {
		GmailAppPage gmailAppPage = new GmailAppPage();
		Thread.sleep(3000);
		gmailAppPage.gmailInputEmail();
		Thread.sleep(3000);
		gmailAppPage.gmailInputPassword();

	}
	
	@Then("User will enter username and password credentials for the Partner")
	public void user_will_enter_username_and_password_credentials_for_the_Partner() throws Exception {
		GmailAppPage gmailAppPage = new GmailAppPage();
		gmailAppPage.gmailInputEmail();
		gmailAppPage.gmailInputPassword();

	}
	
	@Then("User will navigate back to Gmail app")
	public void user_will_navigate_back_to_gmail_app() {
		GmailAppPage gmailAppPage = new GmailAppPage();
		gmailAppPage.navigateBackToGmailApp();
	}
	
	@Then("User will click on the SunPower Cash Agreement email to Review and Sign")
	public void user_will_click_on_the_sun_power_cash_agreement_email_to_review_and_sign() throws Exception {
		GmailAppPage gmailAppPage = new GmailAppPage();
		gmailAppPage.retryingFindClickEmail("Your Paperwork is Ready to Sign in mySunPower");
		gmailAppPage.retryingFindClickViewGetReviewAndSign(GmailAppPage.THANKSFORCHOOSINGTXT, GmailAppPage.SIGNAGREEMENTBTN);
		
	}
	
	@Then("User will click on the SunPower Counter Sign Cash Agreement email to Review and Sign")
	public void user_will_click_on_the_sun_power_counter_sign_cash_agreement_email_to_review_and_sign() throws Exception {
		GmailAppPage gmailAppPage = new GmailAppPage();
		gmailAppPage.retryingFindClickEmail("Your Paperwork is Ready to Sign in mySunPower");
		gmailAppPage.retryingFindClickViewGetReviewAndSign(GmailAppPage.THANKSFORCHOOSINGTXT, GmailAppPage.SIGNAGREEMENTBTN);
		
	}

	@Then("User will navigate to Gmail app")
	public void user_will_navigate_to_gmail_app() {
		GmailAppPage gmailAppPage = new GmailAppPage();
		gmailAppPage.navigateToGmailApp();
	}
	
	@And("User will click on the Going Solar with SunPower email to Get Started")
	public void user_will_click_on_the_going_solar_with_sunpower_email_to_get_started() throws Exception {
		GmailAppPage gmailAppPage = new GmailAppPage();
		gmailAppPage.retryingFindClickEmail("Next Steps For Going Solar with SunPower");
		gmailAppPage.retryingFindClickViewGetReviewAndSign(GmailAppPage.GETSTARTEDBTN, GmailAppPage.GETSTARTEDBTN);
	}
	
	@Then("User will click on the Next Steps in Going Solar email to View Proposal")
	public void user_will_click_on_the_next_steps_in_going_solar_email_to_view_proposal() throws Exception {
		GmailAppPage gmailAppPage = new GmailAppPage();
		Thread.sleep(20000);
		gmailAppPage.retryingFindClickEmail("Next Steps in Going Solar");
		Thread.sleep(3000);
		gmailAppPage.retryingFindClickViewGetReviewAndSign(GmailAppPage.VIEWPROPOSALBTN, GmailAppPage.VIEWPROPOSALBTN);
		Thread.sleep(5000);
		waitForVisibleElement(driver, ReviewProposalPageMySunPower.MYSUNPOWERCREATEACCTBTN);
	}
}
