package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilties.WebDriverUtility;

public class CreatePurchaseOrderPageTest extends WebDriverUtility
{
	//declaration
	
	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subjectNameTxtEdt;

	@FindBy(xpath = "//table[@class='small']//tr[4]//td[2]//img[1]")
	private WebElement createvendorNameLookUpImg;

	@FindBy(id = "search_txt")
	private WebElement searchTxtEdt;

	@FindBy(xpath = "//input[@class='crmbutton small create']")
	private WebElement searchBtn;

	@FindBy(id = "2")
	private WebElement clickOnVendorLink;
	
	@FindBy(xpath = "//table[@class='small']//tr[5]//td[4]//img[1]")
	private WebElement clickOnContactLookUpImg;
	
	@FindBy(id = "search_txt")
	private WebElement contactsearchTxtEdt;

	@FindBy(xpath = "//input[@class='crmbutton small create']")
	private WebElement contactsearchBtn;
	
	@FindBy(xpath = "//a[.='vijay855 kumar855']")
	private WebElement clickOnContactLink;

	@FindBy(xpath = "//select[@name='postatus']")
	private WebElement statusDropDown;

	@FindBy(xpath = "//input[@value='T']")
	private WebElement groupRadioBtn;

	@FindBy(xpath = "//select[@name='assigned_group_id']")
	private WebElement assignedToDropDown;

	@FindBy(xpath = "//b[.='Copy Billing address']")
	private WebElement copyBillingAddressRadioBtn;

	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billStreetTxtEdt;

	@FindBy(xpath = "//textarea[@name='ship_street']")
	private WebElement shipStreetTxtEdt;
	
	@FindBy(id = "searchIcon1")
	private WebElement createProductLookUpImg;
	
	@FindBy(id = "search_txt")
	private WebElement productsearchTxtEdt;

	@FindBy(xpath = "//input[@class='crmbutton small create']")
	private WebElement productsearchBtn;
	
	@FindBy(id = "popup_product_116")
	private WebElement clickOnProductLink;
	
	@FindBy(xpath = "//input[@id='qty1'] ")
	private WebElement qtyTxtEdt;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]'] ")
	private WebElement saveBtn;
	
	//initialization
	
	public CreatePurchaseOrderPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//utilization
	
	public WebElement getSubjectNameTxtEdt() {
		return subjectNameTxtEdt;
	}

	public WebElement getCreatevendorNameLookUpImg() {
		return createvendorNameLookUpImg;
	}
	
	public WebElement getSearchTxtEdt() {
		return searchTxtEdt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getClickOnVendorLink() {
		return clickOnVendorLink;
	}

	public WebElement getClickOnContactLookUpImg() {
		return clickOnContactLookUpImg;
	}

	public WebElement getContactsearchTxtEdt() {
		return contactsearchTxtEdt;
	}

	public WebElement getContactsearchBtn() {
		return contactsearchBtn;
	}

	public WebElement getClickOnContactLink() {
		return clickOnContactLink;
	}

	public WebElement getStatusDropDown() {
		return statusDropDown;
	}

	public WebElement getGroupRadioBtn() {
		return groupRadioBtn;
	}

	public WebElement getAssignedToDropDown() {
		return assignedToDropDown;
	}

	public WebElement getCopyBillingAddressRadioBtn() {
		return copyBillingAddressRadioBtn;
	}

	public WebElement getBillStreetTxtEdt() {
		return billStreetTxtEdt;
	}

	public WebElement getShipStreetTxtEdt() {
		return shipStreetTxtEdt;
	}

	public WebElement getCreateProductLookUpImg() {
		return createProductLookUpImg;
	}

	public WebElement getProductsearchTxtEdt() {
		return productsearchTxtEdt;
	}

	public WebElement getProductsearchBtn() {
		return productsearchBtn;
	}

	public WebElement getClickOnProductLink() {
		return clickOnProductLink;
	}

	public WebElement getQtyTxtEdt() {
		return qtyTxtEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	//business library

	public void  subjectNameTxtEdt(String subjectName)
	{
		subjectNameTxtEdt.sendKeys(subjectName);
	}
	public void createvendorNameLookUpImg()
	{
		createvendorNameLookUpImg.click();
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
	public void clickOnContactLookUpImg()
	{
		clickOnContactLookUpImg.click();
	}
	public void contactsearchTxtEdt(String contactFirstName)
	{
		contactsearchTxtEdt.sendKeys(contactFirstName);
	}
	public void contactsearchBtn()
	{
		contactsearchBtn.click();
	}
	public void clickOnContactLink()
	{
		clickOnContactLink.click();
	}
	public void statusDropDown(String statusname)
	{
		selectDropDownByVtext(statusDropDown, statusname);
	}
	public void groupRadioBtn()
	{
		groupRadioBtn.click();	
	}
	public void assignedToDropDown(String assignedname)
	{
		selectDropDownByVtext(assignedToDropDown, assignedname);
	}
	public void copyBillingAddressRadioBtn()
	{
		copyBillingAddressRadioBtn.click();
	}
	public void billStreetTxtEdt(String billstreetaddress)
	{
		billStreetTxtEdt.sendKeys(billstreetaddress);
	}
	public void shipStreetTxtEdt(String shipstreetaddress)
	{
		shipStreetTxtEdt.sendKeys(shipstreetaddress);
	}
	public void createProductLookUpImg()
	{
		createProductLookUpImg.click();
	}
	public void productsearchTxtEdt(String productName)
	{
		productsearchTxtEdt.sendKeys(productName);
	}
	public void productsearchBtn() 
	{
		productsearchBtn.click();	
	}
	public void clickOnProductLink()
	{
		clickOnProductLink.click();
	}
	public void qtyTxtEdt(String quality)
	{
		qtyTxtEdt.sendKeys(quality);
	}
	public void saveBtn()
	{
		saveBtn.click();
	}
}
