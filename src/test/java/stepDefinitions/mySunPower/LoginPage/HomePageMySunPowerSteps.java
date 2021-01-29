package stepDefinitions.mySunPower.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.mySunPower.ReviewProposal.ReviewProposalPageMySunPower;
import pageObjects.mySunPower.Login.HomePageMySunPower;
import pageObjects.partnerportal.home.BasePage;

public class HomePageMySunPowerSteps extends BasePage{
	
	
	@When("User clicks the phone skip button")
	public void user_clicks_the_phone_skip_button() throws Exception {
		HomePageMySunPower mysunpowerloginpage = new HomePageMySunPower();
		mysunpowerloginpage.clickSkipPhoneNumBtn();
	}

	@Then("User waits for the Cash Agreement Sign button to be visible and clicks it")
	public void user_waits_for_the_cash_agreement_sign_button_to_be_visible_and_clicks_it() throws Exception {
		HomePageMySunPower mysunpowerloginpage = new HomePageMySunPower();
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
	
	@When("User will click on the Get Credit Approval button")
	public void user_will_click_on_the_get_credit_approval_button() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickGetApprovalBtn();
	}
	
	@Then("User will enter name for Credit Check as {string}")
	public void user_will_enter_name_for_credit_check(String creditCheckName) throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.enterCreditCheckName(creditCheckName);
	}
	
	@Then("User will enter email for Credit Check as {string}")
	public void user_will_enter_email_for_credit_check(String creditCheckEmail) throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.enterCreditCheckEmail(creditCheckEmail);
	}
	
	@Then("User will click accept")
	public void user_will_click_accept() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickCreditCheckAcceptBtn();
	}
	
	@When("User enters {string} years living at this address")
	public void user_enters_years_living_at_this_address(String years) throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.enterYearsAtThisAddress(years);
	}
	
	@Then("User will choose Yes for own or intend to own this home")
	public void user_will_choose_yes_for_own_or_intend_to_own_this_home() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickYesToOwnHome();
	}
	
	@Then("User will select Yes for primary residence")
	public void user_will_select_yes_for_primary_residence() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickYesPrimaryResidence();
	}
	
	@Then("User will click the next button on the Solar Address page")
	public void user_will_click_the_next_button_on_the_solar_address_page() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickSolarAddressNextBtn();
	}
}
