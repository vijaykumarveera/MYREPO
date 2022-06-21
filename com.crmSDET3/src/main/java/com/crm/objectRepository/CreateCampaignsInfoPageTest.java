package com.crm.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignsInfoPageTest 
{
	//declaration
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement campaignsHeaderTxt;

	//initialization
	public CreateCampaignsInfoPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCampaignsHeaderTxt() {
		return campaignsHeaderTxt;
	}
}
