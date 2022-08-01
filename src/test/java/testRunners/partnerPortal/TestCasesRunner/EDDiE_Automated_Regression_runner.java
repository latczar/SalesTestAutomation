package testRunners.partnerPortal.TestCasesRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pageObjects.partnerportal.home.BasePage;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= {
				
				
		//REGRESSION UAT TEST SUITE created: (06/29/2021), updated: (08/01/2022)
		
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Adders and Discount/TC1_SPD_Front Edge Skirt.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Adders and Discount/TC2_SPD_Critter Guard.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/TC1_SPD_OverrideRebate_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Changes/TC1_SPD_MinimumGrossPrice_Validation.feature" ,
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Design/TC1_SPD_IL_SystemSize_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Design/TC2_SPD_MA_SystemSize_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Design/TC3_SPD_QuoteName_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Save Design/TC4_ND_MinimumPricePerWatt_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Savings Tab validation/TC1_100k validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Savings Tab validation/TC2_8_perWatt_Loan_withoutStorage_validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Savings Tab validation/TC3_10_perWatt_Loan_withStorage_validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/TC2_SPD_RebateEstimates_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/TC3_SPD_FederalTaxCredit26_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/TC4_SPD_StateTaxCreditMA_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Types of Pricing Input/TC1_ID_PricePerWatt_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Types of Pricing Input/TC2_SPD_GrossPrice_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/TC5_ID_CTrebate_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/TC6_ID_SCrebate_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/TC7_ID_NYstateTaxCredit_Validation.feature",
		"src/main/resources/features/spwr/EDDiE Automated Manual Regression/Incentives and Credit/TC4_SPD_StateTaxCreditMA_Validation.feature"
	},
		
		
		glue = {"stepDefinitions"},
		stepNotifications = true,
		dryRun = true,
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true
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