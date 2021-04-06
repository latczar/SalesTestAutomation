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
	
	@FindBy(how = How.XPATH, using = "//input[@id='j_id0:pploginForm:username']") WebElement USERNAMETXTBOX;
	@FindBy(how = How.XPATH, using = "//input[@id='j_id0:pploginForm:password']") WebElement PASSWORDTXTBOX;
	@FindBy(how = How.XPATH, using = "//input[@id='j_id0:pploginForm:loginButton']") WebElement LOGINBTN;
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
	
	//For QA
	
	public void loginAsIndirectPartnerQA(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.QAIndirectPartnerGabiSolarUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.QAIndirectPartnerGabiSolarPass);
		click(LOGINBTN, "LOGINBTN");
	}	
	
	public void loginAsTPSQA(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.QATPSUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.QATPSPass);
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
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.UATIndirectPartnerGabiSolarUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.UATIndirectPartnerGabiSolarPass);
		click(LOGINBTN, "LOGINBTN");
	}	
}
