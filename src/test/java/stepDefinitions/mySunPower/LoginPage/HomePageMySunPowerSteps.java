package stepDefinitions.mySunPower.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.mySunPower.Login.MySunPowerLoginPage;
import pageObjects.partnerportal.home.BasePage;

public class HomePageMySunPowerSteps extends BasePage{
	
	
	@When("User clicks the phone skip button")
	public void user_clicks_the_phone_skip_button() throws Exception {
		MySunPowerLoginPage mysunpowerloginpage = new MySunPowerLoginPage();
		mysunpowerloginpage.clickSkipPhoneNumBtn();
	}

	@Then("User waits for the Cash Agreement Sign button to be visible and clicks it")
	public void user_waits_for_the_cash_agreement_sign_button_to_be_visible_and_clicks_it() throws Exception {
		MySunPowerLoginPage mysunpowerloginpage = new MySunPowerLoginPage();
		mysunpowerloginpage.signAgreementBtn();
	}

}
