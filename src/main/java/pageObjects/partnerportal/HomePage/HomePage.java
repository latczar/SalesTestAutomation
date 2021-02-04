package pageObjects.partnerportal.HomePage;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.partnerportal.home.BasePage;

public class HomePage extends BasePage {

	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Home')]")
	WebElement HOMEMENUBTN;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Accounts')]")
	WebElement ACCOUNTSMENUBTN;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Orders')]")
	WebElement ORDERSMENUBTN;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Projects')]")
	WebElement PROJECTSMENUBTN;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Content')]")
	WebElement CONTENTMENUBTN;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Support')]")
	WebElement SUPPORTMENUBTN;
	
	@FindBy(how = How.XPATH, using = "//a[@id='moreHref']")
	WebElement MOREMENUBTN;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isHomeMenuBtnDisplayed() throws Exception {
		waitForVisibleElement(driver, HOMEMENUBTN);
		return HOMEMENUBTN.isDisplayed();
	}
}
