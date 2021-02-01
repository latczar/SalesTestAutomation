package pageObjects.mySunPower.ReviewProposal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;


import pageObjects.partnerportal.home.BasePage;

public class ReviewProposalPageMySunPower extends BasePage{
	
JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Review Proposal')]")
	WebElement REVIEWPROPOSALTXT;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'NEXT: REVIEW & SIGN PROPOSAL')]")
	WebElement NEXTREVIEWANDSIGNPROPOSALBTN;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'NEXT: CREATE ACCOUNT')]")
	WebElement NEXTCREATEACCTBTN;
	
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/main/div/div[2]/div[2]/div[2]/div/div[2]")
	WebElement REVIEWPROPOSALSIGNEDTXT;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]")
	public static WebElement MYSUNPOWERCREATEACCTBTN;
	
	
	public ReviewProposalPageMySunPower() {
		//this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickReviewAndSignProposalBtn() throws Exception {
		waitForVisibleElement(driver, NEXTREVIEWANDSIGNPROPOSALBTN);
		click(NEXTREVIEWANDSIGNPROPOSALBTN, "NEXTREVIEWANDSIGNPROPOSALBTN");
		
	}
	
	public void clickCreateAccountBtn() throws Exception {
		waitForVisibleElement(driver, MYSUNPOWERCREATEACCTBTN);
		click(MYSUNPOWERCREATEACCTBTN, "MYSUNPOWERCREATEACCTBTN");
	}
}
