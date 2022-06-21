package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPageTest 
{
	//declaration
	@FindBy(xpath="//img[@title ='Create Contact...']")
	private WebElement createContactsLookUpPage;

	//initialization
	public ContactsPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCreateContactsLookUpPage() 
	{
		return createContactsLookUpPage;
	}

	//business library
	public void createContactsLookUpPage()
	{
		createContactsLookUpPage.click();
	}
}

