package pageObjects.partnerportal.home;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;

import utils.Constant;

public class BasePage {
	public static WebDriver driver = null;
	public static WebDriverWait wait;
		
	public static void initialize(String browserName, String URL) throws UnknownHostException {
		switch (browserName.toUpperCase()) {
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", Constant.DriversPath + "geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "SAFARI":
			System.setProperty("webdriver.SafariDriver.driver", Constant.DriversPath + "SafariDriver.exe");
			driver = new SafariDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", Constant.DriversPath + "IEDriverServer.exe");
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//			driver = new InternetExplorerDriver(options);
			driver = new InternetExplorerDriver();
			break;
		case "OPERA":
			OperaOptions operaOptions = new OperaOptions();
			operaOptions.setBinary("C:\\Users\\HP-PC\\AppData\\Local\\Programs\\Opera\\56.0.3051.104\\opera.exe");
			System.setProperty("webdriver.opera.driver", Constant.DriversPath + "/operadriver.exe");
			driver = new OperaDriver();
			break;
		case "EDGE":
				System.setProperty("webdriver.edge.driver", Constant.DriversPath + "/MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
				break;
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", Constant.DriversPath + "/chromedriver.exe"); // for windows
			ChromeOptions chroOptions = new ChromeOptions();
			//chroOptions.addArguments("--user-data-dir=C:\\Users\\lcaesar\\AppData\\Local\\Google\\Chrome\\User Data\\");
			//chroOptions.addArguments("--profile-directory=Profile 8");
			driver = new ChromeDriver(chroOptions);
			break;
		default:

			break;
			}
		
		driver.manage().window().maximize(); // for windows
		driver.manage().timeouts().pageLoadTimeout(Constant.defaultBrowserTimeOut, TimeUnit.SECONDS);
		driver.manage().getCookies();
		driver.manage().deleteAllCookies();
		wait = new WebDriverWait(driver, 60);
		driver.get(URL);
		
		}
	
	public static void RunListEndFlag() {
		Constant.isEndStepReached = true;
	}
	
	public static void waitElementToLoad(WebElement element) {
		boolean result = false;
		int attempts = 0;
		while (attempts <= 50 && result != true) {
			try {
				new WebDriverWait(driver, 60).ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(element));
				result = true;
			} catch (Exception e) {
				e.getMessage();
			}
			attempts++;
		}
	}
	
	public static WebElement waitElementToBeVisible(By locator) {
		WebElement element = null;
			boolean result = false;
			int attempts = 0;
			while (attempts <= 50 && result != true) {
				try {
					element = new WebDriverWait(driver, 60).ignoring(StaleElementReferenceException.class)
					.ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));
					result = true;
				} catch (Exception e) {
					e.getMessage();
				}
				attempts++;
			}
		return element;

	}
	
	public static boolean retryingFindElementAndAction(WebElement element, String action, String value) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 50) {
			try {
				waitElementToLoad(element);
				switch (action.toUpperCase()) {
				case "SENDKEYS":
					element.sendKeys(value);
					break;
				case "DROPDOWNSELECT":
					Select dropdown = new Select(element);
					dropdown.selectByVisibleText(value);
					break;
				default:
					break;
				}
				result = true;
				break;
			} catch (Exception e) {
				System.out.println("Element is not available");
			}
			attempts++;
		}
		return result;
	}
	
	public static void clickAutoComplete(WebElement element) {
		element.click();
		System.out.println("Click on " + element);
			
		element.sendKeys(Keys.RETURN);
		System.out.println("Click enter button for " + element);
	}
	
	public static void enterText(WebElement element, String locator, String value) {
	// ***** Test Step - description *****
		String tcStepDesc = "Entering text '" + value + "' in '" + locator + "' text field";
		System.out.println(tcStepDesc);
		element.sendKeys(value);	
		}
	
	public static void sendKeysTab(WebElement element) throws Exception {
		element.sendKeys(Keys.TAB);
	}
		
	public static void click(WebElement element, String locator) throws Exception {
	// ***** Test Step - description *****
		String tcStepDesc = "Click on '" + locator + "'";
		System.out.println(tcStepDesc);
		element.click();
	}
	
	public static void clickFromDropdownNoXpath(WebElement element, String locator, int xOffset, int yOffset) throws Exception {
	//Moves to and clicks dropdown button with no xpath element present aka div element only
		Actions selectFromDropDown = new Actions(driver);
		selectFromDropDown.moveToElement(element).click().build().perform();
	}
	
	public static boolean objExists(String PageName, WebElement element, String locator, boolean ExistsOnPage) {

		Constant.PageName = PageName;
		boolean text = false;
		String tcStepDesc = "Check visibility of locator '" + locator + "' in Page '" + PageName + "'";

		// ***** Test Steps - Results if element is NOT null *****
		String tcStepExpectedResultPass = "'" + locator + "' should be visible on the Application";
		String tcStepActualResultPass = "'" + locator + "' is visbile on the page '" + PageName + "'";

		// ***** Test Step - Results if element is null *****
		String tcStepExpectedResultFail = "'" + locator + "' should be visible on the Application";
		String tcStepActualResultFail = "'" + locator + "' is Not visbile on the page '" + PageName + "'";
		
		return text;
	}
	
	public static void scrollPageDown() {
		System.out.println("Scrolling page down for viewport...");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
	}
	
	public static void scrollPageDownBy500() {
		System.out.println("Scrolling page down by 500px for viewport...");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public static void scrollPageUp() {
		System.out.println("Scrolling page up for viewport...");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-3000)");
	}
	
	public static void switchHandlesToNewWindow() {
		System.out.println("Switching handles to new tab...");
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}
	
	public static void switchToThirdWindow() {
		System.out.println("Switching back to third window");
	    ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs3.get(0));
	    driver.switchTo().window(tabs3.get(1));
	    driver.switchTo().window(tabs3.get(2));
	}	
	
	public static void switchToOriginalWindow() {
		System.out.println("Switching back to original window");
		//String winHandleBefore1 = driver.getWindowHandle();
		//driver.switchTo().window(winHandleBefore1);
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    driver.switchTo().window(tabs2.get(0));
	}
	
	public static void switchToAdobeSignWindow() {
		System.out.println("Switching to Adobe Sign window");
	    ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs4.get(2));
	}
	
	public static void takeScreenshot() throws Exception {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		System.out.println("Taking screenshot...");
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
				File destFile = new File (Constant.filePath);
					FileUtils.copyFile(srcFile, destFile);
					System.out.println("Screenshot saved!");
	}
	
	public void waitForVisibleElement(WebDriver driver, WebElement element) {
		try {
			Thread.sleep(1000);
			System.out.println("Waiting for element visibility of" + element);
			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickEnterViaActions() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.RETURN);
	}
	
	public static String getTextFromFirstContract() {
		WebElement wait1 = new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/app-root/ng-component/residential-main-tabs/main/h2/span[1]")));
		String firstContractText = 
				driver.findElement(By.xpath("//html/body/app-root/ng-component/residential-main-tabs/main/div[2]/div[2]/div/section[2]/agreements-list/table/tbody/tr/td[2]/a/div"))
						.getText();
		return firstContractText;
	}
	
	public void sleepRefreshPage() throws Exception {
		Thread.sleep(7000);
		driver.navigate().refresh();
		Boolean wait = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Processing...')]")));
		driver.navigate().refresh();
		Thread.sleep(7000);
		driver.navigate().refresh();
		Boolean wait1 = new WebDriverWait(driver, 120)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'Processing...')]")));
	}
}
