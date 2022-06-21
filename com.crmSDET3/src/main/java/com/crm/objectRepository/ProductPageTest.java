package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageTest 
{
	//declaration
	
	@FindBy(xpath = "//img[@title = 'Create Product...']")
	private WebElement createProductLookUpImg;
	
	//initialization

	public ProductPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getCreateProductLookUpImg() {
		return createProductLookUpImg;
	}
	
	//business library
	
	public void createProductLookUpImg()
	{
		createProductLookUpImg.click();
	}
}
