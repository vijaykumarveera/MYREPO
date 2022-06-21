package com.crm.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilties.WebDriverUtility;

public class HomePageTest extends WebDriverUtility 
{
	WebDriver driver;
	
	//declearation
	
	@FindBy(linkText = "Contacts")
	private WebElement contactslink;

	@FindBy(linkText = "Organizations")
	private WebElement organizationslink;

	@FindBy(linkText = "Products")
	private WebElement productslink;

	@FindBy(linkText = "Documents")
	private WebElement documentslink;

	@FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement morelink;
	
	@FindBy(xpath = "//a[.='Purchase Order']")
	private WebElement purchaseorderlink;
	
	@FindBy(xpath = " //a[.='Campaigns']")  
	private WebElement campaignslink;
	
	@FindBy(xpath = "//a[. ='Vendors']")
	private WebElement vendorslink;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administratorlink;

	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;

	//intilization
	
	public HomePageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utlization 

	public WebElement getContactslink() {
		return contactslink;
	}

	public WebElement getOrganizationslink() {
		return organizationslink;
	}

	public WebElement getProductslink() {
		return productslink;
	}

	public WebElement getDocumentslink() {
		return documentslink;
	}

	public WebElement getMorelink() {
		return morelink;
	}
	
	public WebElement getPurchaseorderlink() {
		return purchaseorderlink;
	}

	public WebElement getAdministratorlink() {
		return Administratorlink;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
	
	//business library
	
	public void contactslink()
	{
		contactslink.click();

	}
	public void organizationslink()
	{
		organizationslink.click();
	}
	public void productslink()
	{
		productslink.click();
	}
	public void documentslink()
	{
		documentslink.click();
	}
	public void morelink() 
	{
		morelink.click();
	}
	public void campaignslink() 
	{
		campaignslink.click();	
	}
	public void purchaseorderlink()
	{
		purchaseorderlink.click();
	}
	public void vendorslink() 
	{
		vendorslink.click();
	}
	public void Administratorlink(WebDriver driver) 
	{
		mouseOverAnElement(driver, Administratorlink);
	}
	public void signoutlink() 
	{
		signoutlink.click();	
	}

}
