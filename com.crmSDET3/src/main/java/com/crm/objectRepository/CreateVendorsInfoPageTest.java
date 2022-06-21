package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVendorsInfoPageTest 
{
	//declaration
	
	@FindBy(xpath = "//span[@class = 'lvtHeaderText']")
	private WebElement vendorsHeaderTxt;

	//initialization
	
	public CreateVendorsInfoPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization

	public WebElement getVendorsHeaderTxt() 
	{
		return vendorsHeaderTxt;
	}
}