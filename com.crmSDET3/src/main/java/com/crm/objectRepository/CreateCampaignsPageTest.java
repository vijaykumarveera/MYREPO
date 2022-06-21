package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilties.WebDriverUtility;

public class CreateCampaignsPageTest extends WebDriverUtility
{
	//declaration
	@FindBy(xpath = "//input[@name='campaignname']")
	private WebElement campaignNameTxtEdt;

	@FindBy(xpath = " //input[@value='T']") 
	private WebElement groupRadioBtn;

	@FindBy(xpath = " //select[@name='assigned_group_id']")
	private WebElement assignedToDropDown;

	@FindBy(xpath = "//select[@name='campaignstatus']")
	private WebElement campaignStatusDropDown;

	@FindBy(xpath = "//img[@title='Select'] ")
	private WebElement createProductLookUpImg;

	@FindBy(id = "search_txt")
	private WebElement searchTxtEdt;

	@FindBy(xpath = "//input[@class='crmbutton small create']")
	private WebElement searchBtn;

	@FindBy(id = "1")
	private WebElement clickOnfirstProductLink;

	@FindBy(xpath = "//input[@class='crmbutton small save'] ")
	private WebElement saveBtn;


	//initialization
	public CreateCampaignsPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getCampaignNameTxtEdt() {
		return campaignNameTxtEdt;
	}

	public WebElement getGroupRadioBtn() {
		return groupRadioBtn;
	}

	public WebElement getAssignedToDropDown() {
		return assignedToDropDown;
	}

	public WebElement getCampaignStatusDropDown() {
		return campaignStatusDropDown;
	}

	public WebElement getCreateProductLookUpImg() {
		return createProductLookUpImg;
	}

	public WebElement getSearchTxtEdt() {
		return searchTxtEdt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getClickOnfirstProductLink() {
		return clickOnfirstProductLink;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//business library
	public void campaignNameTxtEdt(String campaignName)
	{
		campaignNameTxtEdt.sendKeys(campaignName);
	}
	public void groupRadioBtn()
	{
		groupRadioBtn.click();
	}
	public void assignedToDropDown(String assignedTo)
	{
		selectDropDownByVtext(assignedToDropDown, assignedTo);
	}
	public void campaignStatusDropDown(String campaignStatus)
	{
		selectDropDownByVtext(campaignStatusDropDown, campaignStatus);
	}
	public void createProductLookUpImg()
	{
		createProductLookUpImg.click();
	}
	public void searchTxtEdt(String productName)
	{
		searchTxtEdt.sendKeys(productName);
	}
	public void searchBtn()
	{
		searchBtn.click();
	}
	public void clickOnfirstProductLink()
	{
		clickOnfirstProductLink.click();
	}
	public void saveBtn()
	{
		saveBtn.click();
	}
}

