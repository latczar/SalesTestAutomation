package testRunners.partnerPortal.TestCasesRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {
				
				
			//REGRESSION UAT TEST SUITE (06/29/2021)
				
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Changes/TC1_SPD_MinimumPricePerWatt_Validation.feature",
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Changes/TC2_SPD_MinimumPricePerkWh_Validation.feature",
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Changes/TC3_SPD_MinimumGrossPrice_Validation.feature",
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Design/TC1_SPD_IL_SystemSize_Validation.feature",
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Design/TC2_SPD_MA_SystemSize_Validation.feature",
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Design/TC3_ND_StorageCommission_Required_Validation.feature",
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Design/TC4_SPD_StorageCommission_NotRequired_Validation.feature",
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Savings Tab validation/TC1_100k validation.feature",
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Savings Tab validation/TC2_8_perWatt_Loan_withoutStorage_validation.feature",
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Savings Tab validation/TC3_10_perWatt_Loan_withStorage_validation.feature",
			"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Incentives and Credit/TC1_SPD_OverrideRebate_Validation.feature"
				
			},
		
		
		glue = {"stepDefinitions"},
		stepNotifications = true,
		dryRun = false,
		plugin = {"pretty", /*"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"*/},
		monochrome = true
		)

public class UAT_Regression_EDDiE_SalesQuoting {
	
	@AfterClass	
	public static void tearDown() throws Exception {

	}
}