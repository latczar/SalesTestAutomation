package stepDefinitions.mySunPower.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.mySunPower.Login.LoginPageMySunPower;
import pageObjects.mySunPower.ReviewProposal.ReviewProposalPageMySunPower;
import pageObjects.mySunPower.Login.LoginPageMySunPower;
import pageObjects.partnerportal.home.BasePage;

public class HomePageMySunPowerSteps extends BasePage{
	
	
	@When("User clicks the phone skip button")
	public void user_clicks_the_phone_skip_button() throws Exception {
		LoginPageMySunPower mysunpowerloginpage = new LoginPageMySunPower();
		mysunpowerloginpage.clickSkipPhoneNumBtn();
	}

	@Then("User waits for the Cash Agreement Sign button to be visible and clicks it")
	public void user_waits_for_the_cash_agreement_sign_button_to_be_visible_and_clicks_it() throws Exception {
		LoginPageMySunPower mysunpowerloginpage = new LoginPageMySunPower();
		mysunpowerloginpage.signAgreementBtn();
	}
	
	@And("User will click on the Review & Sign Proposal")
	public void user_will_click_on_the_review_and_sign_proposal() throws Exception {
		ReviewProposalPageMySunPower reviewproposalpage = new ReviewProposalPageMySunPower();
		reviewproposalpage.clickReviewAndSignProposalBtn();
	}
	
	@Then("User will click on the MySunPower Create Account button")
	public void user_will_click_on_the_mysunpower_create_account_button() throws Exception {
		ReviewProposalPageMySunPower reviewproposalpage = new ReviewProposalPageMySunPower();
		reviewproposalpage.clickCreateAccountBtn();
	}
}
