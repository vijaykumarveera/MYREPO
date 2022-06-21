package com.crm.Product;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.genericUtilties.BaseClass;
import com.crm.objectRepository.CreateProductInfoPageTest;
import com.crm.objectRepository.CreateProductsPageTest;
import com.crm.objectRepository.HomePageTest;
import com.crm.objectRepository.ProductPageTest;

public class ToCreateAndVerifyTheProductTest extends BaseClass
{
	@Test
	public void toCreateAndVerifyTheProductTest() throws Throwable
	{
		//To get the random number
		int randNum = jlib.getRandomNumber();

		//fetch the data from the Excel
		String productName = elib.getExcelData("Product",1 ,2 )+randNum;

		//click on the product link
		HomePageTest homepge = new HomePageTest(driver);
		homepge.productslink();
		//click create product icon
		ProductPageTest product = new ProductPageTest(driver);
		product.createProductLookUpImg();
		//enter the product name
		CreateProductsPageTest productpage = new CreateProductsPageTest(driver);
		productpage.productNameTxtEdt(productName);
		//click on the save button
		productpage.clickOnsaveBtn();
		//To verify the product is created or not
		CreateProductInfoPageTest product1 = new CreateProductInfoPageTest(driver);
		WebElement result = product1.getProductHeaderTxt();
		Assert.assertTrue(result.getText().contains(productName));
		System.out.println("product is creeated");
	}
}