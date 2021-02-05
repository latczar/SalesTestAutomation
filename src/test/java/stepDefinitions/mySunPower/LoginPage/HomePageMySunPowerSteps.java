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
	
	@And("User will enter the date of birth as {string}")
	public void user_will_enter_the_date_of_birth_as(String date) throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.enterDateOfBirth(date);
	}
	
	@Then("User will enter Social Security Number as {string}")
	public void user_will_enter_social_security_number_as(String socialNumber) throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.enterSocialSecurityNumber(socialNumber);
	}
	
	@When("User adds the Individual Annual Income as {string}")
	public void user_adds_the_individual_annual_income_as(String individualIncome) throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.enterIndividualAnnualIncome(individualIncome);
	}
	
	@When("Household Annual Income as {string}")
	public void household_annual_income_as(String houseHoldIncome) throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.enterHouseholdIncome(houseHoldIncome);
	}
	
	@When("Monthly Mortgage Payment as {string}")
	public void monthly_mortgage_payment_as(String monthlyMortgage) throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.enterMortgagePayment(monthlyMortgage);
	}
	
	@When("the User is Retired")
	public void the_user_is_retired() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickRetiredCheckbox();
	}
	
	@Then("User will click Next on the Credit Approval page")
	public void user_will_click_next_on_the_credit_approval_page() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickNextBtn();
	}
	
	@Then("User agrees to the terms")
	public void user_agrees_to_the_terms() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickTermsAbove();
	}
	
	@Then("User clicks Submit on the Credit Approval page")
	public void user_clicks_submit_on_the_credit_approval_page() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickCreditApprovalPageSubmitBtn();
	}
	
	@When("the Credit Check is Approved")
	public void the_credit_check_is_approved() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.isCreditApprovalApprovedDisplayed();
	}
	
	@Then("User will click Next to Review Agreement in QA Env")
	public void user_will_click_next_to_review_agreement() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickQANextReviewAgreementBtn();
	}
	
	@When("the User is on the Sign Agreement page")
	public void the_user_is_on_the_sign_agreement_page() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.isSignAgreementDisplayed();
	}
	
	@Then("User will sign the ACH Opt In form")
	public void user_will_sign_the_ach_opt_in_form() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickAchOptInFormBtn();
	}
	
	@Then("after the ACH OPT IN form is signed")
	public void after_the_ach_opt_in_form_is_signed() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.isACHOptInSignedDisplayed();
	}
	
	@Then("User will sign the Loan Agreement Package")
	public void user_will_sign_the_loan_agreement_package() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.clickLoanAgreementSignBtn();
	}
	
	@Then("the Agreement is Signed - Pending Further Action is displayed")
	public void the_agreement_is_signed_pending_further_action_is_displayed() throws Exception {
		HomePageMySunPower homepage = new HomePageMySunPower();
		homepage.isAgreementSignedPendingActionDisplayed();
	}
}
