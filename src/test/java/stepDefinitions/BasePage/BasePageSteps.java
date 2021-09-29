package stepDefinitions.BasePage;

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

public class BasePageSteps extends BasePage {
	
	@Then("^User takes a screenshot of the current state of the web application$")
	public void user_takes_a_screenshot_of_the_current_state_of_the_web_application() throws Exception {
		BasePage basePage = new BasePage();
		BasePage.takeScreenShotAsImage();
	}

}
