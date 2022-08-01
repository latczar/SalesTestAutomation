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
	
	//Login to the sandboxes available below
	public String loginAtEnv(String env) throws Exception {
		switch (env.toUpperCase()) {
			case "QA":
				driver.get(Constant.qaPartnerPortal);
				return env;
			case "UAT":
				driver.get(Constant.uatPartnerPortal);
				return env;
			case "PROD":
				driver.get(Constant.prodPartnerPortal);
				return env;
		}		
		return null;
	}
	
	//Login as a user under any of the ff environments available below
	public String loginAsPartner(String partner) throws Exception {
		switch (partner.toUpperCase()) {
		case "QA SPD":
			waitForVisibleElement(driver, USERNAMETXTBOX);
			enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.QASPDEugeneBuenUser);
			enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.QASPDEugeneBuenPass);
			click(LOGINBTN, "LOGINBTN");
			return partner;
		case "QA ID":
			waitForVisibleElement(driver, USERNAMETXTBOX);
			enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.QAIndirectEugeneCBuenUser);
			enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.QAIndirectEugeneCBuenPass);
			click(LOGINBTN, "LOGINBTN");
			return partner;
		case "QA ND":
			waitForVisibleElement(driver, USERNAMETXTBOX);
			enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.QATPSUser);
			enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.QATPSPass);
			click(LOGINBTN, "LOGINBTN");
			return partner;

		//For UAT
		case "UAT SPD":
			waitForVisibleElement(driver, USERNAMETXTBOX);
			enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.UATSPDEugeneBuenUser);
			enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.UATSPDEugeneBuenPass);
			click(LOGINBTN, "LOGINBTN");
			return partner;
		case "UAT ID":
			waitForVisibleElement(driver, USERNAMETXTBOX);
			enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.UATIndirectBadPrittUser);
			enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.UATIndirectBadPrittPass);
			click(LOGINBTN, "LOGINBTN");
			return partner;
		case "UAT ND":
			waitForVisibleElement(driver, USERNAMETXTBOX);
			enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.UATNDGabiTPSUser);
			enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.UATNDGabiTPSPass);
			click(LOGINBTN, "LOGINBTN");
			return partner;			

		//For PROD
		case "PROD SPD":
			waitForVisibleElement(driver, USERNAMETXTBOX);
			enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.PRODSPDEugeneBuenUser);
			enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.PRODSPDEugeneBuenPass);
			click(LOGINBTN, "LOGINBTN");
			return partner;
		case "PROD ID":
			waitForVisibleElement(driver, USERNAMETXTBOX);
			enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.PRODIndirectBadPrittUser);
			enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.PRODIndirectBadPrittPass);
			click(LOGINBTN, "LOGINBTN");
			return partner;
		case "PROD ND":
			waitForVisibleElement(driver, USERNAMETXTBOX);
			enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.PRODNDGabiTPSUser);
			enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.PRODNDGabiTPSPass);
			click(LOGINBTN, "LOGINBTN");
			return partner;
		}
		return null;
	}
}
