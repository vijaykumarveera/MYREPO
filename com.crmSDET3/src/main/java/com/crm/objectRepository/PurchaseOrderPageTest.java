package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPageTest 
{
	//declaration
	
	@FindBy(xpath = "//img[@title='Create Purchase Order...']")
	private WebElement clickOnCreatePurchaseOrderLookUpImg;

	//initialization
	
	public PurchaseOrderPageTest(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization

	public WebElement getClickOnCreatePurchaseOrderLookUpImg() {
		return clickOnCreatePurchaseOrderLookUpImg;
	}

	//business library
	
	public void clickOnCreatePurchaseOrderLookUpImg() 
	{
		clickOnCreatePurchaseOrderLookUpImg.click();
	}

}
