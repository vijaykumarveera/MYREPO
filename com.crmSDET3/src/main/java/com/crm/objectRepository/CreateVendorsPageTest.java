package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVendorsPageTest 
{
	//declaration
	
	@FindBy(name = "vendorname")
	private WebElement vendorNameTxtEdt;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	//initialization
	
	public CreateVendorsPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getVendorNameTxtEdt() {
		return vendorNameTxtEdt;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//business library
	
	public void vendorNameTxtEdt(String vendorname)
	{
		vendorNameTxtEdt.sendKeys(vendorname);
	}
	
	public void saveButton()
	{
		saveButton.click();
	}
}
