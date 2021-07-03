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
				
				"src/main/resources/features/spwr/QuoteCreation/SPD_QA_CashQuoteCreation.feature",
				"src/main/resources/features/spwr/QuoteCreation/SPD_QA_LeaseQuoteCreation.feature",
				"src/main/resources/features/spwr/QuoteCreation/SPD_QA_LoanQuoteCreation.feature",
				"src/main/resources/features/spwr/QuoteCreation/TPS_QA_CashQuoteCreation.feature",
				"src/main/resources/features/spwr/QuoteCreation/TPS_QA_LeaseQuoteCreation.feature",
				"src/main/resources/features/spwr/QuoteCreation/TPS_QA_LoanQuoteCreation.feature",
				"src/main/resources/features/spwr/QuoteCreation/ID_QA_CashQuoteCreation.feature",
				"src/main/resources/features/spwr/QuoteCreation/ID_QA_LeaseQuoteCreation.feature",
				"src/main/resources/features/spwr/QuoteCreation/ID_QA_LoanQuoteCreation.feature",
				
				
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

