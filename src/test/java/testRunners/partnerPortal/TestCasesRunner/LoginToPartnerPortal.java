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
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_05_Partner_Portal_End_to_End_Account_to_Manual_Signing_Loan.feature",
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_06_Partner_Portal_End_to_End_Account_to_Manual_Signing_Lease.feature"
				
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_01_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_02_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_03_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_04_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_05_UAT_ND_Eddie_Manual_Quoting_Lease.feature"
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_06_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_07_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_08_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_09_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_10_UAT_ND_Eddie_Manual_Quoting_Lease.feature"
				
				
				//"src/main/resources/features/spwr/QuoteCreation/A_ID_CashLeaseLoan_NoStorage_NoAdders_ManualQuoteCreation.feature",
				//"src/main/resources/features/spwr/QuoteCreation/A_ND_CashLeaseLoan_NoStorage_NoAdders_ManualQuoteCreation.feature",
				//"src/main/resources/features/spwr/QuoteCreation/A_SPD_CashLeaseLoan_NoStorage_NoAdders_ManualQuoteCreation.feature",
				//"src/main/resources/features/spwr/QuoteCreation/SPD_AZ_CashLeaseLoan_NoStorage_NoAdders_ManualQuoteCreation.feature",
				//"src/main/resources/features/spwr/QuoteCreation/SPD_CA_CashLeaseLoan_withStorage_NoAdders_ManualQuoteCreation.feature",
				//"src/main/resources/features/spwr/QuoteCreation/ID_OR_CashLoan_NoStorage_NoAdders_ManualQuoteCreation.feature"
				//"src/main/resources/features/spwr/QuoteCreation/SPD_IL_CashLoan_NoStorage_NoAdders_ManualQuoteCreation.feature",
				//"src/main/resources/features/spwr/QuoteCreation/SPD_IL_CashLoan_withStorage_NoAdders_ManualQuoteCreation.feature",
				//"src/main/resources/features/spwr/QuoteCreation/SPD_CT_CashLoan_NoStorage_NoAdders_ManualQuoteCreation.feature",
				//"src/main/resources/features/spwr/QuoteCreation/SPD_CT_CashLoan_withStorage_NoAdders_ManualQuoteCreation.feature"
				
				
				//REGRESSION UAT TEST SUITE (06/29/2021)
				
				//"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Changes (3)/TC1_SPD_MinimumPricePerWatt_Validation_1.feature",
				//"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Changes (3)/TC2_SPD_MinimumPricePerkWh_Validation_2.feature",
				//"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Changes (3)/TC3_SPD_MinimumGrossPrice_Validation_3.feature",
				//"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Design (4)/TC1_SPD_IL_SystemSize_Validation.feature",
				//"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Design (4)/TC2_SPD_MA_SystemSize_Validation.feature",
				//"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Design (4)/TC3_ND_StorageCommission_Required_Validation.feature",
				//"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Save Design (4)/TC4_SPD_StorageCommission_NotRequired_Validation.feature",
				//"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Savings Tab validation (3)/TC1_100k validation.feature",
				//"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Savings Tab validation (3)/TC2_8_perWatt_Loan_withoutStorage_validation.feature",
				//"src/main/resources/features/spwr/Regression UAT Sales Quoting Manual/Savings Tab validation (3)/TC3_10_perWatt_Loan_withStorage_validation.feature"
			
				//REGRESSION PROD TEST SUITE (06/29/2021)
				//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Savings Tab Validation/PROD_TC1_100k validation.feature",
				//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Savings Tab Validation/PROD_TC2_8_perWatt_Loan_withoutStorage_validation.feature",
				//"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Savings Tab Validation/PROD_TC3_10_perWatt_Loan_withStorage_validation.feature"
				
				"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC1_ND_StorageCommission_Required_Validation.feature",
				"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC2_SPD_StorageCommission_NotRequired_Validation.feature",
				"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC3_SPD_IL_SystemSize_Validation.feature",
				"src/main/resources/features/spwr/Regression PROD Sales Quoting Manual/Save Design Validation/PROD_TC4_SPD_MA_SystemSize_Validation.feature"
				
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

