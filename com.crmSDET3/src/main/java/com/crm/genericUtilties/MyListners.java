package com.crm.genericUtilties;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListners implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		Reporter.log(result.getName()+"method is started",true);
	}
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log(result.getName()+"method is passed",true);
	}
	public void onTestFailure(ITestResult result)
	{
		String testname = result.getMethod().getMethodName();
		Reporter.log("=======Executing=======",true);
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sDriver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(src, new File("./screenshots/"+testname+".png"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log(result.getName()+"method is skipped",true);
	}
	public void onStart(ITestContext context)
	{
		Reporter.log(context.getName()+"test is started");
	}
	public void onFinish(ITestContext context)
	{
		Reporter.log(context.getName()+"test is finished",true);
	}



}
