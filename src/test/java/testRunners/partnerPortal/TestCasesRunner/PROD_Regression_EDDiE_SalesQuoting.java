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
				
			//"src/main/resources/features/spwr/AccountsCreation/PROD/SPD PenFed Loan Creation No Credit Check.feature",
			"src/main/resources/features/spwr/AccountsCreation/PROD/ID TCU Loan Creation No Credit Check.feature",
			//"src/main/resources/features/spwr/AccountsCreation/PROD/SPD Cash Quote.feature",
			//"src/main/resources/features/spwr/AccountsCreation/PROD/ND Cash Quote.feature",
			"src/main/resources/features/spwr/AccountsCreation/PROD/ID Cash Quote.feature",
			//"src/main/resources/features/spwr/AccountsCreation/PROD/SPD Lease Creation No Credit Check.feature",
			//"src/main/resources/features/spwr/AccountsCreation/PROD/ND Lease Creation No Credit Check.feature",
			"src/main/resources/features/spwr/AccountsCreation/PROD/ID Lease Creation No Credit Check.feature"
				
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Savings Tab Validation/PROD_TC1_100k validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Savings Tab Validation/PROD_TC2_8_perWatt_Loan_withoutStorage_validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Savings Tab Validation/PROD_TC3_10_perWatt_Loan_withStorage_validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC1_ND_StorageCommission_Required_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC2_SPD_StorageCommission_NotRequired_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC3_SPD_IL_SystemSize_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC4_SPD_MA_SystemSize_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC5_SPD_QuoteName_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Changes Validation/PROD_TC1_SPD_MinimumPricePerWatt_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Changes Validation/PROD_TC2_SPD_MinimumPricePerkWh_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Changes Validation/PROD_TC3_SPD_MinimumGrossPrice_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC1_SPD_OverrideRebate_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC2_SPD_RebateEstimates_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC3_SPD_FederalTaxCredit26_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC4_SPD_StateTaxCreditMA_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC5_ID_CTrebate_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC6_ID_SCrebate_Validation.feature",
			//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Incentives and Credit/PROD_TC7_SPD_NYstateTaxCredit_Validation.feature"
			
		//"src/main/resources/features/spwr/HI_QuoteCreation/001_Loan_HI_withCoPayment.feature",
		//"src/main/resources/features/spwr/HI_QuoteCreation/002_Loan_HI_withCoPayment2.feature",
		//"src/main/resources/features/spwr/HI_QuoteCreation/003_Loan_HI_withCoPayment3.feature",
		//"src/main/resources/features/spwr/HI_QuoteCreation/004_Loan_HI_withCoPayment4.feature",
		//"src/main/resources/features/spwr/HI_QuoteCreation/005_Loan_HI_withCoPayment5.feature",
			
			
		/*"src/main/resources/features/spwr/HI_QuoteCreation_withoutCoPayment/001_Loan_HI_withoutCoPayment.feature",
		"src/main/resources/features/spwr/HI_QuoteCreation_withoutCoPayment/002_Loan_HI_withoutCoPayment2.feature",
		"src/main/resources/features/spwr/HI_QuoteCreation_withoutCoPayment/003_Loan_HI_withoutCoPayment3.feature",
		"src/main/resources/features/spwr/HI_QuoteCreation_withoutCoPayment/004_Loan_HI_withoutCoPayment4.feature",
		"src/main/resources/features/spwr/HI_QuoteCreation_withoutCoPayment/005_Loan_HI_withoutCoPayment5.feature",
		"src/main/resources/features/spwr/HI_QuoteCreation_withoutCoPayment/006_Loan_HI_withoutCoPayment6.feature",
		"src/main/resources/features/spwr/HI_QuoteCreation_withoutCoPayment/007_Loan_HI_withoutCoPayment7.feature",
		"src/main/resources/features/spwr/HI_QuoteCreation_withoutCoPayment/008_Loan_HI_withoutCoPayment8.feature",
		"src/main/resources/features/spwr/HI_QuoteCreation_withoutCoPayment/009_Loan_HI_withoutCoPayment9.feature",
		"src/main/resources/features/spwr/HI_QuoteCreation_withoutCoPayment/010_Loan_HI_withoutCoPayment10.feature"
		*/
			
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