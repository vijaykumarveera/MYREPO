package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest
{
	//decleartion 
	
	@FindBy(name="user_name")
	private WebElement usernametxtedt;

	@FindBy(name="user_password")
	private WebElement passwordtxtedt;

	@FindBy(id="submitButton")
	private WebElement submitBnt;

	//intilization
	
	public  LoginPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	
	public WebElement getusername()
	{
		return usernametxtedt;
	}
	
	public WebElement getpassword()
	{
		return passwordtxtedt;
	}

	//business library
	
	public void usernametextedt(String username)
	{
		usernametxtedt.sendKeys(username);
	}
	
	public void passwordtxtedt(String password)
	{

		passwordtxtedt.sendKeys(password);
	}
	
	public void submitBnt()
	{
		submitBnt.click();
	}
}
