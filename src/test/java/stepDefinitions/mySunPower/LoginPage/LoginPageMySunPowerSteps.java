package stepDefinitions.mySunPower.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.mySunPower.Login.MySunPowerLoginPage;
import pageObjects.partnerportal.home.BasePage;

public class LoginPageMySunPowerSteps extends BasePage {
	
	@Then("User enters a password and confirms it")
	public void user_enters_a_password_and_confirms_it() throws Exception {
		MySunPowerLoginPage mysunpowerloginpage = new MySunPowerLoginPage();
		switchHandlesToNewWindow();
		mysunpowerloginpage.enterAndConfirmPassword("Solar123");
		mysunpowerloginpage.clickMySunPowerSubmitBtn();
	}
}
