package com.crm.purchaseorder;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.genericUtilties.BaseClass;
import com.crm.objectRepository.ContactsPageTest;
import com.crm.objectRepository.CreateContactsInfoPageTest;
import com.crm.objectRepository.CreateContactsPageTest;
import com.crm.objectRepository.CreateProductInfoPageTest;
import com.crm.objectRepository.CreateProductsPageTest;
import com.crm.objectRepository.CreatePurchaseOrderInfoPageTest;
import com.crm.objectRepository.CreatePurchaseOrderPageTest;
import com.crm.objectRepository.CreateVendorsInfoPageTest;
import com.crm.objectRepository.CreateVendorsPageTest;
import com.crm.objectRepository.HomePageTest;
import com.crm.objectRepository.ProductPageTest;
import com.crm.objectRepository.PurchaseOrderPageTest;
import com.crm.objectRepository.VendorsPageTest;

public class ToCreateAndVerifyThePurchaseOrderTest extends BaseClass
{
	@Test
	public void toCreateAndVerifyThePurchaseOrderTest() throws Throwable
	{
		//To get the random number
		int randNum = jlib.getRandomNumber();

		//fetch the data from the excel
		String vendorname = elib.getExcelData("Vendor",1, 2)+randNum;

		String productname = elib.getExcelData("Product",1, 2)+randNum;

		String contactdropdown = elib.getExcelData("Contacts",2, 3);

		String contactFirstName = elib.getExcelData("Contacts",2, 4)+randNum;

		String contactLastName = elib.getExcelData("Contacts",2, 5)+randNum;

		String subjectname = elib.getExcelData("PurchaseOrder",1, 2)+randNum;

		String statusDropDown = elib.getExcelData("PurchaseOrder",2, 3);

		String assignedDropDown = elib.getExcelData("PurchaseOrder",3, 4);

		String billaddress = elib.getExcelData("PurchaseOrder",1, 5)+randNum;

		String shippingaddress = elib.getExcelData("PurchaseOrder",1, 6)+randNum;

		String qty = elib.getExcelData("PurchaseOrder",1, 7);

		//create an object of homepagetest
		HomePageTest homepage = new HomePageTest(driver);
		//click on more dropdown
		homepage.morelink();
		//click on vendor 
		homepage.vendorslink();
		//create an object of vendorspagetest
		VendorsPageTest vendors = new VendorsPageTest(driver);
		//click on createvendorLookUpImg
		vendors.createVendorLookUpImg();
		//create an object of createvendorpagetest
		CreateVendorsPageTest vendorpage = new CreateVendorsPageTest(driver);
		//enter the vendorname into the vendorname textfield
		vendorpage.vendorNameTxtEdt(vendorname);
		//click on save button
		vendorpage.saveButton();
		//create an object of createvendorinfopagetest
		CreateVendorsInfoPageTest vendorVerify = new CreateVendorsInfoPageTest(driver);
		WebElement result = vendorVerify.getVendorsHeaderTxt();
		//To Verify the vendor is create or not
		Assert.assertTrue(result.getText().contains(vendorname));
		System.out.println("vendor is created");
		//click on products link
		homepage.productslink();
		//create an object of productpagetest
		ProductPageTest productpage = new ProductPageTest(driver);
		//click on createproductLooKUpImg
		productpage.createProductLookUpImg();
		//create an object of createprodutpagetest
		CreateProductsPageTest createproductpage =  new CreateProductsPageTest(driver);
		//enter the product name into the productname textfield
		createproductpage.productNameTxtEdt(productname);
		//click on save button
		createproductpage.clickOnsaveBtn();
		//create an object of createproductinfopagetest
		CreateProductInfoPageTest productVerify = new CreateProductInfoPageTest(driver);
		WebElement result1= productVerify.getProductHeaderTxt();
		//To verify the product is created or not
		Assert.assertTrue(result1.getText().contains(productname));
		System.out.println("product is created");
		//click on contacts link
		homepage.contactslink();
		//create an object of contactspagetest
		ContactsPageTest contactpage = new ContactsPageTest(driver);
		//click on createContactsLookUpImg
		contactpage.createContactsLookUpPage();
		//create an object of createcontactspagetest
		CreateContactsPageTest createContactPage = new CreateContactsPageTest(driver);
		//select a option from the contactsdropdown
		createContactPage.contactsnamedropdown(contactdropdown);
		//enter the contactfirstname into the contactfirstname textfield
		createContactPage.contactfirstname(contactFirstName);
		//enter the contactlastname into the contactlastaname textfield
		createContactPage.contactlastname(contactLastName);
		//click on save button
		createContactPage.saveButton();
		//create an object of createcontactinfopage
		CreateContactsInfoPageTest contactVerify = new CreateContactsInfoPageTest(driver);
		WebElement result2 = contactVerify.getVerifyContacts();
		//To Verify the contact is created or not
		Assert.assertTrue(result2.getText().contains(contactFirstName));
		System.out.println("contact is created");
		//click on more link
		homepage.morelink();
		//click on purchaseorder link
		homepage.purchaseorderlink();
		//create an object of purchaseorderpagetest
		PurchaseOrderPageTest purchaseOrder = new PurchaseOrderPageTest(driver);
		//click on the createpurchaseorderLookUpImg
		purchaseOrder.clickOnCreatePurchaseOrderLookUpImg();
		//create an object of createpurchaseorderpagetest
		CreatePurchaseOrderPageTest purchaseorder = new CreatePurchaseOrderPageTest(driver);
		//enter the subjectname into the subjectname textfield
		purchaseorder.subjectNameTxtEdt(subjectname);
		//click on createvendornameLookUpImg
		purchaseorder.createvendorNameLookUpImg();
		//switch from parent window to child window
		wlib.switchToWindow(driver, "Vendors&action");
		//maximize the window
		driver.manage().window().maximize();
		//enter the vendorname into the search textfield
		purchaseorder.searchTxtEdt(vendorname);
		//click on the search button
		purchaseorder.searchBtn();
		//click on the first vendor link
		purchaseorder.clickOnVendorLink();
		//switch back to parent window
		wlib.switchToWindow(driver, "PurchaseOrder&action");
		//click on createcontactLookUpImg
		purchaseorder.clickOnContactLookUpImg();
		//switch from parent window to child window
		wlib.switchToWindow(driver, "Contacts&action");
		//maximize the window
		driver.manage().window().maximize();
		//enter the contactfirstname into the search textfield
		purchaseorder.searchTxtEdt(contactFirstName);
		//click on seaech button
		purchaseorder.searchBtn();
		//click on first contact link
		purchaseorder.clickOnContactLink();
		//handle the alert pop up 
		wlib.switchToAlertPopUpAndAccept(driver);
		//switch back to parent window
		wlib.switchToWindow(driver, "PurchaseOrder&action");
		//select a option from status dropdown 
		purchaseorder.statusDropDown(statusDropDown);
		//click on the group radio button
		purchaseorder.groupRadioBtn();
		//select a option from assignedto dropdown
		purchaseorder.assignedToDropDown(assignedDropDown);
		//click on copybillingaddress radio button
		purchaseorder.copyBillingAddressRadioBtn();
		//enter the billstreet into the billstreet textfield
		purchaseorder.billStreetTxtEdt(billaddress);
		//enter the shipstree into the shipstree textfield
		purchaseorder.shipStreetTxtEdt(shippingaddress);
		//click on createproductLookUpImg
		purchaseorder.createProductLookUpImg();
		//switch from parent window to child window
		wlib.switchToWindow(driver, "Products&action");
		//maximize the window
		driver.manage().window().maximize();
		//enter the productname into the search textfield
		purchaseorder.productsearchTxtEdt(productname);
		//click on the search button
		purchaseorder.searchBtn();
		//click on the first product link
		purchaseorder.clickOnProductLink();
		//switch back to parent window
		wlib.switchToWindow(driver, "PurchaseOrder&action");
		//enter the quality into the quality textfield
		purchaseorder.qtyTxtEdt(qty);
		//click on save button
		purchaseorder.saveBtn();
		//create an object of createpurchaseorderinfopagetest
		CreatePurchaseOrderInfoPageTest purchaseOrderVerify =  new CreatePurchaseOrderInfoPageTest(driver);
		WebElement result3 = purchaseOrderVerify.getProductHeaderTxt();
		//To Verify the purchase is created or not
		Assert.assertTrue(result3.getText().contains(subjectname));
		System.out.println("purchase order is created");
	}
}