package testRunners.partnerPortal.TestCasesRunner;
	
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {
				
				//"src/main/resources/features/spwr/QuoteCreation (Feb 2022) UAT/Dynamic (Account Creation only)"
				"src/main/resources/features/spwr/QuoteCreation (March 2022) PROD/Manual"
				//"src/main/resources/features/spwr/QuoteCreation (March 2022) QA"
				//"src/main/resources/features/spwr/QuoteCreation (March 2022) QA/Dynamic (QA Account Creation only)"
				
		},
		glue = {"stepDefinitions"},
		stepNotifications = true,
		//tags = "@QA_ND_PenFedRefi",
		//tags = "@QA_SPD_PenFedRefi",
		//tags = "@QA_ID_PenFedRefi",
		//tags = "@QA_ID_PenFedRefi_dynamic",
		//tags = "@UAT_ND_PenFedRefi",
		//tags = "@UAT_SPD_PenFedRefi",
		//tags = "@UAT_ID_PenFedRefi_dynamic",
		//tags = "@UAT_ND_PenFedRefi_dynamic or @UAT_SPD_PenFedRefi_dynamic",
		//tags = "@UAT_ND_PenFedRefi_dynamic",
		//tags = "@UAT_ND_PenFedRefi or @UAT_SPD_PenFedRefi" or @UAT_ID_PenFedRefi,
		//tags = "@PROD_ND_PenFedRefi or @PROD_SPD_PenFedRefi",
		tags = "@PROD_ID_PenFedRefi",
		//tags = "@PROD_ID_PenFedRefi_2",
		dryRun = false,
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true
		)

public class TestRunner {
	
	@AfterClass	
	public static void tearDown() throws Exception {

	}
}

