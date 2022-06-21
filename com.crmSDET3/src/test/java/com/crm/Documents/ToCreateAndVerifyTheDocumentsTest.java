package com.crm.Documents;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtilties.BaseClass;
import com.crm.objectRepository.CreateDocumentsInfoPageTest;
import com.crm.objectRepository.CreateDocumentsPageTest;
import com.crm.objectRepository.DocumentsPageTest;
import com.crm.objectRepository.HomePageTest;
//@Listeners(com.crm.genericUtilties.MyListners.class)
public class ToCreateAndVerifyTheDocumentsTest extends BaseClass
{
	@Test()
	public void toCreateAndVerifyTheDocumentsTest() throws Throwable
	{ 

		//To get the random number
		int randNum = jlib.getRandomNumber();

		//fetch the data from the Excel
		String titlename = elib.getExcelData("Documents",1 ,2 )+randNum;

		String assignedtodropdown = elib.getExcelData("Documents",1 ,3 );

	
		HomePageTest homepge = new HomePageTest(driver);
		//click on documents link
		homepge.documentslink();
		//create an object of documentpagetest
		DocumentsPageTest documentspage = new DocumentsPageTest(driver);
		//click on createdocumentsLookUpImg
		documentspage.createDocumentsLookUpImg();
		//create an object of createdocumentspagetest
		CreateDocumentsPageTest createdocumentspage =  new CreateDocumentsPageTest(driver);
		//enter the title into title textfield
		createdocumentspage.titleTxtEdt(titlename);
		//click on the group radio button
		createdocumentspage.groupRadioBtn();
		//select a option from assignedto dropdown
		createdocumentspage.assignedToDropDown(assignedtodropdown);
		//click on save button
		createdocumentspage.saveButton();
		//create an object of createdocumentsinfopagetest
		CreateDocumentsInfoPageTest documentsVerify = new CreateDocumentsInfoPageTest(driver);
		WebElement result = documentsVerify.getDocumentsHeaderTxt();
		//To Verify the documents is created or not
		Assert.assertTrue(result.getText().contains(titlename));
		System.out.println("documents is created");
	}
}
