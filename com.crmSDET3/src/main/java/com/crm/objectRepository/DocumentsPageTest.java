package com.crm.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentsPageTest 
{
	//declaration
	
	@FindBy(xpath = "//img[@title='Create Document...']")
	private WebElement createDocumentsLookUpImg;

	//initialization
	
	public DocumentsPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization

	public WebElement getCreateDocumentsLookUpImg() {
		return createDocumentsLookUpImg;
	}
	
	//business library

	public void createDocumentsLookUpImg()
	{
		createDocumentsLookUpImg.click();
	}

}
