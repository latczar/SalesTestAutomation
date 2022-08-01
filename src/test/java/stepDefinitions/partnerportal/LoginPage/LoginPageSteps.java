package stepDefinitions.partnerportal.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.partnerportal.LoginPage.LoginPage;
import pageObjects.partnerportal.home.BasePage;

public class LoginPageSteps extends BasePage{
			
	@Given("User opens the {string} browser")
	public void user_navigates_to_UAT_SunPower_Partner_Portal_using_browser(String browser) throws Exception {
		BasePage.initialize(browser);
	}
	
	@When("User logs in at {string} environment of the SunPower Partner Portal")
	public void user_logs_in_at_env_as_user(String env) throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAtEnv(env);
	}
	
	@And("As this {string} user partner")
	public void as_this_user_partner(String partner) throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginAsPartner(partner);
	}
	
	/*always include RunListEndFlag for end of test scenarios*/
	@Then("^User ends the test scenario$")
	public void user_ends_the_test_scenario() throws Throwable {
		BasePage.RunListEndFlag();
	}
}
