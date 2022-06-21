package com.crm.Product;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.genericUtilties.BaseClass;
import com.crm.objectRepository.CreateProductInfoPageTest;
import com.crm.objectRepository.CreateProductsPageTest;
import com.crm.objectRepository.HomePageTest;
import com.crm.objectRepository.ProductPageTest;

public class ToCreateAndVerifyProductTest extends BaseClass
{
@Test
public void toCreateAndVerifyProductTest() throws Throwable
	{
		//To get the random number
		int randNum = jlib.getRandomNumber();

		//fetch the data from the Excel
		String productName = elib.getExcelData("Product",1 ,2 )+randNum;
		
		String productcategory = elib.getExcelData("Product",2, 3);

		String productmanufacturer = elib.getExcelData("Product",3, 4);

		String description = elib.getExcelData("Product",1, 5);

		//click on the product link
		HomePageTest homepge = new HomePageTest(driver);
		homepge.productslink();
		//click create product icon
		ProductPageTest product = new ProductPageTest(driver);
		product.createProductLookUpImg();
		//enter the product name
		CreateProductsPageTest productpage = new CreateProductsPageTest(driver);
		productpage.productNameTxtEdt(productName);
		CreateProductsPageTest createproductpage = new CreateProductsPageTest(driver);
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
		//To verify the product is created or not
		CreateProductInfoPageTest product1 = new CreateProductInfoPageTest(driver);
		WebElement result = product1.getProductHeaderTxt();
		Assert.assertTrue(result.getText().contains(productName));
		System.out.println("product is created");
	}
}