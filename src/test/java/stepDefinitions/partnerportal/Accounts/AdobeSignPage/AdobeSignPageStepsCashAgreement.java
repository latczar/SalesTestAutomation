package stepDefinitions.partnerportal.Accounts.AdobeSignPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.partnerportal.Accounts.AdobeSign.AdobeSignPageCashAgreement;
import pageObjects.partnerportal.home.BasePage;

public class AdobeSignPageStepsCashAgreement extends BasePage {
	
	@When("User will click on the start button of the document")
	public void user_will_click_on_the_start_button_of_the_document() throws Exception {
		AdobeSignPageCashAgreement adobesignpage = new AdobeSignPageCashAgreement();
		adobesignpage.clickStartBtnAdobeSign();
	}
	
	@Then("User will sign the required fields on the Cash Agreement document")
	public void user_will_sign_the_required_fields_on_the_cash_agreement_document() throws Exception {
		AdobeSignPageCashAgreement adobesignpage = new AdobeSignPageCashAgreement();
		adobesignpage.clickCustomerInitialField();
		adobesignpage.clickNextRequiredFieldBtn();
		adobesignpage.clickCustomerInitialSecondField();
		adobesignpage.clickNextFieldBtn();
		adobesignpage.clickCustomerSignatureField();
		adobesignpage.clickNextFieldBtn();
		adobesignpage.clickReceiptSignatureField();
		adobesignpage.clickToSignBtn();		
	}

}
