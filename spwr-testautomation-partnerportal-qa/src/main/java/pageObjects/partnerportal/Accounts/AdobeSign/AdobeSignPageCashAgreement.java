package pageObjects.partnerportal.Accounts.AdobeSign;

import java.util.List;

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

import pageObjects.partnerportal.Accounts.StackOverflow.StackOverflowAppPage;
import pageObjects.partnerportal.home.BasePage;
import utils.Constant;
import utils.FunctionLibrary;

public class AdobeSignPageCashAgreement extends BasePage {
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how = How.XPATH, using="//*[@id='document']/button")
	WebElement ADOBESIGNSTARTBTN;
	
	@FindBy(how = How.XPATH, using="//body/div[@id='mainContent']/div[2]/div[1]/div[3]/button[1]")
	WebElement NEXTFIELDBTN;
	
	@FindBy(how = How.XPATH, using="//a[contains(text(),'Next required field')]")
	WebElement NEXTREQUIREDFIELDBTN;
	
	@FindBy(how = How.XPATH, using ="//*[@id='document']/ul/li[10]/div[1]/div[4]")
	WebElement CUSTOMERINITIALFIELD;
	
	@FindBy(how= How.XPATH, using ="//html[1]/body[1]/div[10]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/input[1]")
	WebElement CUSTOMERINITIALFIRSTFIELDINPUT;
	
	@FindBy(how = How.XPATH, using="//html/body/div[10]/div/div[2]/div[3]/div[3]/button[1]")
	WebElement INITIALSCLOSEBTN;
	
	@FindBy(how = How.XPATH, using="//html/body/div[10]/div/div[2]/div[3]/div[3]/button[2]")
	WebElement INITIALSAPPLYBTN;
	
	@FindBy(how = How.XPATH, using="//body/div[@id='mainContent']/div[2]/div[1]/div[3]/ul[1]/li[10]/div[4]/div[4]")
	WebElement CUSTOMERINITIALSECONDFIELD;
	
	@FindBy(how = How.XPATH, using="//body/div[10]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/input[1]")
	WebElement CUSTOMERINITIALSECONDFIELDINPUT;
	
	@FindBy(how = How.XPATH, using="//button[contains(text(),'Close')]")
	WebElement SECONDINITIALSCLOSEBTN;
	
	@FindBy(how = How.XPATH, using="//body/div[10]/div[1]/div[2]/div[3]/div[3]/button[2]")
	WebElement SECONDINITIALSAPPLYBTN;
	
	@FindBy(how = How.XPATH, using="//*[@id='document']/ul/li[12]/div[1]/div[4]")
	WebElement CUSTOMERSIGNATUREFIELD;
	
	@FindBy(how = How.XPATH, using="//html[1]/body[1]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/input[1]")
	WebElement CUSTOMERSIGNATUREINPUT;
		
	@FindBy(how = How.XPATH, using="//html/body/div[11]/div/div[2]/div[3]/div[3]/button[1]")
	WebElement SIGNATURECLOSEBTN;
	
	@FindBy(how = How.XPATH, using="//html/body/div[11]/div/div[2]/div[3]/div[3]/button[2]")
	WebElement SIGNATUREAPPLYBTN;
	
	@FindBy(how = How.XPATH, using="//body/div[@id='mainContent']/div[2]/div[1]/div[3]/ul[1]/li[20]/div[1]/div[4]")
	WebElement RECEIPTSIGNATURE;
	
	@FindBy(how = How.XPATH, using="//*[@id='footer']/div[1]/div[2]/div/div[2]/div/button")
	WebElement CLICKTOSIGNBTN;
		
	public AdobeSignPageCashAgreement() {
		//this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void clickStartBtnAdobeSign() throws Exception {
		waitForVisibleElement(driver, ADOBESIGNSTARTBTN);
		click(ADOBESIGNSTARTBTN, "ADOBESIGNSTARTBTN");
	}
	
	public void clickNextRequiredFieldBtn() throws Exception {
		click(NEXTREQUIREDFIELDBTN, "NEXTREQUIREDFIELDBTN");
	}
	
	public void clickNextFieldBtn() throws Exception {
		click(NEXTFIELDBTN, "NEXTFIELDBTN");
	}
		
	public void clickCustomerInitialField() throws Exception {
		click(CUSTOMERINITIALFIELD, "CUSTOMERINITIALFIELD");
		waitForVisibleElement(driver, CUSTOMERINITIALFIRSTFIELDINPUT);
		click(CUSTOMERINITIALFIRSTFIELDINPUT,"CUSTOMERINITIALFIRSTFIELDINPUT");
		enterText(CUSTOMERINITIALFIRSTFIELDINPUT, "CUSTOMERINITIALFIRSTFIELDINPUT", "qa");
		click(INITIALSAPPLYBTN, "INITIALSAPPLYBTN");
		Thread.sleep(1999);
	}
	
	public void clickCustomerInitialSecondField() throws Exception {
		jse.executeScript("arguments[0].click()", CUSTOMERINITIALSECONDFIELD);
		Thread.sleep(1999);
	}
	
	public void clickCustomerSignatureField() throws Exception {
		click(CUSTOMERSIGNATUREFIELD, "CUSTOMERSIGNATUREFIELD");
		Thread.sleep(1999);
		enterText(CUSTOMERSIGNATUREINPUT, "CUSTOMERSIGNATUREINPUT", "qa"); 
		click(SIGNATUREAPPLYBTN, "SIGNATUREAPPLYBTN");
	}
	
	public void clickReceiptSignatureField() throws Exception {
		Thread.sleep(1999);
		click(RECEIPTSIGNATURE, "RECEIPTSIGNATURE");
		Thread.sleep(1999);
	}
	
	public void clickToSignBtn() throws Exception {
		waitForVisibleElement(driver, CLICKTOSIGNBTN);
		click(CLICKTOSIGNBTN, "CLICKTOSIGNBTN");
		Thread.sleep(1300);
		driver.close();
	}
}
