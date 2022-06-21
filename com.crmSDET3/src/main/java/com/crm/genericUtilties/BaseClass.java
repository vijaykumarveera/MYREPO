package com.crm.genericUtilties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.objectRepository.HomePageTest;
import com.crm.objectRepository.LoginPageTest;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author vijaykumar v
 *
 */
public class BaseClass 
{
	public static WebDriver sDriver;
	public WebDriver driver;
	public DataBaseUtility dlib = new DataBaseUtility();
	public ExcelUtility elib = new ExcelUtility();
	public FileUtilities flib = new FileUtilities();
	public WebDriverUtility wlib = new WebDriverUtility();
	public JavaUtility jlib = new JavaUtility();
	/**
	 * connecting to database
	 */
	@BeforeSuite(groups = {"smokeTest","fuctionalTest"})
	public void dbConfig()
	{
		dlib.connectionToDB();
	}
	/**
	 * lauching the browser and enter the url, maximize the screen
	 * @throws Throwable
	 */
	//@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest","fuctionalTest",})
	public void lauchTheBrowser() throws Throwable
	{
		//String BROWSER = System.getProperty("browser");
		//String URL = System.getProperty("url");
		String BROWSER = flib.getPropertyKeyValue("browser");
		String URL = flib.getPropertyKeyValue("url");

		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		//sDriver = driver;
		//implicity wait
		wlib.waitForPageToLoad(driver);
		//enter the URL of the Application
		//sDriver.get(URL);
		driver.get(URL);		
		//maximize the screen
		driver.manage().window().maximize();
	}
	/**
	 * login to application
	 * @throws Throwable
	 */
	@BeforeMethod(groups = {"smokeTest","fuctionalTest"})
	public void loginToApplication() throws Throwable
	{
		String USERNAME = flib.getPropertyKeyValue("username");
		String PASSWORD = flib.getPropertyKeyValue("password");

		LoginPageTest loginPage = new LoginPageTest(driver);
		loginPage.usernametextedt(USERNAME);
		loginPage.passwordtxtedt(PASSWORD);
		loginPage.submitBnt();
	}
	/** 
	 * logout from the application
	 */
	@AfterMethod(groups = {"smokeTest","fuctionalTest"})
	public void logoutFromApplication()
	{
		HomePageTest homepage = new HomePageTest(driver);
		homepage.Administratorlink(driver);
		homepage.signoutlink();
	}
	/**
	 * close the browser
	 */
	@AfterClass(groups = {"smokeTest","fuctionalTest"})
	public void closeTheBrowser()
	{
		driver.quit();
	}
	/**
	 * close the DB
	 */
	@AfterSuite(groups = {"smokeTest","fuctionalTest"})
	public void closeDBconfig()
	{
		dlib.closeDB();
	}
}
