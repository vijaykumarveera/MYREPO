package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsPageTest 
{
	//declaration
	
	@FindBy(xpath = "//img[@title = 'Create Vendor...']")
	private WebElement createVendorLookUpImg;


	//initialization
	
	public VendorsPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization

	public WebElement getCreateVendorLookUpImg() {
		return createVendorLookUpImg;
	}
	
	//business library
	
	public void createVendorLookUpImg()
	{
		createVendorLookUpImg.click();
	}
}
