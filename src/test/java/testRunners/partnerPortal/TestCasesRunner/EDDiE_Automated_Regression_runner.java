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
		features= {
				   //Incentives and Credit
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/DCRM_Sales-93587 - SPD_OverrideRebate_Validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/DCRM_Sales-93588 - SPD_RebateEstimates_Validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/DCRM_Sales-93589 - ID_SCrebate_Validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/DCRM_Sales-93592 - ID_CTrebate_Validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/DCRM_Sales-93594 - NJ_FederalTaxCredit26_Validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/DCRM_Sales-93597 - State Tax Credit MA.feature",
				   //Mounting Type
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Mounting Type/DCRM_Sales-93504 - Non-sunpower Ground Mount.feature",
				   //Save Changes
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Changes/DCRM_Sales-93582 - SPD_MinimumGrossPrice_Validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Changes/DCRM_Sales-99950 - ND_Lease_MinPPW_Validation.feature",
				   //Save Changes - Adders and Discount
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Changes/Adders and Discount/DCRM_Sales-93573 - SPD_Front Edge Skirt.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Changes/Adders and Discount/DCRM_Sales-93574 - SPD_Critter Guard.feature",
				   //Save Design
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Design/DCRM_Sales-98870 - SPD_MA_SystemSize_Validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Design/DCRM_Sales-98969 - SPD_IL_SystemSize_Validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Design/DCRM_Sales-98971 - SPD_QuoteName_Validation.feature",
				   //Savings Tab validation
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Savings Tab validation/DCRM_Sales-93497 - 100k validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Savings Tab validation/DCRM_Sales-93498 - 8_perWatt_Loan_withoutStorage_validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Savings Tab validation/DCRM_Sales-93499 - 10_perWatt_Loan_withStorage_validation.feature",
				   //Types of Pricing Input
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Types of Pricing Input/DCRM_Sales-93492 - FO PPW_Validation.feature",
				   "src/main/resources/features/spwr/EDDiE Automated Manual Regression/Types of Pricing Input/DCRM_Sales-93494 - Cash GrossPrice_Validation.feature"
		},		
		glue = {"stepDefinitions"},
		stepNotifications = true,
		dryRun = false,
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