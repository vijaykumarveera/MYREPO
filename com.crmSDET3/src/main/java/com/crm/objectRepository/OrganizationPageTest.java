package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPageTest
{
	//declaration
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrganizationLockUpPage;

	//intilization
	
	public OrganizationPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	
	public WebElement getCreateOrganizationLockUpPage() 
	{
		return createOrganizationLockUpPage;
	}

	//business library
	
	public void createOrganizationLockUpPage() 
	{
		createOrganizationLockUpPage.click();
	}
}
