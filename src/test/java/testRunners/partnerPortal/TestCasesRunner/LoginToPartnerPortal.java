package testRunners.partnerPortal.TestCasesRunner;
	
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {
				
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_01_Partner_Portal_End_to_End_Account_to_Manual_Quoting_Cash.feature",
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_02_Partner_Portal_End_to_End_Account_to_Manual_Quoting_Loan.feature",
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_03_Partner_Portal_End_to_End_Account_to_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_04_Partner_Portal_End_to_End_Account_to_Manual_Signing_Cash.feature",
				"src/main/resources/features/spwr/TestCaseFeatures/TS_05_Partner_Portal_End_to_End_Account_to_Manual_Signing_Loan.feature"
				
				},
		glue = {"stepDefinitions"},
		stepNotifications = true,
		dryRun = false,
		plugin = {"pretty", /*"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"*/},
		monochrome = true
		)

public class LoginToPartnerPortal {
	
	@AfterClass	
	public static void tearDown() throws Exception {

	}
}

