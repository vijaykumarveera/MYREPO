package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilties.WebDriverUtility;

public class CreateProductsPageTest extends WebDriverUtility
{
	//declaration
	
	@FindBy(name = "productname")
	private WebElement productNameTxtEdt;
	
	@FindBy(xpath = "//select[@name='productcategory']")
	private WebElement productCategoryDropDown;  
	
	@FindBy(xpath = " //img[@src='themes/softed/images/select.gif']")
	private WebElement createVendorLookUpImg;
	
	@FindBy(id = "search_txt")
	private WebElement searchTxtEdt;

	@FindBy(xpath = "//input[@class='crmbutton small create']")
	private WebElement searchBtn;

	@FindBy(id = "2")
	private WebElement clickOnVendorLink;
	
	@FindBy(xpath = "//select[@name='manufacturer']")
	private WebElement manufacturerDropDown;

	@FindBy(xpath = "//select[@name='usageunit']")
	private WebElement usageunitDropDown;
	
	@FindBy(xpath = "//input[@name='assigntype' and @value='T']")
	private WebElement assignTypeRadioButton;
	
	@FindBy(id = "my_file_element")
	private WebElement clickOnBrowserBtn;
	
	@FindBy(xpath = " //textarea[@name='description']")
	private WebElement descriptionTxtAreaEdt;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;

	//initialization
	
	public CreateProductsPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getProductNameTxtEdt() {
		return productNameTxtEdt;
	}

	public WebElement getProductCategoryDropDown() {
		return productCategoryDropDown;
	}

	public WebElement getManufacturerDropDown() {
		return manufacturerDropDown;
	}
	
	public WebElement getUsageunitDropDown() {
		return usageunitDropDown;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//business library

	public void productNameTxtEdt(String productName)
	{
		productNameTxtEdt.sendKeys(productName);
	}
	public void productCategoryDropDown(String productcategory)
	{
		selectDropDown(productCategoryDropDown, productcategory);
	}
	public void createVendorLookUpImg()
	{
		createVendorLookUpImg.click();
	}
	public void searchTxtEdt(String vendorname)
	{
		searchTxtEdt.sendKeys(vendorname);
	}
	public void searchBtn()
	{
		searchBtn.click();
	}
	
	public void clickOnVendorLink()
	{
		clickOnVendorLink.click();
	}
	
	public void manufacturerDropDown(String manufacturer)
	{
		selectDropDown(manufacturerDropDown, manufacturer);
	}
	public void usageunitDropDown(String usageunitdropDownName)
	{
		selectDropDownByVtext(usageunitDropDown, usageunitdropDownName);
	}
	public void assignTypeRadioButton()
	{
		assignTypeRadioButton.click();
	}
	public void clickOnBrowserBtn()
	{
		toHandleFileUploadPopUp(clickOnBrowserBtn);
	}
	public void descriptionTxtAreaEdt(String description)
	{
		descriptionTxtAreaEdt.sendKeys(description);
	}
	public void clickOnsaveBtn()
	{
		saveBtn.click();
	}
}
