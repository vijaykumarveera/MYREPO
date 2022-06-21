package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilties.WebDriverUtility;

public class CreateOrganizationPageTest extends WebDriverUtility
{
	//declaration
	
	@FindBy(name = "accountname")
	private WebElement organizationNametxtedt;

	@FindBy(name="industry")
	private WebElement industryDropDown;

	@FindBy(name = "accounttype")
	private WebElement typeDropDown;

	@FindBy(name = "rating")
	private WebElement ratingDropDown;

	@FindBy(xpath ="//input[@value ='T']")
	private WebElement groupRadioButton;

	@FindBy(name = "assigned_group_id")
	private WebElement dropDownTeam;

	@FindBy(xpath = "//textarea[@name ='bill_street']")
	private  WebElement billingAddressTxtAreaEdt;

	@FindBy(id = "bill_city")
	private WebElement billCityTxtEdt;

	@FindBy(id = "bill_state")
	private WebElement billStateTxtEdt;

	@FindBy(id = "bill_country")
	private WebElement billCountryTxtEdt;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement descriptionTxtAreaEdt;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	//intlization
	
	public CreateOrganizationPageTest(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
	
	//utilization
	
	public WebElement getOrganizationNametxtedt() {
		return organizationNametxtedt;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getTypeDropDown() {
		return typeDropDown;
	}

	public WebElement getRatingDropDown() {
		return ratingDropDown;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}

	public WebElement getDropDownTeam() {
		return dropDownTeam;
	}

	public WebElement getBillingAddressTxtAreaEdt() {
		return billingAddressTxtAreaEdt;
	}

	public WebElement getBillCityTxtEdt() {
		return billCityTxtEdt;
	}

	public WebElement getBillStateTxtEdt() {
		return billStateTxtEdt;
	}

	public WebElement getBillCountryTxtEdt() {
		return billCountryTxtEdt;
	}

	public WebElement getDescriptionTxtAreaEdt() {
		return descriptionTxtAreaEdt;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	//business library
	
	public void organizationNametxtedt(String organizationName)
	{
		organizationNametxtedt.sendKeys(organizationName);
	}
	public void industryDropDown(String industryName)
	{
		selectDropDown(industryDropDown, industryName);
	}
	public void typeDropDown(String typeName)
	{
		selectDropDown(typeDropDown, typeName);
	}
	public void ratingDropDown(String ratingName)
	{
		selectDropDown(ratingDropDown, ratingName);
	}
	public void groupRadioButton()
	{
		groupRadioButton.click();
	}
	public void dropDownTeam(String dropdownName)
	{
		selectDropDownByVtext(dropDownTeam, dropdownName);
	}
	public void billingAddressTxtAreaEdt(String billingAddress)
	{
		billingAddressTxtAreaEdt.sendKeys(billingAddress);
	}
	public void billCityTxtEdt(String billCityName)
	{
		billCityTxtEdt.sendKeys(billCityName);
	}
	public void billStateTxtEdt(String billStateName)
	{
		billStateTxtEdt.sendKeys(billStateName);
	}
	public void billCountryTxtEdt(String billCountryName)
	{
		billCountryTxtEdt.sendKeys(billCountryName);
	}
	public void descriptionTxtAreaEdt(String description)
	{
		descriptionTxtAreaEdt.sendKeys(description);
	}
	public void saveButton()
	{
		saveButton.click();
	}

}
