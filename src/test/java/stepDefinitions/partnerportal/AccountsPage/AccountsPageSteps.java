package stepDefinitions.partnerportal.AccountsPage;

import io.cucumber.java.en.Then;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.partnerportal.Accounts.AccountsPage;
import pageObjects.partnerportal.home.BasePage;
import utils.Constant;

public class AccountsPageSteps extends BasePage {
			
	@When("^User navigates to the Accounts page$")
	public void user_navigates_to_the_Accounts_page() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.navigateToAccountsPage();
	}

	@When("^User clicks the New Account button$")
	public void user_clicks_the_New_Account_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickNewAccountbtn();
	}

	@When("^User creates a Residential Customer account in UAT$")
	public void user_creates_a_Residential_Customer_account_in_uat() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.createNewResidentialCustomerAccountForUAT();	    
	}
	
	@When("^User creates a Residential Customer account in QA$")
	public void user_creates_a_Residential_Customer_account_in_qa() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.createNewResidentialCustomerAccountForQA();	    
	}
	
	@When("^User creates a Residential Customer account in ID - QA$")
	public void user_creates_a_Residential_Customer_account_in_id_qa() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.createNewIDResidentialCustomerAccountForQA();	    
	}
		
	@Then("^Residential - New Account page is displayed$")
	public void residential_New_Account_page_is_displayed() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.isNewAccountResidentialFormDisplayed();
	}

	@Then("^User enters his/her Residential First Name as \"([^\"]*)\" and Last Name as \"([^\"]*)\"$")
	public void user_enters_his_her_Residential_First_Name_as_and_Last_Name_as(String firstName, String lastName) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.inputNewResidentialCustomerName(firstName, lastName);
	}
	
	@Then("User enters his\\/her Residential Email as {string} {string}")
	public void user_enters_his_her_residential_email_as(String email, String randNum) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.inputNewEmail(email);
		accountsPage.inputRandomDigits(randNum);
		
	}

	@Then("^User enters his/her Residential Phone Number as \"([^\"]*)\"$")
	public void user_enters_his_her_Residential_Phone_Number_as(String phoneNum) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.inputNewPhoneNumber(phoneNum);
	}

	@Then("^User enters Residential address as \"([^\"]*)\"$")
	public void user_enters_Residential_address_as(String address) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.inputNewAddress(address);
	}
	
	@Then("^User saves the new entry$")
	public void user_saves_the_new_entry() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickSaveBtn();
	}
	
	@Then("^Basic Info page of the Residential Customer is displayed$")
	public void basic_Info_page_of_the_Residential_Customer_is_displayed() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.isBasicInfoPageDisplayed();
	}

	@When("^User clicks on the Qualification tab$")
	public void user_clicks_on_the_Qualification_tab() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickQualificationTab();
	}

	@And("^User edits the Usage Input values$")
	public void user_edits_the_Usage_Input_values() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.editUsageInputvalues();

	}

	@Then("^Electric Rate and Energy Usage modal is displayed$")
	public void electric_Rate_and_Energy_Usage_modal_is_displayed() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.isElectricModalDisplayed();

	}

	@And("^User sets the value for Current Electric Rate$")
	public void user_sets_the_value_for_Current_Electric_Rate_to() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.inputCurrentElectricRate();

	}

	@And("^Sets the value for Proposed Electric Rate$")
	public void sets_the_value_for_Proposed_Electric_Rate() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.inputProposedElectricRate();
	}
	
	@And("^Sets Total Annual Bill to \"([^\"]*)\"$")
	public void sets_Total_Annual_Bill_to(String totalAnnualBill) throws Throwable {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.inputTotalAnnualBill(totalAnnualBill);
	}
	
	@And("User sets the Utility Account Holder")
	public void user_sets_the_utility_account_holder() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.selectUtilityAccountHolderFirstRadioBtn();
	}

	@Then("^User saves the values inputted in the Electric Rate and Energy Usage modal$")
	public void user_saves_the_values_inputted_in_the_Electric_Rate_and_Energy_Usage_modal() throws Throwable {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickEnergyUsageModalSaveBtn();
	}
	
	@When("^User clicks the Quotes tab$")
	public void user_clicks_the_Quotes_tab() throws Throwable {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickQuotesTab();
	}

	@And("^clicks on the New Manual Quote button$")
	public void clicks_on_the_New_Manual_Quote_button() throws Throwable {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickNewManualQuoteBtn();
	}
	
	@And("User will switch back to the original window")
	public void user_will_switch_back_to_the_original_window() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.navigateBackToQuotingPage();
	}
	
	@Then("User will click the Cash Contract button and generate agreement")
	public void user_will_click_the_cash_contract_button_and_generate_agreement() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickCashContractBtn();
		accountsPage.clickComplianceCheckBoxesforCash();
	}
	
	@Then("User will click Send Contract")
	public void user_will_click_send_contract() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickSendFirstContractBtn();
	}
	
	//Start of EDDiE portal Design page steps
	@When("^the EDDiE portal Design page is displayed$")
	public void the_EDDiE_portal_Design_page_is_displayed() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.isEDDiEPortalPageDisplayed();
	}
	
	@And("User enters the module type as {string}")
	public void user_enters_the_module_type_as(String moduleType) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickUserInputModuleTypeBtn(moduleType);
	}
	
	@Then("^User enters the Shading Measurement Date as date today$")
	public void user_enters_the_Shading_Measurement_Date_as() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterShadingDate();
	}
	
	@Then("^User enters the Mounting type to Non-SunPower Ground Mount")
	public void user_enters_the_mounting_type_to_nonsunpower_ground_mount() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickGroundMount();
	}
	
	@Then("User clicks on the SunVault Storage button")
	public void user_clicks_on_the_sun_vault_storage_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.addSunvaultStorage();
	}
	
	@Then("User adds the Front Edge Skirt Accessory")
	public void user_adds_the_front_edge_skirt() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.addFrontEdgeSkirt();
	}
	
	@Then("User adds the Critter Guard Accessory")
	public void user_adds_the_critter_guard() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.addCritterGuard();
	}	
	
	@Then("^clicks on the New Roof button$")
	public void clicks_on_the_New_Roof_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickNewRoofBtn();
	}

	@Then("^New Roof modal is displayed$")
	public void new_Roof_modal_is_displayed() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.isNewRoofModalDisplayed();
	}

	@Then("^User enters a value for Pitch as \"([^\"]*)\"$")
	public void user_enters_a_value_for_Pitch_as(String pitchValue) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterPitch(pitchValue);
	}

	@Then("^User enters a value for Azimuth as \"([^\"]*)\"$")
	public void user_enters_a_value_for_Azimuth_as(String azimuthValue) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterAzimuth(azimuthValue);
	}

	@Then("^User enters a value for Module Count as \"([^\"]*)\"$")
	public void user_enters_a_value_for_Module_Count_as(String moduleCountValue) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterModuleCount(moduleCountValue);
	}

	@Then("^User enter values for Roof Solar Access Percentages for Jan-Dec as \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" ,"
			+ " \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void user_enter_values_for_Roof_Solar_Access_Percentages_for_Jan_Dec_as(String solarValueJan, String solarValueFeb,
			String solarValueMar, String solarValueApr,	String solarValueMay, String solarValueJun, String solarValueJul,
			String solarValueAug, String solarValueSep, String solarValueOct, String solarValueNov, String solarValueDec) throws Throwable {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterSolarPercentages(solarValueJan, solarValueFeb, solarValueMar, solarValueApr, solarValueMay,
				solarValueJun, solarValueJul, solarValueAug, solarValueSep, solarValueOct, solarValueNov, solarValueDec);
	}

	@Then("^User saves the changes$")
	public void user_saves_the_changes() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickNewRoofSaveChangesBtn();
	}

	@When("^User clicks the Quote Settings button$")
	public void user_clicks_the_Quote_Settings_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickQuoteSettingsBtn();
	}
	
	@And("User enters {string} for the new Quote Name")
		public void user_enters_for_the_quote_name(String quoteNameNewValue) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterQuoteName(quoteNameNewValue);
	}

	@Then("^the Quote Settings modal is displayed$")
	public void the_Quote_Settings_modal_is_displayed() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.isQuoteSettingsModalDisplayed();
	}
	
	@Then("User enters {string} in the Override Rebate tab")
	public void user_enters_in_the_override_rebate_tab(String overrideRebateValue) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterOverrideEstimateCashLeaseLoan(overrideRebateValue);
	}
	
	@Then("User clicks the show Cash option")
	public void user_unticks_the_show_cash_option() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickCashOptionTab();
		accountsPage.clickCheckboxCashShowOption();
	}

	@Then("^User enters \"([^\"]*)\" in the Price Per Watt tab for Cash option$")
	public void user_enters_in_the_Price_Per_Watt_tab_for_Cash_option(String cashPricePerWatt) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterCashPricePerWattValue(cashPricePerWatt);
	}
	
	@Then("User enters {string} in the Gross Price tab for Cash option")
	public void user_enters_in_the_gross_price_tab_for_cash_option(String cashGrossPrice) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
	    accountsPage.enterCashGrossPriceValue(cashGrossPrice);
	}
	
	@Then("User enters {string} in the Storage Dealer Commission tab for Cash option")
	public void user_enters_in_the_storage_dealer_commission_tab_for_cash(String cashStorageDealerCommission) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterCashStorageDealerComm(cashStorageDealerCommission);
	}	
	
	@Then("^User clicks the show Lease option$")
	public void user_checks_the_show_Lease_option() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickLeaseOptionTab();
		accountsPage.clickCheckboxLeaseLoanShowOption();
	}
	
	@Then("^User enters \"([^\"]*)\" in the Price Per Watt tab for Lease option$")
	public void user_enters_in_the_Price_Per_Watt_tab_for_Least_option(String leasePricePerWatt) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterLeasePricePerWatt(leasePricePerWatt);
	}
	
	@Then("User enters {string} in the Price Per kWh tab for Lease option")
	public void user_enters_in_the_price_per_k_wh_tab_for_lease_option(String leasePricePerkWh) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterLeasePricePerkWhValue(leasePricePerkWh);
	}
	
	@Then("User clicks on the Price Per kWh RUN button")
	public void user_clicks_on_the_price_per_k_wh_run_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickLeasePricePerkWhRun();		
	}
	
	@Then("User enters {string} in the Gross Price tab for Lease option")
	public void user_enters_in_the_gross_price_tab_for_lease_option(String leaseGrossPrice) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
	    accountsPage.enterLeaseGrossPriceValue(leaseGrossPrice);
	}
	
	@Then("User enters {string} in the Storage Dealer Commission tab for Lease option")
	public void user_enters_in_the_storage_dealer_commission_tab_for_lease(String leaseStorageDealerCommission) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterLeaseStorageDealerComm(leaseStorageDealerCommission);
	}

	@Then("^User clicks the show Loan option$")
	public void user_checks_the_show_Loan_option() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickLoanOptionTab();
		accountsPage.clickCheckboxLeaseLoanShowOption();
	}
	
	@Then("^User checks the show Loan option for OR$")
	public void user_checks_the_show_Loan_option_for_OR() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickORLoanOptionTab();
		accountsPage.clickCheckboxLeaseLoanShowOption();
	}

	@Then("^User enters \"([^\"]*)\" in the Price Per Watt tab for Loan option$")
	public void user_enters_in_the_Price_Per_Watt_tab_for_Loan_option(String loanPricePerWatt) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterLoanPricePerWatt(loanPricePerWatt);
	}
	
	@Then("User enters {string} in the Storage Dealer Commission tab for Loan option")
	public void user_enters_in_the_storage_dealer_commission_tab_for_loan(String loanStorageDealerCommission) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.enterLoanStorageDealerComm(loanStorageDealerCommission);
	}
	
	@Then("User enters {string} in the Gross Price tab for Loan option")
	public void user_enters_in_the_gross_price_tab_for_loan_option(String loanGrossPrice) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
	    accountsPage.enterLoanGrossPriceValue(loanGrossPrice);
	}
	
	@Then("User enters {string} as Custom Adders for Loan")
	public void user_enters_as_Custom_Adders_for_Loan(String loanCustomAdders) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
	    accountsPage.enterLoanCustomAdders(loanCustomAdders);
	}
	
	
	@Then("^clicks on save changes for the Quote Settings modal$")
	public void clicks_on_save_changes_for_the_Quote_Settings_modal() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickQuoteSettingsSaveChanges();
	}

	@Then("^User clicks on the Save Design button$")
	public void user_clicks_on_the_Save_Design_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickEddieSaveDesignBtn();
	}
	
	@When("^the EDDiE portal Design page will calculate savings$")
	public void the_EDDiE_portal_Design_page_will_calculate_savings() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.isViewEstimatedSavingsBtnDisplayed();
	}

	@Then("^User will click on View Estimated Savings button$")
	public void user_will_click_on_View_Estimated_Savings_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickEddieViewEstimatedSavingsBtn();
	}
	
	@And("^User will click on the EDDiE Savings button$")
	public void user_will_click_on_the_EDDiE_Savings_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickEddieSavingsMenuBtn();
	}

	@Then("^the EDDiE portal Savings page will be displayed$")
	public void the_EDDiE_portal_Savings_page_will_be_displayed() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.isEstimatedAverageSavingsTextDisplayed();
	}
	
	@And("^User will click the arrow button to select preferred payment option as Cash$")
	public void user_will_click_the_arrow_button_to_select_preferred_payment_option_as_Cash() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnShowBtn();
		accountsPage.clickOnSelectCashPayment();
	}
	
	@And("^User will click the arrow button to show the FO payment details$")
	public void user_will_click_the_arrow_button_to_show_the_FO_payment_details() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnShowBtn();
	}
	
	@Then("User will click on the Calculator tab of the Loan Pricing pane")
	public void user_will_click_on_the_calculator_tab_of_the_loan_pricing_pane() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnShowBtn();
		accountsPage.clickOnLoanCalculatorBtn();
	}
	
	@When("User will click on Edit Loan")
	public void user_will_click_on_Edit_Loan() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnEditLoanBtn();
	}
	
	@And("^User will add a CoPayment input as \"([^\"]*)\"$")
	public void user_will_add_a_co_payment_input_as(String coPaymentInput) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnCoPayment(coPaymentInput);
	}	
	
	@And("User will enter {string} as the Loan Term")
	public void user_will_enter_as_the_Loan_Term(String loanTerm) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnTerm(loanTerm);
	}
	
	@And("User will enter {string} as the APR")
	public void user_will_enter_as_the_APR(String aprType) throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnAPR(aprType);
	}
		
	@Then("^User will click on the Save Pricing button")
	public void user_will_click_on_the_save_pricing_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnSavePricingButton();
	}
	
	@And("^User will click lock the quote  with the preferred payment option$")
	public void user_will_lock_the_quote_with_the_preferred_payment_option() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnSelectLoanPayment();
	}
	
	@And("^User will click the arrow button to select preferred payment option as Loan$")
	public void user_will_click_the_arrow_button_to_select_preferred_payment_option_as_Loan() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnShowBtn();
		accountsPage.clickOnSelectLoanPayment();
	}
	
	@And("^User will click the arrow button to edit lease information$")
	public void user_will_click_the_arrow_button_to_edit_lease_information() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnShowBtn();
		accountsPage.clickEditLeaseBtn();
		accountsPage.clickFullPrepaymentBtn();
		accountsPage.clickSaveBtnEditLeaseBtn();
	}
	
	@And("User will click the arrow button to edit lease information and selects a Down Payment value")
	public void user_will_click_the_arrow_button_to_edit_lease_information_and_select_down_payment_value() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnShowBtn();
		accountsPage.clickEditLeaseBtn();
		accountsPage.clickDownPaymentValue();
		accountsPage.clickSaveBtnEditLeaseBtn();
	}
	
	@And("User will click the Full Prepayment for this Quote")
	public void user_will_click_the_full_prepayment_for_this_quote() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickEditLeaseBtn();
		accountsPage.clickFullPrepaymentBtn();
		accountsPage.clickSaveBtnEditLeaseBtn();
	}
	
	@And("^User will click the arrow button to select preferred payment option as Lease$")
	public void user_will_click_the_arrow_button_to_select_preferred_payment_option_as_Lease() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnShowBtn();
		accountsPage.clickOnSelectLeasePayment();
	}
	
	@Then("^User will click the View Proposal button$")
	public void user_will_click_the_View_Proposal_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnViewProposalCashBtn();
	}
	
	@Then("User will click on the Contract for Cash and will send it via Email")
	public void user_will_click_on_the_contract_for_cash_and_will_send_it_via_email() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		Constant.agreementName = BasePage.getTextFromFirstContract();
		System.out.println("Agreement Name = " + Constant.agreementName);
		accountsPage.clickOnContractOne();
		accountsPage.clickOnSendOptionsEmail();
		accountsPage.clickComplianceCheckBoxesforLoan();
		accountsPage.clickOnSendProposalsToMySunPowerBtn();
		accountsPage.clickOnSendProposalBtn();
	}
	
	@And("User will refresh the page")
	public void user_will_refresh_the_page() throws Exception {
		sleepRefreshPage();
	}
	
	@Then("User will click the Contract for Loan and will send it via Email")
	public void user_will_click_on_the_contract_for_loan_and_will_send_it_via_email() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnContractOne();
		accountsPage.clickOnSendOptionsEmail();
		accountsPage.clickComplianceCheckBoxesforLoan();
		accountsPage.clickOnSendProposalsToMySunPowerBtn();
		accountsPage.clickOnSendProposalBtn();
	}
	
	@Then("User will click the Draft Lease Contract button")
	public void user_will_click_the_draft_lease_contract_button() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickDraftLeaseContractBtn();
		accountsPage.clickComplianceCheckBoxesforLoan();
		Constant.agreementName = BasePage.getTextFromFirstContract();
		System.out.println("Agreement Name = " + Constant.agreementName);
	}
	
	@Then("User will click the Contract for Lease and will send it via Email")
	public void user_will_click_on_the_contract_for_lease_and_will_send_it_via_email() throws Exception {
		AccountsPage accountsPage = new AccountsPage();
		accountsPage.clickOnContractOne();
		accountsPage.clickOnSendOptionsEmail();
		accountsPage.clickOnSendProposalsToMySunPowerBtn();
		accountsPage.clickOnSendProposalBtn();
	}
}
