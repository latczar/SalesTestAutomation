package pageObjects.partnerportal.Accounts.StackOverflow;

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

import pageObjects.partnerportal.home.BasePage;
import pageObjects.partnerportal.Accounts.GmailApp.GmailAppPage;
import utils.Constant;
import utils.FunctionLibrary;

public class StackOverflowAppPage extends BasePage {
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how=How.XPATH, xpath="//a[contains(text(),'Log in')]")
	WebElement LOGINSTACKOVERFLOWBTN;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"openid-buttons\"]/button[1]")
	WebElement GOOGLELOGINBTN;
	
	
	public StackOverflowAppPage() {
		//this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToStackOverflowApp() {
		jse.executeScript("window.open();");
		switchToThirdWindow();
		String baseUrl = Constant.StackOverflowApp;
		driver.get(baseUrl);
		}
	
	public void clickSOLogInBtn() throws Exception {
		click(LOGINSTACKOVERFLOWBTN, "LOGINSTACKOVERFLOWBTN");
		WebElement element = new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(GOOGLELOGINBTN));
		click(GOOGLELOGINBTN, "GOOGLELOGINBTN");
	}
}
