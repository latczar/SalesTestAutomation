package pageObjects.mySunPower.ReviewProposal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;


import pageObjects.partnerportal.home.BasePage;

public class MySunPowerReviewProposalPage extends BasePage{
	
JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Review Proposal')]")
	WebElement REVIEWPROPOSALTXT;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]")
	public static WebElement MYSUNPOWERCREATEACCTBTN;
	
	
	
	
	public MySunPowerReviewProposalPage() {
		//this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

}
