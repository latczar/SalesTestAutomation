package testRunners.partnerPortal.TestCasesRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pageObjects.partnerportal.home.BasePage;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		//REGRESSION UAT TEST SUITE created: (06/29/2021), updated: (08/01/2022)
		features= {"/src/main/resources/features/spwr/EDDiE Automated Manual Regression"},		
		glue = {"stepDefinitions"},
		stepNotifications = true,
		dryRun = true,
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		tags = "@regression"
		)

public class EDDiE_Automated_Regression_runner extends BasePage {
	
	@BeforeClass
	public static void initDriver() {
		System.out.println("Browser initializing...");
	}
		
	@AfterClass
	public static void tearDown() {
		System.out.println("Browser is closing...");
	}	
}