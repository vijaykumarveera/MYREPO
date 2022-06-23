package com.crm.Campaigns;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtilties.BaseClass;
import com.crm.objectRepository.CampaignsPageTest;
import com.crm.objectRepository.CreateCampaignsInfoPageTest;
import com.crm.objectRepository.CreateCampaignsPageTest;
import com.crm.objectRepository.CreateProductInfoPageTest;
import com.crm.objectRepository.CreateProductsPageTest;
import com.crm.objectRepository.HomePageTest;
import com.crm.objectRepository.ProductPageTest;

//@Listeners(com.crm.genericUtilties.MyListners.class)
public class ToCreateAndVerifyTheCampaignsTest extends BaseClass
{
	
	@Test
	public void toCreateAndVerifyTheCampaignsTest() throws Throwable
	{

		//To get the random number

		int randNum = jlib.getRandomNumber();

		//fetch the data from the excel

		String productname = elib.getExcelData("Product",1, 2)+randNum;

		String productcategory = elib.getExcelData("Product",2, 3);

		String productmanufacturer = elib.getExcelData("Product",3, 4);

		String description = elib.getExcelData("Product",1, 5);

		String campaginsname = elib.getExcelData("Campaigns",1, 2);

		String assignedTo = elib.getExcelData("Campaigns",3, 3);

		String campaignsstatus = elib.getExcelData("Campaigns",3, 4);

		//lanch the browser 

		//create an object of homepagetest
		HomePageTest homepage = new HomePageTest(driver);
		//click on the product link
		homepage.productslink();
		//create an object of productpagetest
		ProductPageTest product = new ProductPageTest(driver);
		//click on the createProductLookUpimg
		product.createProductLookUpImg();
		//create an object of createproductpagetest
		CreateProductsPageTest  createproductpage = new CreateProductsPageTest(driver);
		//enter the productname into the producttextfield
		createproductpage.productNameTxtEdt(productname);
		//select the option of the category dropdown
		createproductpage.productCategoryDropDown(productcategory);
		//select the option of the manufacture dropdown
		createproductpage.manufacturerDropDown(productmanufacturer);
		//click on group radio button
		createproductpage.assignTypeRadioButton();
		//handling of the file upload popup, click on the browser button and upload a file 
		createproductpage.clickOnBrowserBtn();
		//enter the description into the descriptiontextareafield
		createproductpage.descriptionTxtAreaEdt(description);
		//click on save button 
		createproductpage.clickOnsaveBtn();
		//create an object of createproductinfopagetest
		CreateProductInfoPageTest product1 = new CreateProductInfoPageTest(driver);
		WebElement verifyproduct = product1.getProductHeaderTxt();
		//To verify the product is created or not
		Assert.assertTrue(verifyproduct.getText().contains(productname));
		System.out.println("product is created");
		//click on the morelink 
		homepage.morelink();
		//click on campaigns link 
		homepage.campaignslink();
		//create an object of campaignspagetest
		CampaignsPageTest capaignspage = new CampaignsPageTest(driver);
		//click on the createcampaignsLookUpImg
		capaignspage.createCampaignsLookUpImg();
		//create an object of createcampaignspagetest
		CreateCampaignsPageTest campaignsPage = new CreateCampaignsPageTest(driver);
		//enter the campaign into the camapaignstextfield
		campaignsPage.campaignNameTxtEdt(campaginsname);
		//click on the group radio button
		campaignsPage.groupRadioBtn();
		//select a option from the assignedto dropdown
		campaignsPage.assignedToDropDown(assignedTo);
		//select a option from the status drowdown
		campaignsPage.campaignStatusDropDown(campaignsstatus);
		//click on the createProductLookUpImg
		campaignsPage.createProductLookUpImg();
		//Switch from parentwindow to childwindow
		wlib.switchToWindow(driver, "Products&action");
		//maximize the window
		driver.manage().window().maximize();
		//enter the productname into the searchtextfield
		campaignsPage.searchTxtEdt(productname);
		//click on the search button 
		campaignsPage.searchBtn();
		//click on the first product link 
		campaignsPage.clickOnfirstProductLink();
		//switch back to the parent window
		wlib.switchToWindow(driver, "Campaigns&action");
		//click on the save button
		campaignsPage.saveBtn();
		//create an object of createcampaignsinfopagetest
		CreateCampaignsInfoPageTest campaignsVerify = new CreateCampaignsInfoPageTest(driver);
		WebElement result = campaignsVerify.getCampaignsHeaderTxt();
		//To verify the campagins is create or not
		Assert.assertTrue(result.getText().contains(campaginsname));
		System.out.println("campagins is created and true");
		

	}

}
