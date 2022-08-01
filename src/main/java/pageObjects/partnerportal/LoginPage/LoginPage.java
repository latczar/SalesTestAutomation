package pageObjects.partnerportal.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageObjects.partnerportal.home.BasePage;
import utils.Constant;

public class LoginPage extends BasePage {
	
	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"LightningComponentid\"]/c-pl-signin/div/lightning-layout/slot/lightning-layout-item[1]/slot/div/lightning-layout[4]/slot/lightning-layout-item/slot/input")
	WebElement USERNAMETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"LightningComponentid\"]/c-pl-signin/div/lightning-layout/slot/lightning-layout-item[1]/slot/div/lightning-layout[5]/slot/lightning-layout-item/slot/input")
	WebElement PASSWORDTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"LightningComponentid\"]/c-pl-signin/div/lightning-layout/slot/lightning-layout-item[1]/slot/div/lightning-layout[6]/slot/lightning-layout-item/slot/button") WebElement LOGINBTN;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Forgot Your Password?')]") WebElement FORGOTPASSWORDBTN;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void load(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());}
	}

	public boolean isUsernameTextBoxVisible() {
		objExists(pageName, USERNAMETXTBOX, "USERNAMETXTBOX", true);
		return USERNAMETXTBOX.isDisplayed();
	}
	
	public boolean isPasswordTextBoxVisible() {
		objExists(pageName, PASSWORDTXTBOX, "PASSWORDTXTBOX", true);
		return PASSWORDTXTBOX.isDisplayed();
	}
	
	public boolean isLoginButtonVisible() {
		objExists(pageName, LOGINBTN, "LOGINBTN", true);
		return LOGINBTN.isDisplayed();
	}
	
	public boolean isForgotYourPasswordLinkVisible() {
		objExists(pageName, FORGOTPASSWORDBTN, "FORGOTPASSWORDBTN", true);
		return FORGOTPASSWORDBTN.isDisplayed();
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	//For QA
	
	public void loginAsIndirectPartnerQA(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		//enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.QAIndirectPartnerEugeneBuenUser);
		//enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.QAIndirectPartnerEugeneBuenPass);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.QAIndirectPartnerEugeneCBuenUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.QAIndirectPartnerEugeneCBuenPass);
		click(LOGINBTN, "LOGINBTN");
	}	
	
	public void loginAsTPSQA(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.QATPSUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.QATPSPass);
		click(LOGINBTN, "LOGINBTN");
	}
	
	public void loginAsSPDQA(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.QASPDEugeneBuenUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.QASPDEugeneBuenPass);
		click(LOGINBTN, "LOGINBTN");
	}	
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//For UAT
	
	public void loginAsTPSUAT(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.UATNDGabiTPSUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.UATNDGabiTPSPass);
		click(LOGINBTN, "LOGINBTN");
	}
	
	public void loginAsIndirectPartnerUAT(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.UATIndirectPartnerGabiLoyalty5DigitalTestUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.UATIndirectPartnerGabiLoyalty5DigitalTestPass);
		click(LOGINBTN, "LOGINBTN");
	}	
	
	public void loginAsSPDUAT(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.UATSPDEugeneBuenUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.UATSPDEugeneBuenPass);
		click(LOGINBTN, "LOGINBTN");
	}

//----------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	//For PROD
	
	public void loginAsTPSPROD(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.PRODNDGabiTPSUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.PRODNDGabiTPSPass);
		click(LOGINBTN, "LOGINBTN");
	}
	
	public void loginAsIndirectPartnerPROD(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.PRODIndirectPartnerBadPrittUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.PRODIndirectPartnerBadPrittPass);
		click(LOGINBTN, "LOGINBTN");
	}	
	
	public void loginAsSPDPROD(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.PRODSPDEugeneBuenUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.PRODSPDEugeneBuenPass);
		click(LOGINBTN, "LOGINBTN");
	}
}
