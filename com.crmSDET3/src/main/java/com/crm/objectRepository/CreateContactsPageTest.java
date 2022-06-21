package com.crm.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilties.WebDriverUtility;

public class CreateContactsPageTest extends WebDriverUtility
{
	//declaration
	@FindBy(name="salutationtype")
	private WebElement contactsnamedropdown;

	@FindBy(name="firstname")
	private WebElement contactfirstname;

	@FindBy(name = "lastname")
	private WebElement contactlastname;

	@FindBy(xpath = "//table[@class='small']//tr[5]//td[2]//img")
	private WebElement organizationLookUpImg;

	@FindBy(xpath ="//input[@name = 'search_text']")
	private WebElement searchTextEdt;

	@FindBy(className = "dvtCellLabel")
	private WebElement searchnowBtn;

	@FindBy(xpath = "//a[@id='2']")
	private WebElement clickOnOrganizationName;

	@FindBy(id = "jscal_trigger_support_end_date")
	private WebElement clickOnEndDate;

	@FindBy(xpath ="//td[@class='day']/../../tr[3]/td[6]")
	private WebElement selectDateInTheCalendar;

	@FindBy(xpath = "//b[.='Copy Mailing Address']/preceding-sibling::input")
	private WebElement selectCopyMailingAddressRadioBtn;

	@FindBy(name = "description")
	private WebElement descriptiontxtEdt;

	@FindBy(xpath = "//input[@name='imagename']")
	private WebElement clickOnBrowser;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	//initialization
	public CreateContactsPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getContactsnamedropdown() {
		return contactsnamedropdown;
	}

	public WebElement getContactfirstname() {
		return contactfirstname;
	}

	public WebElement getContactlastname() {
		return contactlastname;
	}

	public WebElement getOrganizationLookUpImg() {
		return organizationLookUpImg;
	}

	public WebElement getSearchTextEdt() {
		return searchTextEdt;
	}

	public WebElement getSearchnowBtn() {
		return searchnowBtn;
	}

	public WebElement getClickOnOrganizationName() {
		return clickOnOrganizationName;
	}

	public WebElement getClickOnEndDate() {
		return clickOnEndDate;
	}

	public WebElement getSelectDateInTheCalendar() {
		return selectDateInTheCalendar;
	}

	public WebElement getSelectCopyMailingAddressRadioBtn() {
		return selectCopyMailingAddressRadioBtn;
	}

	public WebElement getDescriptiontxtEdt() {
		return descriptiontxtEdt;
	}

	public WebElement getClickOnBrowser() {
		return clickOnBrowser;
	}
	
	//business library
	public void contactsnamedropdown(String contactdropdown)
	{
		selectDropDown(contactsnamedropdown, contactdropdown);
	}
	public void contactfirstname(String contactFirstName)
	{
		contactfirstname.sendKeys(contactFirstName);
	}
	public void contactlastname(String contactLastName)
	{
		contactlastname.sendKeys(contactLastName);
	}
	public void organizationLookUpImg()
	{
		organizationLookUpImg.click();
	}
	public void switchToChildBrowserPopUp(WebDriver driver,String parentWindow)
	{
		switchToWindow(driver,parentWindow);
	}
	public void searchTextEdt(String organizationName)
	{
		searchTextEdt.sendKeys(organizationName);
	}
	public void searchnowBtn()
	{
		searchnowBtn.click();
	}
	public void clickOnOrganizationName()
	{
		clickOnOrganizationName.click();
	}
	public void switchtoParentWindow(WebDriver driver,String parentWindow)
	{
		driver.switchTo().window(parentWindow);
	}
	public void clickOnEndDate()
	{
		clickOnEndDate.click();
	}
	public void selectDateInTheCalendar() 
	{
		selectDateInTheCalendar.click();	
	}
	public void selectCopyMailingAddressRadioBtn()
	{
		selectCopyMailingAddressRadioBtn.click();
	}
	public void descriptiontxtEdt(String descriptionName)
	{
		descriptiontxtEdt.sendKeys(descriptionName);
	}
	public void clickOnBrowser()
	{
		toHandleFileUploadPopUp(clickOnBrowser);
	}
	
	public void  saveButton() 
	{
		saveButton.click();	
	}
}
