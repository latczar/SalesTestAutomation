package pageObjects.mySunPower.Login;

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

public class MySunPowerLoginPage extends BasePage {
	
JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
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
	
	public MySunPowerLoginPage() {
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
}
