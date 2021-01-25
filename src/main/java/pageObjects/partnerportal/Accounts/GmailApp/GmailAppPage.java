package pageObjects.partnerportal.Accounts.GmailApp;

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

public class GmailAppPage extends BasePage {
	
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how=How.XPATH, xpath="//input[@id='identifierId']")
	WebElement GMAILEMAILFIELD;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='password']/div[1]/div/div[1]/input")
	WebElement GMAILPASSWORDFIELD;
	
	@FindBy(how=How.XPATH, xpath="//span[@class='bog']")
	List<WebElement> GMAILEMAILTHREADS;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"gb\"]/div[2]/div[1]/div[4]/div/a")
	WebElement GMAILPROFILELOGO;
	
	@FindBy(how=How.XPATH, xpath="//a[contains(text(),'Log in')]")
	WebElement LOGINSTACKOVERFLOWBTN;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"identifierNext\"]/div/button")
	WebElement GMAILNEXTBTNEMAIL;

	@FindBy(how=How.XPATH, xpath="//*[@id=\"passwordNext\"]/div/button/div[2]")
	WebElement GMAILNEXTBTNPASSWORD;
	
	@FindBy(how=How.XPATH, xpath="//a[contains(text(),'Review and sign')]")
	public static WebElement REVIEWANDSIGNBTN;
	
	@FindBy(how=How.XPATH, xpath="//a[contains(text(),'spwrtestesign@gmail.com')]")
	public static WebElement SPWRESIGNTESTEMAIL;
	
	@FindBy(how=How.XPATH, xpath="//tbody/tr[4]/td[1]/div[1]/a[1]/img[1]")
	public static WebElement GETSTARTEDBTN;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=':mi']/div/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/div/a/img")
	public static WebElement VIEWPROPOSALBTN;
	
	@FindBy(how=How.XPATH, xpath="//tbody/tr[2]/td[1]/div[1]/div[3]/span[1]")
	public static WebElement THANKSFORCHOOSINGTXT;
	
	@FindBy(how=How.XPATH, xpath="//tbody/tr[3]/td[1]/div[1]/a[1]/img[1]")
	public static WebElement SIGNAGREEMENTBTN;
	
	public GmailAppPage() {
		//this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
		
	public void navigateBackToGmailApp() {
		WebElement element = new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(LOGINSTACKOVERFLOWBTN));
		String baseUrl = Constant.GmailInbox;
		driver.get(baseUrl);
		clickEnterViaActions();		
	}
	
	public void navigateToGmailApp() {
		String baseUrl = Constant.GmailInbox;
		driver.get(baseUrl);
		clickEnterViaActions();
		waitForVisibleElement(driver, GMAILPROFILELOGO);
	}
	
	public void gmailInputEmail() throws Exception {
		waitForVisibleElement(driver, GMAILEMAILFIELD);
		enterText(GMAILEMAILFIELD, "GMAILEMAILFIELD", Constant.UsernameGmailApp);
		click(GMAILNEXTBTNEMAIL, "GMAILNEXTBTNEMAIL");
		clickEnterViaActions();
		System.out.println("Entering Email...");
	}
	
	public void gmailPartnerInputEmail() throws Exception {
		waitForVisibleElement(driver, GMAILEMAILFIELD);
		enterText(GMAILEMAILFIELD, "GMAILEMAILFIELD", Constant.PartnerUsernameGmailApp);
		click(GMAILNEXTBTNEMAIL, "GMAILNEXTBTNEMAIL");
		clickEnterViaActions();
		System.out.println("Entering Email...");
	}
	
	public void gmailInputPassword() throws Exception {
		waitForVisibleElement(driver, GMAILPASSWORDFIELD);
		enterText(GMAILPASSWORDFIELD, "GMAILPASSWORDFIELD", Constant.PasswordGmailApp);
		click(GMAILNEXTBTNPASSWORD, "GMAILNEXTBTNPASSWORD");
		clickEnterViaActions();
		System.out.println("Entering Password...");
	}
	
	public void gmailPartnerInputPassword() throws Exception {
		waitForVisibleElement(driver, GMAILPASSWORDFIELD);
		enterText(GMAILPASSWORDFIELD, "GMAILPASSWORDFIELD", Constant.PartnerPasswordGmailApp);
		click(GMAILNEXTBTNPASSWORD, "GMAILNEXTBTNPASSWORD");
		clickEnterViaActions();
		System.out.println("Entering Password...");
	}
	
	public boolean retryingFindClickEmail(String emailName) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	    		for (int i = 0; i < GMAILEMAILTHREADS.size(); i++) {
	    			if (GMAILEMAILTHREADS.get(i).getText().contains(emailName)) {
	    				GMAILEMAILTHREADS.get(i).click();
	    						System.out.println(emailName + " Email is clicked");
	    						result = true;
	    							break;
	    				}
	    			}
	        	}
	        catch(StaleElementReferenceException e) {
	        }
	        attempts++;
    		break;
	    }
	    return result;
	}
	
	
	public void retryingFindClickViewGetReviewAndSign(WebElement element, WebElement elementToClick) throws Exception {
	    int attempts = 0;
		element = new WebDriverWait(driver, 60).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(element));
		System.out.println(element + "Email located");
		Thread.sleep(2000);
		while(attempts < 2) {
			try {
				waitForVisibleElement(driver, elementToClick);
				jse.executeScript("arguments[0].click()", elementToClick);
	    			switchHandlesToNewWindow();
	    				System.out.println(elementToClick + " is clicked");
	    				return;
	    			}
	        	 catch(StaleElementReferenceException e) {
	        	 }
			break;
	    	}
	    	attempts++; 
	    }
}
