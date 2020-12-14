package pageObjects.partnerportal.Accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

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
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"myDropdown\"]/a") //For UAT = //*[@id="myDropdown"]/a[2]
	WebElement RESIDENTIALCUSTOMERBTN;
	
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
	//@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/edit-usage-input-modal/section/div/div/section[1]/div[1]/div[1]/sp-dropdown-filterlist/div/div/div/ul/li")
	//html/body/app-root/ng-component/residential-main-tabs/edit-usage-input-modal/section/div/div/section[1]/div[1]/div[1]/sp-dropdown-filterlist/div/div/div/ul/li[1]
	//html/body/app-root/ng-component/residential-main-tabs/edit-usage-input-modal/section/div/div/section[1]/div[1]/div[1]/sp-dropdown-filterlist/div/div/div/ul/li[1]
	//html/body/app-root/ng-component/residential-main-tabs/edit-usage-input-modal/section/div/div/section[1]/div[1]/div[1]/sp-dropdown-filterlist/div/div/div/ul/li[1]
	//html/body/app-root/ng-component/residential-main-tabs/edit-usage-input-modal/section/div/div/section[1]/div[1]/div[1]/sp-dropdown-filterlist/div/div/div/ul/li[1]
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
	
	@FindBy(how = How.XPATH, using = "//html/body/app-root/ng-component/residential-main-tabs/main/div[2]/div[2]/div/section[1]/residential-quotes/div/div/div[2]/div/span[2]/a")
	WebElement NEWMANUALQUOTEBTN;
	
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
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
	WebElement MONITORINGBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]/div")
	WebElement STORAGEBTN;
	
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
	WebElement QUOTENAMETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id='settings']/div[2]/div[2]/div[1]/ul/li[1]")
	WebElement CASHQUOTESETTINGSBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"settings\"]/div[2]/div[2]/div[2]/div/div/form/div[1]/label/span")
	WebElement CASHQUOTECHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cash_settings_price_per_watt']")
	WebElement PRICEPERWATTCASHTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id='settings']/div[2]/div[2]/div[1]/ul/li[2]")
	WebElement LEASEQUOTESETTINGSBTN;
		
	@FindBy(how = How.XPATH, using = "//input[@id='lease_settings_price_per_watt']")
	WebElement PRICEPERWATTLEASETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id='settings']/div[2]/div[2]/div[1]/ul/li[3]")
	WebElement LOANQUOTESETTINGSBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id='loan_settings_price_per_watt']")
	WebElement PRICEPERWATTLOANTXTBOX;
	
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
	
	//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	@FindBy(how = How.XPATH, using = "//*[@id='main-content']/div[3]/div/div[2]/div/div/div/div/div[3]/button")
	WebElement SELECTLEASEBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[1]/div/div/div[2]/div[3]/div/div[1]/ul/li[3]")
	WebElement PAYMENTOPTIONLOANTAB;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	WebElement SELECTLOANBTN;
	
	//@FindBy(how = How.XPATH, using = "//*[@id='lease_view_edit_lease_toggle'])")
	@FindBy(how = How.XPATH, using = "//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")
	WebElement EDITLEASEBTN;
	
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
	
	public void createNewResidentialCustomerAccount() throws Exception {
		click(RESIDENTIALCUSTOMERBTN, "RESIDENTIALCUSTOMERBTN");
	}
	
	public boolean isNewAccountResidentialFormDisplayed() throws Exception {
		return ACCOUNTINFORMATIONTEXT.isDisplayed();
	}
	
	public void inputNewResidentialCustomerName(String firstName, String lastName) throws Exception {
		WebElement element = new WebDriverWait(driver, 120).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(FIRSTNAMETXTBOX));
		enterText(FIRSTNAMETXTBOX, "FIRSTNAMETXTBOX", firstName);
		enterText(LASTNAMETXTBOX, "LASTNAMETXTBOX", lastName);
	}
	
	public void inputNewPhoneNumber(String phoneNum) throws Exception {
		click(PHONENUMBERTXTBOX, "PHONENUMBERTXTBOX");
		enterText(PHONENUMBERTXTBOX, "PHONENUMBERTXTBOX", phoneNum);

	}
	
	public void inputNewEmail(String email) throws Exception {
		enterText(EMAILTXTBOX, "EMAILTXTBOX", email);
	}
	
	public void inputNewAddress(String address) throws Exception {
		scrollPageDown();
		enterText(ADDRESSTXTBOX, "ADDRESSTXTBOX", address);
		WebElement element = new WebDriverWait(driver, 12).until(ExpectedConditions.elementToBeClickable(AUTOCOMPLETEADDRESSTABLE));
		AUTOCOMPLETEADDRESSTABLE.click();
	}
	
	public void clickSaveBtn() throws Exception {
		Thread.sleep(1000);
		scrollPageDown();
		WebElement element = new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(SAVEBTN));
		click(SAVEBTN, "SAVEBTN");
	}
	
	public boolean isBasicInfoPageDisplayed() throws Exception {
		WebElement element = new WebDriverWait(driver, 120).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(BASICINFOTAB));
		return BASICINFOTAB.isDisplayed();
	}
	
	public void clickQualificationTab() throws Exception {
		Boolean wait = new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//html/body/app-root/sp-loading/div/div/span")));
		jse.executeScript("arguments[0].click()", QUALIFICATIONTAB);
	}
	
	public void editUsageInputvalues() throws Exception {
		scrollPageDown();
		WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(EDITUSAGEINPUTBTN));
		jse.executeScript("arguments[0].click()", EDITUSAGEINPUTBTN);
	}
	
	public boolean isElectricModalDisplayed() throws Exception {
		WebElement element = new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(ELECTRICRATEANDENERGYUSAGEMODAL));
		return ELECTRICRATEANDENERGYUSAGEMODAL.isDisplayed();
	}
	
	public void inputCurrentElectricRate() throws Exception {
		Boolean wait = new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//html/body/app-root/sp-loading/div/div/span")));
		jse.executeScript("arguments[0].click()", CURRENTELECTRICRATEDROPDOWN);
		WebElement wait2 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(CURRENTELECTRICRATEFIRSTDROPDOWNITEM));
		jse.executeScript("arguments[0].click()", CURRENTELECTRICRATEFIRSTDROPDOWNITEM);
	}
	
	public void inputProposedElectricRate() throws Exception {
		jse.executeScript("arguments[0].click()", PROPOSEDELECTRICRATEDROPDOWN);
		WebElement wait = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(PROPOSEDELECTRICRATEFIRSTDROPDOWNITEM));
		jse.executeScript("arguments[0].click()", PROPOSEDELECTRICRATEFIRSTDROPDOWNITEM);
	}
	
	public void inputTotalAnnualBill(String totalAnnualBill) throws Exception {
		jse.executeScript("arguments[0]", INPUTBILLTXTBOX);
		enterText(INPUTBILLTXTBOX, "INPUTBILLTXTBOX", totalAnnualBill);
	}
	
	public void clickEnergyUsageModalSaveBtn() throws Exception {
		scrollPageDownBy();
		click(ENERGYUSAGEMODALSAVEBTN, "ENERGYUSAGEMODALSAVEBTN");
	}
	
	public void clickQuotesTab() throws Exception {
		scrollPageUp();
		Thread.sleep(5000);
		jse.executeScript("arguments[0].click()", QUOTESTAB);
	}
	
	public void clickNewManualQuoteBtn() throws Exception {
		Boolean wait = new WebDriverWait(driver, 60).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//html/body/app-root/sp-loading/div/div/span")));
		WebElement wait2 = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(NEWMANUALQUOTEBTN));
		click(NEWMANUALQUOTEBTN, "NEWMANUALQUOTEBTN");
	}

	//Start of EDDiE Portal quoting activities ------------------------------------------------------------------------>
	public boolean isEDDiEPortalPageDisplayed() throws Exception {
		switchHandlesToNewWindow();
		WebElement element = new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(DESIGNMENUBTN));
		return DESIGNMENUBTN.isDisplayed();
	}

	public void enterShadingDate(String shadingDate) throws Exception {
		enterText(SHADINGMEASUREMENTDATEINPUTBOX, "SHADINGMEASUREMENTDATEINPUTBOX", shadingDate);
	}
	
	public void clickNewRoofBtn() throws Exception {
		click(NEWROOFBTN, "NEWROOFBTN");
	}
	
	public boolean isNewRoofModalDisplayed() throws Exception {
		WebElement element = new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(PITCHDROPDOWNBTN));
		return PITCHDROPDOWNBTN.isDisplayed();
	}
	
	public void enterPitch(String pitchValue) throws Exception {
		WebElement element = new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(PITCHDROPDOWNBTN));
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
		WebElement element = new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(QUOTESETTINGSBTN));
		click(QUOTESETTINGSBTN, "QUOTESETTINGSBTN");
	}
	
	public boolean isQuoteSettingsModalDisplayed() throws Exception {
		WebElement element = new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(PRICEPERWATTCASHTXTBOX));
		return PRICEPERWATTCASHTXTBOX.isDisplayed();
	}
	
	public void clickCashOptionTab() throws Exception {
		jse.executeScript("arguments[0].click()", CASHQUOTESETTINGSBTN);
	}
	
	public void enterCashPricePerWattValue(String cashPricePerWatt) throws Exception {
		enterText(PRICEPERWATTCASHTXTBOX, "PRICEPERWATTCASHTXTBOX", cashPricePerWatt);
		sendKeysTab(PRICEPERWATTCASHTXTBOX);
		
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
	
	public void clickLoanOptionTab() throws Exception {
		jse.executeScript("arguments[0].click()", LOANQUOTESETTINGSBTN);
	}
	
	public void enterLoanPricePerWatt(String loanPricePerWatt) throws Exception {
		enterText(PRICEPERWATTLOANTXTBOX, "PRICEPERWATTLOANTXTBOX", loanPricePerWatt);
		sendKeysTab(PRICEPERWATTLOANTXTBOX);
	}
	
	public void clickQuoteSettingsSaveChanges() throws Exception {
		click(EDDIESAVECHANGESBTN, "EDDIESAVECHANGESBTN");
	}
	
	public void clickEddieSaveDesignBtn() throws Exception {
		scrollPageDown();
		Boolean wait = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"page\"]/div[1]/div[2]/nav/div[2]/span[2]"))); //span[contains(text(),'Calculating savings...')]
		click(EDDIESAVEDESIGNBTN, "EDDIESAVEDESIGNBTN");	
	}
	
	public void isViewEstimatedSavingsBtnDisplayed() throws Exception {
		scrollPageUp();
		Boolean wait = new WebDriverWait(driver, 60)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
	}
	
	public void clickEddieViewEstimatedSavingsBtn() throws Exception {
		scrollPageDown();
		WebElement element = new WebDriverWait(driver, 60).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(VIEWESTIMATEDSAVINGSBUTTON));
		click(VIEWESTIMATEDSAVINGSBUTTON, "VIEWESTIMATEDSAVINGSBUTTON");
	}
	
	public void clickEddieSavingsMenuBtn() throws Exception {
		jse.executeScript("arguments[0].click()", SAVINGSMENUBTN);
	}
	
	public boolean isEstimatedAverageSavingsTextDisplayed() throws Exception {
		WebElement element = new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(FINANCEOPTIONSDROPDOWN));
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
		Boolean wait = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
	}
	
	public void clickOnSelectLoanPayment() throws Exception {
		click(SELECTLOANBTN, "SELECTLOANBTN");
		Boolean wait = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
	}
	
	public void clickEditLeaseBtn() throws Exception {		
		jse.executeScript("arguments[0].click()", EDITLEASEBTN);
	}
	
	public void clickFullPrepaymentBtn() throws Exception {
		WebElement wait = new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(FULLPREPAYMENTCHECKBOX));
		click(FULLPREPAYMENTCHECKBOX, "FULLPREPAYMENTCHECKBOX");
	}
	
	public void clickSaveBtnEditLeaseBtn() throws Exception {
		click(SAVECHANGESEDITLEASEBTN, "SAVECHANGESEDITLEASEBTN");
		Boolean wait1 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
	}
	
	public void clickOnSelectLeasePayment() throws Exception {
		//click(SELECTLEASEBTN, "SELECTLEASEBTN");
		WebElement wait = new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(SELECTLEASEBTN));
		jse.executeScript("arguments[0].click()", SELECTLEASEBTN);
		Boolean wait1 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Calculating savings...')")));
	}

	public void clickOnViewProposalCashBtn() throws Exception {
		jse.executeScript("arguments[0].dblclick()", PROPOSALMENUBTN);
	}
}