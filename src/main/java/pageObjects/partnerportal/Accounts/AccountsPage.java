package pageObjects.partnerportal.Accounts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.partnerportal.home.BasePage;
import utils.Constant;
import utils.FunctionLibrary;

public class AccountsPage extends BasePage {
	
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	//Start of Accounts Page Web Elements ------------------------------------------------------------------------>
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Accounts')]")
	WebElement ACCOUNTSMENUBTN;
	
	@FindBy(how = How.XPATH, using = "//a[@id='newRecordButton']")
	WebElement NEWACCOUNTBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id='myDropdown']/a") //For UAT = //*[@id="myDropdown"]/a[2]
	WebElement RESIDENTIALCUSTOMERBTNQA;
	
	@FindBy(how = How.XPATH, using = "//*[@id='myDropdown']/a[2]")
	WebElement IDRESIDENTIALCUSTOMERBTNQA;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Residential Customer')]")
	WebElement RESIDENTIALCUSTOMERBTNUAT;
	
	@FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/span[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
	WebElement LISTVIEWDROPDOWNBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[1]/div[1]/span[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	WebElement STAGEDROPDOWNBTN;
	
	@FindBy(how = How.XPATH, using = "//input[@id='min']")
	WebElement DATEFROMTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='max']")
	WebElement DATETOTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement SEARCHTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Account Information')]")
	WebElement ACCOUNTINFORMATIONTEXT;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-create-account[1]/main[1]/section[1]/account-information[1]/form[1]/div[1]/div[1]/input[1]")
	WebElement FIRSTNAMETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-create-account[1]/main[1]/section[1]/account-information[1]/form[1]/div[2]/div[1]/input[1]")
	WebElement LASTNAMETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='phoneNumberInfo']")
	WebElement PHONENUMBERTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-create-account[1]/main[1]/section[1]/account-information[1]/form[1]/div[2]/div[2]/input[1]")
	WebElement EMAILTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='searchAddressInputMap']")
	WebElement ADDRESSTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//html/body/div/div[1]")
	WebElement AUTOCOMPLETEADDRESSTABLE;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='leadNotes']")
	WebElement LEADNOTESTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'CANCEL')]")
	WebElement CANCELBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-create-account/main/section[4]/div/button")
	WebElement SAVEBTN;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/main[1]/nav[1]/ul[1]/li[1]")
	WebElement BASICINFOTAB;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Qualification')]")
	WebElement QUALIFICATIONTAB;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Quotes')]")
	WebElement QUOTESTAB;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/main[1]/div[2]/div[2]/div[1]/section[1]/usage-input-view[1]/span[1]/a[1]")
	WebElement EDITUSAGEINPUTBTN;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Electric Rate and Energy Usage')]")
	WebElement ELECTRICRATEANDENERGYUSAGEMODAL;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/edit-usage-input-modal[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/sp-dropdown-filterlist[1]/div[1]/div[1]/span[1]")
	WebElement CURRENTELECTRICRATEDROPDOWN;
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/edit-usage-input-modal/section/div/div/section[1]/div[1]/div[1]/sp-dropdown-filterlist/div/div/div/div/input")
	WebElement CURRENTELECTRICRATEINPUTBOX;
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/edit-usage-input-modal/section/div/div/section[1]/div[1]/div[1]/sp-dropdown-filterlist/div/div/div/ul/li[1]")
	WebElement CURRENTELECTRICRATEFIRSTDROPDOWNITEM;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/edit-usage-input-modal[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[3]/sp-dropdown-filterlist[1]/div[1]/div[1]/span[1]")
	WebElement PROPOSEDELECTRICRATEDROPDOWN;
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/edit-usage-input-modal/section/div/div/section[1]/div[1]/div[3]/sp-dropdown-filterlist/div/div/div/div/input")
	WebElement PROPOSEDELECTRICRATEINPUTBOX;
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/edit-usage-input-modal/section/div/div/section[1]/div[1]/div[3]/sp-dropdown-filterlist/div/div/div/ul/li[1]")
	WebElement PROPOSEDELECTRICRATEFIRSTDROPDOWNITEM;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/edit-usage-input-modal[1]/section[1]/div[1]/div[1]/section[2]/nav[1]/ul[1]/li[1]")
	WebElement ENERGYUSAGEBILLTAB;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/edit-usage-input-modal[1]/section[1]/div[1]/div[1]/section[2]/nav[1]/ul[1]/li[2]")
	WebElement MONTLYENERGYUSAGETAB;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/edit-usage-input-modal[1]/section[1]/div[1]/div[1]/section[2]/section[1]/div[1]/sp-dropdown[1]/div[1]/div[1]/span[1]")
	WebElement ANNUALMONTHLYBILLBTN;
	
	@FindBy(how = How.XPATH, using = "//span[@title='Average Monthly Bill']")
	WebElement AVERAGEMONTHLYBILLBTN;
	
	@FindBy(how = How.XPATH, using = "//span[@title='Total Annual Bill']")
	WebElement TOTALANNUALBILLBTN;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/edit-usage-input-modal[1]/section[1]/div[1]/div[1]/section[2]/section[1]/div[1]/input[1]")
	WebElement INPUTBILLTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//html[1]/body[1]/app-root[1]/ng-component[1]/residential-main-tabs[1]/edit-usage-input-modal[1]/section[1]/div[1]/div[1]/section[3]/button[2]")
	WebElement ENERGYUSAGEMODALSAVEBTN;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Utility Account Holder')]")
	WebElement UTILITYACCOUNTHOLDERTEXT;
	
	@FindBy(how = How.XPATH, using = "//input[@id='radio-1']")
	WebElement UTILITYACCOUNTHOLDERFIRSTRADIOBTN;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'MANUAL QUOTE')]")
	WebElement NEWMANUALQUOTEBTN;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/main[1]/div[2]/div[2]/div[1]/section[1]/residential-quotes[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement CREATENEWQUOTEBTN;
	
	@FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[1]/label[1]")
	WebElement CONTRACTONECHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//button[@id='sndOpt']")
	WebElement SENDOPTIONSBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/main/div[2]/div[2]/div/section[1]/residential-quotes/table/thead/td[9]/div/div/ul/li[1]/div/button")
	WebElement SENDTOMYSUNPOWERVIATEXTBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/main/div[2]/div[2]/div/section[1]/residential-quotes/table/thead/td[9]/div/div/ul/li[2]/div/button")
	WebElement SENDTOMYSUNPOWERVIAEMAILBTN;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'CANCEL')]")
	WebElement CANCELPROPOSALBTN;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'SEND')]")
	WebElement SENDPROPOSALBTN;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/main[1]/alerts-messages[1]/div[1]")
	WebElement INVITATIONEMAILSENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id='checkEmailisNull']")
	WebElement SENDCPUCFIRSTCONTRACTBTN;
	
	@FindBy(how = How.XPATH, using = "*//a[contains(text(),'CASH CONTRACT')]")
	WebElement CASHCONTRACTBTN;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/initial-consumer-lending-compliance-modal[1]/section[1]/div[1]/div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement VERIFIEDCUSTOMERIDCHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/initial-consumer-lending-compliance-modal[1]/section[1]/div[1]/div[1]/section[1]/form[2]/div[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement VERBALLYNOTIFIEDCHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//html[1]/body[1]/app-root[1]/ng-component[1]/residential-main-tabs[1]/initial-consumer-lending-compliance-modal[1]/section[1]/div[1]/div[1]/section[2]/button[1]")
	WebElement GENERATEAGREEMENTBTN;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'CANCEL')]")
	WebElement CANCELCOMPLIANCECHECKBTN;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/ng-component[1]/residential-main-tabs[1]/main[1]/alerts-messages[1]/div[1]/span[1]")
	WebElement CASHCONTRACTGENERATESUCCESS;
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/main/div[2]/div[2]/div/section[2]/agreements-list/table/tbody/tr/td[2]")
	WebElement FIRSTAGREEMENTNAME;
	
	@FindBy(how = How.CSS, using = "#checkEmailisNull")
	WebElement SENDCONTRACTFIRSTBTN;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Out for Signature')]")
	WebElement OUTFORSIGNATURETXT;
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/initial-consumer-lending-compliance-modal/section/div/div/section[2]/a")
	WebElement LOANCANCELPROPOSALSTOMYSUNPOWERBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/initial-consumer-lending-compliance-modal/section/div/div/section[2]/button")
	WebElement LOANSENDPROPOSALSTOMYSUNPOWERBTN;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'DRAFT LEASE CONTRACT')]")
	WebElement DRAFTLEASECONTRACTBTN;
			
	
	//Start of EDDiE Portal Web Elements ------------------------------------------------------------------------>
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[1]/nav/div[2]/div[1]/div/div/div/a")
	WebElement DESIGNMENUBTN;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Savings')]")
	WebElement SAVINGSMENUBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[1]/nav/div[2]/div[3]/div/div")
	WebElement PROPOSALMENUBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	WebElement MODULETYPEBTN;
		
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement SHADINGMEASUREMENTDATEINPUTBOX;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]")
	WebElement SELECTSTORAGEDROPDOWNBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")
	WebElement SUNVAULTSTORAGEBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/span[1]")
	WebElement ONESUNVAULTBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/span[1]")
	WebElement TWOSUNVAULTBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]")
	WebElement ACCESSORYFRONTEDGESKIRTCHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/input[2]")
	WebElement ACCESSORYCRITTERGUARDCHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
	WebElement MONITORINGBTN;
		
	@FindBy(how = How.XPATH, using = "//a[@id='new_roof_modal_toggle']")
	WebElement NEWROOFBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id='roof-form-pitch']")
	WebElement PITCHDROPDOWNBTN;
	
	@FindBy(how = How.XPATH, using = "//html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement AZIMUTHINPUTBOX;
	
	@FindBy(how = How.XPATH, using = "//html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement MODULECOUNTINPUTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id='monthly-solar-access-0']")
	WebElement ROOFSOLARACCESSJANUARY;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-1']")
	WebElement ROOFSOLARACCESSFEBRUARY;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-2']")
	WebElement ROOFSOLARACCESSMARCH;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-3']")
	WebElement ROOFSOLARACCESSAPRIL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-4']")
	WebElement ROOFSOLARACCESSMAY;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-5']")
	WebElement ROOFSOLARACCESSJUNE;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-6']")
	WebElement ROOFSOLARACCESSJULY;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-7']")
	WebElement ROOFSOLARACCESSAUGUST;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-8']")
	WebElement ROOFSOLARACCESSSEPTEMBER;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-9']")
	WebElement ROOFSOLARACCESSOCTOBER;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-10']")
	WebElement ROOFSOLARACCESSNOVEMBER;
	
	@FindBy(how = How.XPATH, using = "//input[@id='monthly-solar-access-11']")
	WebElement ROOFSOLARACCESSDECEMBER;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[3]/div/div[2]/div[1]/div/a[2]")
	WebElement NEWROOFSAVECHANGESBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[3]/div/div[2]/div[1]/div/a[1]")
	WebElement NEWROOFCANCELBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[1]/nav[1]/div[3]/div[1]/a[1]")
	WebElement QUOTESETTINGSBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement QUOTENAMEINPUTBOX;

	@FindBy(how = How.XPATH, using = "//*[@id='settings']/div[2]/div[2]/div[1]/ul/li[1]")
	WebElement CASHQUOTESETTINGSBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"settings\"]/div[2]/div[2]/div[2]/div/div/form/div[1]/label/span")
	WebElement CASHQUOTECHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cash_settings_price_per_watt']")
	WebElement PRICEPERWATTCASHTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='cash_settings_gross_price']")
	WebElement GROSSPRICECASHTXTBOX;
		
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[3]/div[2]/div[1]/input[2]")
	WebElement OVERRIDEREBATECASHLEASELOANTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='cash_storage_dealer_fee']")
	WebElement CASHSTORAGEDEALERCOMMISSIONTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id='settings']/div[2]/div[2]/div[1]/ul/li[2]")
	WebElement LEASEQUOTESETTINGSBTN;
		
	@FindBy(how = How.XPATH, using = "//input[@id='lease_settings_price_per_watt']")
	WebElement PRICEPERWATTLEASETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lease_settings_price_per_kwh']")
	WebElement PRICEPERKWHLEASETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Run')]")
	WebElement PRICEPERKWHLEASERUNBTN;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lease_settings_gross_price']")
	WebElement GROSSPRICELEASETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lease_settings_dealer_fee_per_watt']")
	WebElement LEASEDEALERCOMMISSIONPERWATTTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lease_storage_dealer_fee']")
	WebElement LEASESTORAGEDEALERCOMMISSIONTXTBOX;	
	
	@FindBy(how = How.XPATH, using = "//*[@id='settings']/div[2]/div[2]/div[1]/ul/li[3]")
	WebElement LOANQUOTESETTINGSBTN;
	
	@FindBy(how = How.XPATH, using = "//@//*[@id='settings']/div[2]/div[2]/div[1]/ul/li[2]")
	WebElement ORLOANQUOTESETTINGSBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id='loan_settings_price_per_watt']")
	WebElement PRICEPERWATTLOANTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='loan_settings_gross_price']")
	WebElement GROSSPRICELOANTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='loan_settings_dealer_fee_per_watt']")
	WebElement LOANDEALERCOMMISSIONPERWATTTXBOX;
	
	@FindBy(how = How.XPATH, using = "//input[@id='loan_storage_dealer_fee']")
	WebElement LOANSTORAGEDEALERCOMMISSIONTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Show customer this option')]")
	WebElement LEASELOANQUOTECHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id='settings']/div[1]/div/a[2]")
	WebElement EDDIESAVECHANGESBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id='settings']/div[1]/div/a[1]")
	WebElement EDDIECANCELCHANGESBTN;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save Design')]")
	WebElement EDDIESAVEDESIGNBTN;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Calculating savings...')]")
	WebElement CALCULATESAVINGSLOADER;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[2]/div[4]/a")
	WebElement VIEWESTIMATEDSAVINGSBUTTON;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Estimated Average Savings')]")
	WebElement ESTIMATEDAVERAGESAVINGSTXT;
	
	@FindBy(how = How.XPATH, using = "//*[@id='finance_options_dropdown']/div))")
	WebElement FINANCEOPTIONSDROPDOWN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")
	WebElement EDDIESHOWHIDESAVINGSBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[2]/div[3]/div/div[1]/ul/li[1]")
	WebElement PAYMENTOPTIONCASHTAB;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[3]/button")
	WebElement SELECTCASHBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[2]/div[3]/div/div[1]/ul/li[2]")
	WebElement PAYMENTOPTIONLEASETAB;
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-content']/div[3]/div/div[2]/div/div/div/div/div[3]/button")
	WebElement SELECTLEASEBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[2]/div[3]/div/div[1]/ul/li[3]")
	WebElement PAYMENTOPTIONLOANTAB;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Edit Loan')]")
	WebElement EDITLOANBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement COPAYMENTTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]")
	WebElement TERMDROPDOWN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]")
	WebElement APRDROPDOWN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	WebElement SELECTLOANBTN;
	
	@FindBy(how = How.XPATH, using = "//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")
	WebElement EDITLEASEBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/select[1]")
	WebElement DOWNPAYMENTBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id='edit-lease']/div[3]/div/label/span")
	WebElement FULLPREPAYMENTCHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id='edit-lease']/div[4]/a[2]")
	WebElement SAVECHANGESEDITLEASEBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-content']/div[3]/div/div[1]/ul/li[1]")
	WebElement VIEWPROPOSALCASHTAB;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[3]/a")
	WebElement VIEWPROPOSALBTN;
	
	//End of EDDiE Portal Web Elements ------------------------------------------------------------------------>
	
	public AccountsPage() {
		//this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//Start of Residential Customer Account creation  ------------------------------------------------------------------------>
	public void navigateToAccountsPage() throws Exception {
		click(ACCOUNTSMENUBTN,"ACCOUNTSMENUBTN");
	}
	
	public void clickNewAccountbtn() throws Exception {
		click(NEWACCOUNTBTN,"NEWACCOUNTBTN");
	}
	
	public void createNewResidentialCustomerAccountForUAT() throws Exception {
		click(RESIDENTIALCUSTOMERBTNUAT, "RESIDENTIALCUSTOMERBTNUAT");
	}
	
	public void createNewResidentialCustomerAccountForQA() throws Exception {
		click(RESIDENTIALCUSTOMERBTNQA, "RESIDENTIALCUSTOMERBTNQA");
	}
	
	public void createNewIDResidentialCustomerAccountForQA() throws Exception {
		click(IDRESIDENTIALCUSTOMERBTNQA, "IDRESIDENTIALCUSTOMERBTNQA");
	}
	
	public boolean isNewAccountResidentialFormDisplayed() throws Exception {
		return ACCOUNTINFORMATIONTEXT.isDisplayed();
	}
	
	public void inputNewResidentialCustomerName(String firstName, String lastName) throws Exception {
		waitForVisibleElement(driver, FIRSTNAMETXTBOX);
		enterText(FIRSTNAMETXTBOX, "FIRSTNAMETXTBOX", firstName);
		enterText(LASTNAMETXTBOX, "LASTNAMETXTBOX", lastName);
	}
	
	public void inputNewPhoneNumber(String phoneNum) throws Exception {
		click(PHONENUMBERTXTBOX, "PHONENUMBERTXTBOX");
		enterTextforAddressAndPhone(PHONENUMBERTXTBOX, "PHONENUMBERTXTBOX", phoneNum);

	}
	
	public void inputNewEmail(String email) throws Exception {
		enterText(EMAILTXTBOX, "EMAILTXTBOX", email);
	}
	
	public void inputRandomDigits(String randNum) throws Exception {
		randNum = FunctionLibrary.generateContactNumber() + "@gmail.com";
		enterText(EMAILTXTBOX, "EMAILTXTBOX", randNum);
	}
	
	public void inputNewAddress(String address) throws Exception {
		scrollPageDown();
		enterTextforAddressAndPhone(ADDRESSTXTBOX, "ADDRESSTXTBOX", address);
		Thread.sleep(1000);		
		arrowDownClick(ADDRESSTXTBOX);
	}
	
	public void clickSaveBtn() throws Exception {
		Thread.sleep(1000);
		scrollPageDown();
		waitForVisibleElement(driver, SAVEBTN);
		click(SAVEBTN, "SAVEBTN");
	}
	
	public boolean isBasicInfoPageDisplayed() throws Exception {
		waitForVisibleElement(driver, BASICINFOTAB);
		return BASICINFOTAB.isDisplayed();
	}
	
	public void clickQualificationTab() throws Exception {
		Boolean wait = new WebDriverWait(driver, 120).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//html/body/app-root/sp-loading/div/div/span")));
		jse.executeScript("arguments[0].click()", QUALIFICATIONTAB);
	}
	
	public void editUsageInputvalues() throws Exception {
		scrollPageDown();
		waitForVisibleElement(driver, EDITUSAGEINPUTBTN);
		jse.executeScript("arguments[0].click()", EDITUSAGEINPUTBTN);
	}
	
	public boolean isElectricModalDisplayed() throws Exception {
		waitForVisibleElement(driver, ELECTRICRATEANDENERGYUSAGEMODAL);
		return ELECTRICRATEANDENERGYUSAGEMODAL.isDisplayed();
	}
	
	public void inputCurrentElectricRate() throws Exception {
		Boolean wait = new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//html/body/app-root/sp-loading/div/div/span")));
		jse.executeScript("arguments[0].click()", CURRENTELECTRICRATEDROPDOWN);
		waitForVisibleElement(driver, CURRENTELECTRICRATEFIRSTDROPDOWNITEM);
		jse.executeScript("arguments[0].click()", CURRENTELECTRICRATEFIRSTDROPDOWNITEM);
	}
	
	public void inputProposedElectricRate() throws Exception {
		jse.executeScript("arguments[0].click()", PROPOSEDELECTRICRATEDROPDOWN);
		waitForVisibleElement(driver, PROPOSEDELECTRICRATEFIRSTDROPDOWNITEM);
		jse.executeScript("arguments[0].click()", PROPOSEDELECTRICRATEFIRSTDROPDOWNITEM);
	}
	
	public void inputTotalAnnualBill(String totalAnnualBill) throws Exception {
		jse.executeScript("arguments[0]", INPUTBILLTXTBOX);
		enterText(INPUTBILLTXTBOX, "INPUTBILLTXTBOX", totalAnnualBill);
	}
	
	public boolean isUtilityAccountHolderTextDisplayed() throws Exception {
		waitForVisibleElement(driver, UTILITYACCOUNTHOLDERTEXT);
		return UTILITYACCOUNTHOLDERTEXT.isDisplayed();
	}
	
	public void selectUtilityAccountHolderFirstRadioBtn() throws Exception {
		click(UTILITYACCOUNTHOLDERFIRSTRADIOBTN, "UTILITYACCOUNTHOLDERFIRSTRADIOBTN");
	}
	
	public void clickEnergyUsageModalSaveBtn() throws Exception {
		scrollPageDownBy500();
		click(ENERGYUSAGEMODALSAVEBTN, "ENERGYUSAGEMODALSAVEBTN");
	}
	
	public void clickQuotesTab() throws Exception {
		scrollPageUp();
		Thread.sleep(5000);
		jse.executeScript("arguments[0].click()", QUOTESTAB);
	}
	
	public void clickNewManualQuoteBtn() throws Exception {
		Boolean wait = new WebDriverWait(driver, 60).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//html/body/app-root/sp-loading/div/div/span")));
		waitForVisibleElement(driver, CREATENEWQUOTEBTN);
		click(CREATENEWQUOTEBTN, "CREATENEWQUOTEBTN");
		waitForVisibleElement(driver, NEWMANUALQUOTEBTN);
		click(NEWMANUALQUOTEBTN, "NEWMANUALQUOTEBTN");
	}
	
	public void navigateBackToQuotingPage() throws Exception {
		switchToOriginalWindow();
		waitForVisibleElement(driver, NEWMANUALQUOTEBTN);
		driver.navigate().refresh();
		Thread.sleep(3900);
        Boolean wait2 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Processing...')]")));
        Thread.sleep(2900);
		driver.navigate().refresh();
        Boolean wait3 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Processing...')]")));
        Thread.sleep(1900);
	}
	
	public void clickCashContractBtn() throws Exception {
		sleepRefreshPage();
		waitForVisibleElement(driver, CASHCONTRACTBTN);
	    click(CASHCONTRACTBTN, "CASHCONTRACTBTN");
	    System.out.println("Clicking on Cash Contract...");
	}
	
	public void clickComplianceCheckBoxesforCash() throws Exception {
		System.out.println("Clicking on Compliance checkboxes...");
		waitForVisibleElement(driver, VERIFIEDCUSTOMERIDCHECKBOX);
		click(VERIFIEDCUSTOMERIDCHECKBOX, "VERIFIEDCUSTOMERIDCHECKBOX");
		click(VERBALLYNOTIFIEDCHECKBOX, "VERBALLYNOTIFIEDCHECKBOX");
		click(GENERATEAGREEMENTBTN, "GENERATEAGREEMENTBTN");
		Boolean wait1 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Processing...')]")));
		Thread.sleep(1900);
		String contractNum = driver.findElement(By.xpath("//body[1]/app-root[1]/ng-component[1]/residential-main-tabs[1]/main[1]/div[2]/div[2]/div[1]/section[1]/residential-quotes[1]/table[1]/tbody[1]/tr[1]/td[2]"))
				.getText();
		System.out.println("Cash Contract Generated for Contract#: " + contractNum );
	}
	
	public void clickComplianceCheckBoxesforLoan() throws Exception {
		System.out.println("Clicking on Compliance checkboxes...");
		waitForVisibleElement(driver, VERIFIEDCUSTOMERIDCHECKBOX);
		click(VERIFIEDCUSTOMERIDCHECKBOX, "VERIFIEDCUSTOMERIDCHECKBOX");
		click(VERBALLYNOTIFIEDCHECKBOX, "VERBALLYNOTIFIEDCHECKBOX");
		Boolean wait1 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Processing...')]")));
		Thread.sleep(1900);
	}
	
	public void clickSendFirstContractBtn() throws Exception {
		System.out.println("Sending Contract to email...");
		waitForVisibleElement(driver, SENDCONTRACTFIRSTBTN);
		scrollPageDownBy500();
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click()", SENDCONTRACTFIRSTBTN);
		
		waitForVisibleElement(driver, OUTFORSIGNATURETXT);
		String ContractNumber = driver.findElement(By.xpath("//html/body/app-root/ng-component/residential-main-tabs/main/div[2]/div[2]/div/section[2]/agreements-list/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("Contract Number: " + ContractNumber + " is Out for Signature");
		Thread.sleep(1500);
	}

	//Start of EDDiE Portal quoting activities ------------------------------------------------------------------------>
	public boolean isEDDiEPortalPageDisplayed() throws Exception {
		switchHandlesToNewWindow();
		waitForVisibleElement(driver, DESIGNMENUBTN);
		Constant.url = driver.getCurrentUrl();
		System.out.println("Generating Proposal...");
		System.out.println("Quote Link: " + Constant.url);
		return DESIGNMENUBTN.isDisplayed();
	}
	
	public void clickUserInputModuleTypeBtn(String moduleType) throws Exception {
		waitForVisibleElement(driver, MODULETYPEBTN);
		click(MODULETYPEBTN, "MODULETYPEBTN");
		driver.findElement(By.xpath("//div[contains(text(),'"+moduleType+"')]")).click();;
	}

	public void enterShadingDate() throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		String currentDate = dateFormat.format(date);
		enterText(SHADINGMEASUREMENTDATEINPUTBOX, "SHADINGMEASUREMENTDATEINPUTBOX", currentDate);
		sendKeysTab(SHADINGMEASUREMENTDATEINPUTBOX);
	}
	
	public void addSunvaultStorage() throws Exception {
		click(SELECTSTORAGEDROPDOWNBTN, "SELECTSTORAGEDROPDOWNBTN");
		waitForVisibleElement(driver, SUNVAULTSTORAGEBTN);
		click(SUNVAULTSTORAGEBTN, "SUNVAULTSTORAGEBTN");
	}
	
	public void clickNewRoofBtn() throws Exception {
		click(NEWROOFBTN, "NEWROOFBTN");
	}
	
	public boolean isNewRoofModalDisplayed() throws Exception {
		waitForVisibleElement(driver, PITCHDROPDOWNBTN);
		return PITCHDROPDOWNBTN.isDisplayed();
	}
	
	public void enterPitch(String pitchValue) throws Exception {
		waitForVisibleElement(driver, PITCHDROPDOWNBTN);
		enterText(PITCHDROPDOWNBTN,"PITCHDROPDOWNBTN", pitchValue);
	}
	
	public void enterAzimuth(String azimuthValue) throws Exception {
		enterText(AZIMUTHINPUTBOX, "AZIMUTHINPUTBOX", azimuthValue);
	}
	
	public void enterModuleCount(String moduleCountValue) throws Exception {
		enterText(MODULECOUNTINPUTBOX, "MODULECOUNTINPUTBOX", moduleCountValue);
	}
	
	public void enterSolarPercentages(String solarValueJan, String solarValueFeb, String solarValueMar, String solarValueApr, String solarValueMay,
			String solarValueJun, String solarValueJul, String solarValueAug, String solarValueSep, String solarValueOct,
				String solarValueNov, String solarValueDec) throws Exception {
		enterText(ROOFSOLARACCESSJANUARY, "ROOFSOLARACCESSJANUARY", solarValueJan);
		enterText(ROOFSOLARACCESSFEBRUARY, "ROOFSOLARACCESSFEBRUARY", solarValueFeb);
		enterText(ROOFSOLARACCESSMARCH, "ROOFSOLARACCESSMARCH", solarValueMar);
		enterText(ROOFSOLARACCESSAPRIL, "ROOFSOLARACCESSAPRIL", solarValueApr);
		enterText(ROOFSOLARACCESSMAY, "ROOFSOLARACCESSMAY", solarValueMay);
		enterText(ROOFSOLARACCESSJUNE, "ROOFSOLARACCESSJUNE", solarValueJun);
		enterText(ROOFSOLARACCESSJULY, "ROOFSOLARACCESSJULY", solarValueJul);
		enterText(ROOFSOLARACCESSAUGUST, "ROOFSOLARACCESSAUGUST", solarValueAug);
		enterText(ROOFSOLARACCESSSEPTEMBER, "ROOFSOLARACCESSSEPTEMBER", solarValueSep);
		enterText(ROOFSOLARACCESSOCTOBER, "ROOFSOLARACCESSOCTOBER", solarValueOct);
		enterText(ROOFSOLARACCESSNOVEMBER, "ROOFSOLARACCESSNOVEMBER", solarValueNov);
		enterText(ROOFSOLARACCESSDECEMBER, "ROOFSOLARACCESSDECEMBER", solarValueDec);
	}
	
	public void clickNewRoofSaveChangesBtn() throws Exception {
		click(NEWROOFSAVECHANGESBTN,"NEWROOFSAVECHANGESBTN");	
	}
	
	public void clickQuoteSettingsBtn() throws Exception {
		waitForVisibleElement(driver, QUOTESETTINGSBTN);
		click(QUOTESETTINGSBTN, "QUOTESETTINGSBTN");
	}
	
	public void enterQuoteName(String quoteNameNewValue) throws Exception {
		waitForVisibleElement(driver, QUOTENAMEINPUTBOX);
		click(QUOTENAMEINPUTBOX, "QUOTENAMEINPUTBOX");
		enterText(QUOTENAMEINPUTBOX, "QUOTENAMEINPUTBOX", quoteNameNewValue);
	}
	
	public boolean isQuoteSettingsModalDisplayed() throws Exception {
		waitForVisibleElement(driver, PRICEPERWATTCASHTXTBOX);
		return PRICEPERWATTCASHTXTBOX.isDisplayed();
	}
	
	public void enterOverrideEstimateCashLeaseLoan(String overrideRebateValue) throws Exception {
		waitForVisibleElement(driver, OVERRIDEREBATECASHLEASELOANTXTBOX);
		enterText(OVERRIDEREBATECASHLEASELOANTXTBOX, "OVERRIDEREBATECASHLEASELOANTXTBOX", overrideRebateValue);
		sendKeysTab(OVERRIDEREBATECASHLEASELOANTXTBOX);
	}
	
	public void clickCashOptionTab() throws Exception {
		jse.executeScript("arguments[0].click()", CASHQUOTESETTINGSBTN);
	}
	
	public void enterCashPricePerWattValue(String cashPricePerWatt) throws Exception {
		enterText(PRICEPERWATTCASHTXTBOX, "PRICEPERWATTCASHTXTBOX", cashPricePerWatt);
		sendKeysTab(PRICEPERWATTCASHTXTBOX);
	}
	
	public void enterCashGrossPriceValue(String cashGrossPrice) throws Exception {
		enterText(GROSSPRICECASHTXTBOX, "GROSSPRICECASHTXTBOX", cashGrossPrice);
		sendKeysTab(GROSSPRICECASHTXTBOX);
	}
	
	public void enterLeasePricePerkWhValue(String leasePricePerkWh) throws Exception {
		enterText(PRICEPERKWHLEASETXTBOX, "PRICEPERKWHLEASETXTBOX", leasePricePerkWh);
		sendKeysTab(PRICEPERKWHLEASETXTBOX);
	}
	
	public void clickLeasePricePerkWhRun() throws Exception {
		jse.executeScript("arguments[0].click()", PRICEPERKWHLEASERUNBTN);
	}
	
	public void enterLeaseGrossPriceValue(String leaseGrossPrice) throws Exception {
		enterText(GROSSPRICELEASETXTBOX, "GROSSPRICELEASETXTBOX", leaseGrossPrice);
		sendKeysTab(GROSSPRICELEASETXTBOX);
	}
	
	public void enterCashStorageDealerComm(String cashStorageDealerComm) throws Exception {
		enterText(CASHSTORAGEDEALERCOMMISSIONTXTBOX, "CASHSTORAGEDEALERCOMMISSIONTXTBOX", cashStorageDealerComm);
		sendKeysTab(CASHSTORAGEDEALERCOMMISSIONTXTBOX);
	}
	
	public void clickCheckboxCashShowOption() throws Exception {
		click(CASHQUOTECHECKBOX, "CASHQUOTECHECKBOX");
	}
	
	public void clickLeaseOptionTab() throws Exception {
		jse.executeScript("arguments[0].click()", LEASEQUOTESETTINGSBTN);
	}
	
	public void clickCheckboxLeaseLoanShowOption() throws Exception {
		click(LEASELOANQUOTECHECKBOX, "LEASELOANQUOTECHECKBOX");		
	}
	
	public void enterLeasePricePerWatt(String leasePricePerWatt) throws Exception {
		enterText(PRICEPERWATTLEASETXTBOX, "PRICEPERWATTLEASETXTBOX", leasePricePerWatt);
		sendKeysTab(PRICEPERWATTLEASETXTBOX);
	}
	
	public void enterLeaseStorageDealerComm(String leaseStorageDealerComm) throws Exception {
		enterText(LEASESTORAGEDEALERCOMMISSIONTXTBOX, "LEASESTORAGEDEALERCOMMISSIONTXTBOX", leaseStorageDealerComm);
		sendKeysTab(LEASESTORAGEDEALERCOMMISSIONTXTBOX);
	}
	
	public void clickLoanOptionTab() throws Exception {
		jse.executeScript("arguments[0].click()", LOANQUOTESETTINGSBTN);
	}
	
	public void clickORLoanOptionTab() throws Exception {
		jse.executeScript("arguments[0].click()", ORLOANQUOTESETTINGSBTN);
	}
	
	public void enterLoanPricePerWatt(String loanPricePerWatt) throws Exception {
		enterText(PRICEPERWATTLOANTXTBOX, "PRICEPERWATTLOANTXTBOX", loanPricePerWatt);
		sendKeysTab(PRICEPERWATTLOANTXTBOX);
	}
	
	public void enterLoanStorageDealerComm(String loanStorageDealerComm) throws Exception {
		enterText(LOANSTORAGEDEALERCOMMISSIONTXTBOX, "LOANSTORAGEDEALERCOMMISSIONTXTBOX", loanStorageDealerComm);
		sendKeysTab(LOANSTORAGEDEALERCOMMISSIONTXTBOX);
	}
	
	public void enterLoanGrossPriceValue(String loanGrossPrice) throws Exception {
		enterText(GROSSPRICELOANTXTBOX, "GROSSPRICELOANTXTBOX", loanGrossPrice);
		sendKeysTab(GROSSPRICELOANTXTBOX);
	}
	
	public void clickQuoteSettingsSaveChanges() throws Exception {
		click(EDDIESAVECHANGESBTN, "EDDIESAVECHANGESBTN");
	}
	
	public void clickEddieSaveDesignBtn() throws Exception {
		scrollPageDown();
		Boolean wait = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"page\"]/div[1]/div[2]/nav/div[2]/span[2]")));
		click(EDDIESAVEDESIGNBTN, "EDDIESAVEDESIGNBTN");	
	}
	
	public void isViewEstimatedSavingsBtnDisplayed() throws Exception {
		scrollPageUp();
		Boolean wait = new WebDriverWait(driver, 60)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
	}
	
	public void clickEddieViewEstimatedSavingsBtn() throws Exception {
		waitForVisibleElement(driver, VIEWESTIMATEDSAVINGSBUTTON);
		click(VIEWESTIMATEDSAVINGSBUTTON, "VIEWESTIMATEDSAVINGSBUTTON");
	}
	
	public void clickEddieSavingsMenuBtn() throws Exception {
		jse.executeScript("arguments[0].click()", SAVINGSMENUBTN);
	}
	
	public boolean isEstimatedAverageSavingsTextDisplayed() throws Exception {
		waitForVisibleElement(driver, FINANCEOPTIONSDROPDOWN);
		return FINANCEOPTIONSDROPDOWN.isDisplayed();
	}
	
	public void clickFinanceOptionsDropdown() throws Exception {
		click(FINANCEOPTIONSDROPDOWN, "FINANCEOPTIONSDROPDOWN");
	}
	
	public void clickOnShowBtn() throws Exception {
		jse.executeScript("arguments[0].click()", EDDIESHOWHIDESAVINGSBTN);
	}
	
	public void clickOnSelectCashPayment() throws Exception {
		click(SELECTCASHBTN, "SELECTCASHBTN");		
		Boolean wait1 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
	}
	
	public void clickOnEditLoanBtn() throws Exception {
		jse.executeScript("arguments[0].click()", EDITLOANBTN);
	}
	
	public void clickOnCoPayment(String coPaymentInput) throws Exception {
		waitForVisibleElement(driver, COPAYMENTTXTBOX);
		click(COPAYMENTTXTBOX, "COPAYMENTTXTBOX");
		enterText(COPAYMENTTXTBOX, "COPAYMENTTXTBOX", coPaymentInput);
	}
	
	public void clickOnTerm() throws Exception {
		
	}
	
	public void clickonAPR() throws Exception {
		
	}
		
	public void clickOnSelectLoanPayment() throws Exception {
		String url = driver.getCurrentUrl();
		System.out.println("Generating Proposal...");
		System.out.println("Quote Link: " + url);
		click(SELECTLOANBTN, "SELECTLOANBTN");
		Boolean wait = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
	}
	
	public void clickEditLeaseBtn() throws Exception {		
		jse.executeScript("arguments[0].click()", EDITLEASEBTN);
	}
	
	public void clickFullPrepaymentBtn() throws Exception {
		waitForVisibleElement(driver, FULLPREPAYMENTCHECKBOX);
		click(FULLPREPAYMENTCHECKBOX, "FULLPREPAYMENTCHECKBOX");
	}
	
	public void clickDownPaymentValue() throws Exception {
		waitForVisibleElement(driver, DOWNPAYMENTBTN);
		click(DOWNPAYMENTBTN, "DOWNPAYMENTBTN");
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/select[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/select[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/select[1]")).sendKeys(Keys.ENTER);
		
	}
	
	public void clickSaveBtnEditLeaseBtn() throws Exception {
		click(SAVECHANGESEDITLEASEBTN, "SAVECHANGESEDITLEASEBTN");
		Boolean wait1 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
	}
	
	public void clickOnSelectLeasePayment() throws Exception {
		String url = driver.getCurrentUrl();
		System.out.println("Generating Proposal...");
		System.out.println("Quote Link: " + url);
		waitForVisibleElement(driver, SELECTLEASEBTN);
		jse.executeScript("arguments[0].click()", SELECTLEASEBTN);
		Boolean wait1 = new WebDriverWait(driver, 180)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
		Thread.sleep(2900);
		Boolean wait2 = new WebDriverWait(driver, 180)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
	}

	public void clickOnViewProposalCashBtn() throws Exception {
		jse.executeScript("arguments[0].dblclick()", PROPOSALMENUBTN);
	}
	
	public void clickOnContractOne() throws Exception {
		waitForVisibleElement(driver, CONTRACTONECHECKBOX);
		jse.executeScript("arguments[0].click()", CONTRACTONECHECKBOX);
	}
	
	public void clickOnSendOptionsEmail() throws Exception {
		waitForVisibleElement(driver, SENDOPTIONSBTN);
		click(SENDOPTIONSBTN, "SENDOPTIONSBTN");
		waitForVisibleElement(driver, SENDTOMYSUNPOWERVIAEMAILBTN);
		click(SENDTOMYSUNPOWERVIAEMAILBTN, "SENDTOMYSUNPOWERVIAEMAILBTN");
		Thread.sleep(1900);
	}
	
	public void clickOnSendProposalBtn() throws Exception {
		waitForVisibleElement(driver, CANCELPROPOSALBTN);
		click(SENDPROPOSALBTN, "SENDPROPOSALBTN");
		Boolean wait1 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Processing...')]")));
		Thread.sleep(1900);
	}
	
	public void clickOnSendProposalsToMySunPowerBtn() throws Exception {
		waitForVisibleElement(driver, LOANCANCELPROPOSALSTOMYSUNPOWERBTN);
		click(LOANSENDPROPOSALSTOMYSUNPOWERBTN, "LOANSENDPROPOSALSTOMYSUNPOWERBTN");
		Boolean wait1 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Processing...')]")));
		Thread.sleep(1900);
	}
	
	public void clickDraftLeaseContractBtn() throws Exception {
		waitForVisibleElement(driver, DRAFTLEASECONTRACTBTN);
		click(DRAFTLEASECONTRACTBTN, "DRAFTLEASECONTRACTBTN");
	}
}