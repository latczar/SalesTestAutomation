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
	
	
	public void loginAsPartnerQA(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.qaPartnerPortalUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.qaPartnerPortalPass);
		click(LOGINBTN, "LOGINBTN");
	}	
	
	public void loginAsPartnerUAT(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.UATPartnerPortalUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.UATPartnerPortalPass);
		click(LOGINBTN, "LOGINBTN");
	}
	
	public void loginAsNDPartnerUAT(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.NDUATPartnerPortalUser);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.NDUATPartnerPortalPass);
		click(LOGINBTN, "LOGINBTN");
	}	
}
