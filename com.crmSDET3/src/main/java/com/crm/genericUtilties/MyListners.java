package com.crm.genericUtilties;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyListners implements ITestListener
{
	ExtentReports report;
	ExtentTest test;
	
	public void onTestStart(ITestResult result)
	{
		test = report.createTest(result.getMethod().getMethodName());
		Reporter.log(result.getName()+"method is started",true);
	}
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
		Reporter.log(result.getName()+"method is passed",true);
	}
	public void onTestFailure(ITestResult result)
	{
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		try
		{
			String screenShotName = WebDriverUtility.takeScreenShot(BaseClass.sDriver, result.getMethod().getMethodName());
			
		}
		catch(Throwable e )
		{
			e.printStackTrace();
		}
		/*String testname = result.getMethod().getMethodName();
		Reporter.log("=======Executing=======",true);
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sDriver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(src, new File("./screenshots/"+testname+".png"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
	}
	public void onTestSkipped(ITestResult result)
	{
		test.log(Status.SKIP,result.getMethod().getMethodName());
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log(result.getName()+"method is skipped",true);
	}
	public void onStart(ITestContext context)
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./extent report/report.html");
		
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("framework extent report");
		spark.config().setDocumentTitle("vijay kumar document ");
		
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("createdBy", "vijay kumar");
		report.setSystemInfo("ReviewedBy", "tejas");
		report.setSystemInfo("Platform", "windows10");
		report.setSystemInfo("SeverName", "ApacheTomCat");
		

		Reporter.log(context.getName()+"test is started");
	}
	public void onFinish(ITestContext context)
	{
		report.flush();
		Reporter.log(context.getName()+"test is finished",true);
	}



}
