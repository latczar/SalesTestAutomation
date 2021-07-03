package stepDefinitions.partnerportal.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.partnerportal.LoginPage.LoginPage;
import pageObjects.partnerportal.home.BasePage;
import utils.Constant;

public class LoginPageSteps {
		
	//For QA
	
	@Given("^User navigates to SunPower Partner Portal using \"([^\"]*)\" browser$")
	public void user_navigates_to_SunPower_Partner_Portal_using_browser(String browser) throws Exception {
		BasePage.initialize(browser, Constant.qaPartnerPortal);
	}
	
	@Given("^User navigates to UAT SunPower Partner Portal using \"([^\"]*)\" browser$")
	public void user_navigates_to_UAT_SunPower_Partner_Portal_using_browser(String browser) throws Exception {
		BasePage.initialize(browser, Constant.UATPartnerPortal);
	}
	
	@When("^User logs in at QA as TPS$")
	public void user_logs_in_at_qa_as_tps() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsTPSQA(Constant.QATPSUser, Constant.QATPSPass);
	}
	
	@When("^User logs in at QA as ID$")
	public void user_logs_in_at_qa_as_id() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsIndirectPartnerQA(Constant.QAIndirectPartnerEugeneBuenUser, Constant.QAIndirectPartnerEugeneBuenPass);
	}
	
	@When("^User logs in at QA as SPD$")
	public void user_logs_in_at_qa_as_spd() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsSPDQA(Constant.QASPDEmilySabetUser, Constant.QASPDEmilySabetPass);
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//For UAT
	
	/*@Given("^User navigates to SunPower UAT Partner Portal using \"([^\"]*)\" browser$")
	public void user_navigates_to_SunPower_Uat_Partner_Portal_using_browser(String browser) throws Exception {
		BasePage.initialize(browser, Constant.UATPartnerPortal);
	}*/
	
	@When("User logs in at UAT as ND")
	public void user_logs_in_at_uat_as_nd() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsTPSUAT(Constant.UATNDGabiTPSUser, Constant.UATNDGabiTPSPass);
	}
	
	@When("User logs in at UAT as an ID")
	public void user_logs_in_at_uat_as_indirect() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsIndirectPartnerUAT(Constant.UATIndirectPartnerEugeneCBuenUser, Constant.UATIndirectPartnerEugeneCBuenPass);
	}
	
	@When("User logs in at UAT as SPD")
	public void user_logs_in_at_uat_as_spd() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsSPDUAT(Constant.UATSPDEugeneBuenUser, Constant.UATSPDEugeneBuenPass);
	}
	
	/*always include RunListEndFlag for end of test scenarios*/
	@Then("^User ends the test scenario$")
	public void user_ends_the_test_scenario() throws Throwable {
		BasePage.RunListEndFlag();
	}
	
	//For PROD
		
	@Given("^User navigates to PROD SunPower Partner Portal using \"([^\"]*)\" browser$")
	public void user_navigates_to_PROD_SunPower_Partner_Portal_using_browser(String browser) throws Exception {
		BasePage.initialize(browser, Constant.PRODPartnerPortal);
	}
	
	@When("User logs in at PROD as ND")
	public void user_logs_in_at_prod_as_nd() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsTPSPROD(Constant.PRODNDGabiTPSUser, Constant.PRODNDGabiTPSPass);  
	}
	
	@When("User logs in at PROD as an ID")
	public void user_logs_in_at_prod_as_indirect() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsIndirectPartnerPROD(Constant.PRODIndirectPartnerEugeneBuenUser, Constant.PRODIndirectPartnerEugeneBuenPass);
	}
	
	@When("User logs in at PROD as SPD")
	public void user_logs_in_at_prod_as_spd() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsSPDPROD(Constant.PRODSPDEugeneBuenUser, Constant.PRODSPDEugeneBuenPass);
	}
	
}
