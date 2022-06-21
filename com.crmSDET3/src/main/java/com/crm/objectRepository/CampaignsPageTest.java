package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPageTest 
{
	//declaration 
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createCampaignsLookUpImg;

	//initialization
	public CampaignsPageTest(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCreateCampaignsLookUpImg() {
		return createCampaignsLookUpImg;
	}

	//business library
	public void createCampaignsLookUpImg()
	{
		createCampaignsLookUpImg.click();
	}
}
