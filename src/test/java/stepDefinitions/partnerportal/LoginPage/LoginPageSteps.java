package stepDefinitions.partnerportal.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.partnerportal.LoginPage.LoginPage;
import pageObjects.partnerportal.home.BasePage;
import utils.Constant;

public class LoginPageSteps {
	
	@Given("^User navigates to SunPower Partner Portal using \"([^\"]*)\" browser$")
	public void user_navigates_to_SunPower_Partner_Portal_using_browser(String browser) throws Exception {
		BasePage.initialize(browser, Constant.qaPartnerPortal);
	}
	
	@Given("^User navigates to SunPower UAT Partner Portal using \"([^\"]*)\" browser$")
	public void user_navigates_to_SunPower_Uat_Partner_Portal_using_browser(String browser) throws Exception {
		BasePage.initialize(browser, Constant.UATPartnerPortal);
	}
	
	@When("^User logs in as a partner$")
	public void user_logs_in_as_a_partner() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsPartnerQA(Constant.qaPartnerPortalUser, Constant.qaPartnerPortalPass);
	}
	
	@When("User logs in at UAT as ND")
	public void user_logs_in_at_uat_as_nd() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsNDPartnerUAT(Constant.NDUATPartnerPortalUser, Constant.NDUATPartnerPortalPass);
	}
	
	/*always include RunListEndFlag for end of test scenarios*/
	@Then("^User ends the test scenario$")
	public void user_ends_the_test_scenario() throws Throwable {
		BasePage.RunListEndFlag();
	}
		
}
