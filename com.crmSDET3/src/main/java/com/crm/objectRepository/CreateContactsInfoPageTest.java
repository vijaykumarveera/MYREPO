package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactsInfoPageTest 
{
	//declaration
	@FindBy(xpath = "//span[@class = 'dvHeaderText']")
	private WebElement verifyContacts;

	//initialization
	public CreateContactsInfoPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getVerifyContacts() {
		return verifyContacts;
	}

}
