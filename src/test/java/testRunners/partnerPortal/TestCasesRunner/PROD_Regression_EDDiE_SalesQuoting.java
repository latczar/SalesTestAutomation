package testRunners.partnerPortal.TestCasesRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {


			//REGRESSION PROD TEST SUITE (06/29/2021)
				
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Savings Tab Validation/PROD_TC1_100k validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Savings Tab Validation/PROD_TC2_8_perWatt_Loan_withoutStorage_validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Savings Tab Validation/PROD_TC3_10_perWatt_Loan_withStorage_validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC1_ND_StorageCommission_Required_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC2_SPD_StorageCommission_NotRequired_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC3_SPD_IL_SystemSize_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC4_SPD_MA_SystemSize_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC5_SPD_QuoteName_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Changes Validation/PROD_TC1_SPD_MinimumPricePerWatt_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Changes Validation/PROD_TC2_SPD_MinimumPricePerkWh_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Changes Validation/PROD_TC3_SPD_MinimumGrossPrice_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC1_SPD_OverrideRebate_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC2_SPD_RebateEstimates_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC3_SPD_FederalTaxCredit26_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC4_SPD_StateTaxCreditMA_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC5_ID_CTrebate_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC6_ID_SCrebate_Validation.feature",
			"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC7_SPD_NYstateTaxCredit_Validation.feature"
		},
		
		
		glue = {"stepDefinitions"},
		stepNotifications = true,
		dryRun = false,
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true
		)

public class PROD_Regression_EDDiE_SalesQuoting {

		@BeforeClass
		public static void initDriver() {
			System.out.println("Browser initializing...");
		}
		
		@AfterClass
		public static void tearDown() {
			System.out.println("Browser is closing...");
		}
}