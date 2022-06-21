package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPageTest 
{
	//declaration
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement ognHeaderTxt;

	//intlization
	
	public OrganizationInfoPageTest(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	//utlization
	
	public WebElement getOgnHeaderTxt()
	{
		return ognHeaderTxt;
	}

}
