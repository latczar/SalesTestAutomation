package pageObjects.mySunPower.Login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pageObjects.partnerportal.home.BasePage;

public class HomePageMySunPower extends BasePage {
	
JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	//Start of SDS MySunPower web elements
	@FindBy(how = How.XPATH, using = "//*[@id='okta-signin-username']")
	WebElement MYSUNPOWERUSERNAMEINPUTFIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id='okta-signin-password']")
	WebElement MYSUNPOWERPASSWORDINPUTFIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id='okta-signin-submit']")
	WebElement SIGNINBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")
	WebElement MYSUNPOWERLOGINPASSWORDINPUT;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[1]/input[1]")
	WebElement CONFIRMPASSWORDINPUT;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'SUBMIT')]")
	WebElement SUBMITBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")
	WebElement PHONENUMBERINPUT;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]")
	WebElement PHONENUMSKIPBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div[2]/div/div[2]")
	WebElement SIGNAGREEMENTTXT;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div[2]/div/div[6]/div/div[2]/button")
	WebElement CASHAGREEMENTSIGNBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div[2]/div/div[4]/button")
	WebElement GETCREDITAPPROVALBTN;
	
	//Credit Check Information Page
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/label/span[1]/span/input")
	WebElement SPANISHLANGUAGECHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement CREDITCHECKFIRSTLASTNAMEFIELD;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")
	WebElement CREDITCHECKEMAILINPUTFIELD;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div[5]/div[1]/label/span[1]/span/input")
	WebElement BYCHECKINGTHISCHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')])")
	WebElement CREDITCHECKCANCELBTN;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Accept')]")
	WebElement CREDITCHECKACCEPTBTN;
	
	//Solar Address Page
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	WebElement YEARSATADDRESSINPUT;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[4]/div[1]/div[2]/label[1]/span[1]/span[1]/input[1]")
	WebElement YESRADIOBTNOWNHOME;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div/div[4]/div[1]/div[2]/label[2]/span[1]/span[1]")
	WebElement NORADIOBTNOWNHOME;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[4]/div[2]/div[2]/label[1]/span[1]/span[1]/input[1]")
	WebElement YESPRIMARYRESIDENCEBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div/div[4]/div[2]/div[2]/label[2]/span[1]/span[1]")
	WebElement NOPRIMARYRESIDENCEBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div/div[6]/div/label/span[1]/span")
	WebElement BUYINGNEWHOMEORLESSTHANCHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div/div[7]/div[2]/div/button")
	WebElement SOLARINSTALLEDNEXTBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div/div[7]/div[1]/button")
	WebElement SOLARINSTALLEDCANCELBTN;
	
	//Credit Approval Page
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement CREDITAPPROVALPAGEDOB;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	WebElement CREDITAPPROVALPAGESSN;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement CREDITAPPROVALPAGEINDIVANNUALINCOME;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")
	WebElement CREDITAPPROVALPAGEHOUSEHOLDANNUALINCOME;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[3]/div[1]/div[1]/input[1]")
	WebElement CREDITAPPROVALPAGEMONTHLYMORTGAGE;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[4]/div[1]/div[1]/input[1]")
	WebElement CREDITAPPROVALPAGEEMPLOYER;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement CREDITAPPROVALPAGEJOBTITLE;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/label[1]/span[1]/span[1]/input[1]")
	WebElement CREDITAPPROVALPAGERETIREDCHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[1]/label[1]/span[1]/span[1]/input[1]")
	WebElement CREDITAPPROVALPAGEADDCOAPPLICANT;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	WebElement CREDITAPPROVALPAGENEXTBTN;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/label[1]/span[1]/span[1]/input[1]")
	WebElement CREDITAPPROVALPAGETERMSCHECKBOX;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
	WebElement CREDITAPPROVALPAGESUBMITBTN;
	
	public HomePageMySunPower() {
		//this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterAndConfirmPassword(String password) throws Exception {
		waitForVisibleElement(driver, MYSUNPOWERLOGINPASSWORDINPUT);
		click(MYSUNPOWERLOGINPASSWORDINPUT,"MYSUNPOWERLOGINPASSWORDINPUT");
		Thread.sleep(1400);
		enterText(MYSUNPOWERLOGINPASSWORDINPUT, "MYSUNPOWERLOGINPASSWORDINPUT", password);
		click(CONFIRMPASSWORDINPUT,"CONFIRMPASSWORDINPUT");
		Thread.sleep(1400);
		enterText(CONFIRMPASSWORDINPUT, "CONFIRMPASSWORDINPUT", password);
	}
	
	public void clickMySunPowerSubmitBtn() throws Exception {
		waitForVisibleElement(driver, SUBMITBTN);
		click(SUBMITBTN, "SUBMITBTN");
	}
	
	public void clickSkipPhoneNumBtn() throws Exception {
		waitForVisibleElement(driver, PHONENUMSKIPBTN);
		click(PHONENUMSKIPBTN, "PHONENUMSKIPBTN");
	}
	
	public void signAgreementBtn() throws Exception {
		waitForVisibleElement(driver, SIGNAGREEMENTTXT);
		click(CASHAGREEMENTSIGNBTN, "CASHAGREEMENTSIGNBTN");
	}
	
	public void enterUsername(String email) throws Exception {
		waitForVisibleElement(driver, MYSUNPOWERUSERNAMEINPUTFIELD);
		click(MYSUNPOWERUSERNAMEINPUTFIELD, "MYSUNPOWERUSERNAMEINPUTFIELD");
		Thread.sleep(1400);
	}
	
	public void enterPassword(String password) throws Exception {
		waitForVisibleElement(driver, MYSUNPOWERPASSWORDINPUTFIELD);
		click(MYSUNPOWERPASSWORDINPUTFIELD, "MYSUNPOWERPASSWORDINPUTFIELD");
		Thread.sleep(1400);
	}
	
	public void clickSignInBtn() throws Exception {
		click(SIGNINBTN, "SIGNINBTN");
	}
	
	public void clickGetApprovalBtn() throws Exception {
		waitForVisibleElement(driver, GETCREDITAPPROVALBTN);
		click(GETCREDITAPPROVALBTN, "GETCREDITAPPROVALBTN");
		Thread.sleep(1400);
	}
	
	public void enterCreditCheckName(String creditCheckName) throws Exception {
		waitForVisibleElement(driver, CREDITCHECKFIRSTLASTNAMEFIELD);
		scrollPageDownBy500();
		enterText(CREDITCHECKFIRSTLASTNAMEFIELD, "CREDITCHECKFIRSTLASTNAMEFIELD",creditCheckName);
	}
	
	public void enterCreditCheckEmail(String creditCheckEmail) throws Exception {
		enterText(CREDITCHECKEMAILINPUTFIELD, "CREDITCHECKEMAILINPUTFIELD", creditCheckEmail);
		click(BYCHECKINGTHISCHECKBOX, "BYCHECKINGTHISCHECKBOX");
		Thread.sleep(400);
	}
	
	public void clickCreditCheckAcceptBtn() throws Exception {
		click(CREDITCHECKACCEPTBTN, "CREDITCHECKACCEPTBTN");
		Thread.sleep(1400);
	}
	
	public void enterYearsAtThisAddress(String years) throws Exception {
		waitForVisibleElement(driver, YEARSATADDRESSINPUT);
		click(YEARSATADDRESSINPUT, "YEARSATADDRESSINPUT");
		enterText(YEARSATADDRESSINPUT, "YEARSATADDRESSINPUT", years);
	}
	
	public void clickYesToOwnHome() throws Exception {
		click(YESRADIOBTNOWNHOME, "YESRADIOBTNOWNHOME");
	}
	
	public void clickYesPrimaryResidence() throws Exception {
		click(YESPRIMARYRESIDENCEBTN, "YESPRIMARYRESIDENCEBTN");
	}
	
	public void clickSolarAddressNextBtn() throws Exception {
		click(SOLARINSTALLEDNEXTBTN, "SOLARINSTALLEDNEXTBTN");
	}
	
	public void enterDateOfBirth(String date) throws Exception {
		waitForVisibleElement(driver, CREDITAPPROVALPAGEDOB);
		enterText(CREDITAPPROVALPAGEDOB, "CREDITAPPROVALPAGEDOB", date);
	}
	
	public void enterSocialSecurityNumber(String socialNumber) throws Exception {
		waitForVisibleElement(driver, CREDITAPPROVALPAGESSN);
		enterText(CREDITAPPROVALPAGESSN, "CREDITAPPROVALPAGESSN", socialNumber);
	}
	
	public void enterIndividualAnnualIncome(String individualIncome) throws Exception {
		enterText(CREDITAPPROVALPAGEINDIVANNUALINCOME, "CREDITAPPROVALPAGEINDIVANNUALINCOME", individualIncome);
	}
	
	public void enterHouseholdIncome(String householdIncome) throws Exception {
		enterText(CREDITAPPROVALPAGEHOUSEHOLDANNUALINCOME, "CREDITAPPROVALPAGEHOUSEHOLDANNUALINCOME", householdIncome);
	}
	
	public void enterMortgagePayment(String monthlyMortgage) throws Exception {
		enterText(CREDITAPPROVALPAGEMONTHLYMORTGAGE, "CREDITAPPROVALPAGEMONTHLYMORTGAGE", monthlyMortgage);
	}
	
	public void clickRetiredCheckbox() throws Exception {
		click(CREDITAPPROVALPAGERETIREDCHECKBOX, "CREDITAPPROVALPAGERETIREDCHECKBOX");
	}
	
	public void clickNextBtn() throws Exception {
		click(CREDITAPPROVALPAGENEXTBTN, "CREDITAPPROVALPAGENEXTBTN");
	}
	
	public void clickTermsAbove() throws Exception {
		waitForVisibleElement(driver, CREDITAPPROVALPAGETERMSCHECKBOX);
		click(CREDITAPPROVALPAGETERMSCHECKBOX, "CREDITAPPROVALPAGETERMSCHECKBOX");
	}
	
	public void clickCreditApprovalPageSubmitBtn() throws Exception {
		click(CREDITAPPROVALPAGESUBMITBTN, "CREDITAPPROVALPAGESUBMITBTN");
	}
}
