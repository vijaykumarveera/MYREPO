package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateDocumentsInfoPageTest 
{
	//declaration
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement documentsHeaderTxt;

	//initialization
	
	public CreateDocumentsInfoPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	
	public WebElement getDocumentsHeaderTxt() {
		return documentsHeaderTxt;
	}

}
