package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductInfoPageTest 
{
	//declaration
	
	@FindBy(xpath = "//span[@class ='lvtHeaderText']")
	private WebElement productHeaderTxt;

	//initialization
	
	public CreateProductInfoPageTest (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	
	public WebElement getProductHeaderTxt() {
		return productHeaderTxt;
	}
}
