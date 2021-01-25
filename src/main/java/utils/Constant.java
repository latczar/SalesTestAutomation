package utils;

import java.util.Collection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Constant {
			
		public static final String ProjectPath = System.getProperty("user.dir");	
		public static final String DriversPath = ProjectPath + "\\src\\main\\java\\drivers\\";
		public static final String TestDataFilePath = ProjectPath + "\\src\\main\\java\\testData\\";
		public static final String DownloadPath = System.getProperty("user.home") + "\\Downloads\\";
		public static final String qaPartnerPortalUser = "tpsqa.test@tpsgabisolar.com.qa";
		public static final String qaPartnerPortalPass = "Solar12347";
		public static final String UATPartnerPortalUser = "bad.pritt@gabisolar.com.uat";
		public static final String UATPartnerPortalPass = "DgQEhz2J6Q";
		public static final String GmailApp = "http://mail.google.com";
		public static final String GmailInbox = "https://mail.google.com/mail/u/0/#inbox";
		public static final String StackOverflowApp = "https://stackoverflow.com/";
		public static final String UsernameGmailApp = "joeydeleeon";
		public static final String PasswordGmailApp = "magandaako123";
		public static final String PartnerUsernameGmailApp = "qatestingspwr@gmail.com";
		public static final String PartnerPasswordGmailApp = "Solar123";
		public static String agreementName = "";
		public static String filePath = "target/screenshots/testScreenshot.png";

		public static boolean isEndStepReached = false;
		public static final int defaultBrowserTimeOut = 60;
		public static boolean DefaultoptionalFlag = true;
		public static String ScreenshotFolderName = null;
		public static String locator = null;
		public static String RecentScreenshot = null;
		public static String PageName = null;
		public static WebDriver driver = null;
		public static String prodSpwrSDS = "https://us.sunpower.com/";
		public static String qaPartnerPortal = "https://qa-sunpower1.cs196.force.com/CommunityLogin";
		public static String UATPartnerPortal = "https://uat-sunpower1.cs196.force.com/CommunityLogin";

		}