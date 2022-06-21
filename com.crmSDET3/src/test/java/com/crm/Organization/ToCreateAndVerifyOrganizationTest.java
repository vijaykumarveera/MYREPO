package com.crm.Organization;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtilties.BaseClass;
import com.crm.objectRepository.CreateOrganizationPageTest;
import com.crm.objectRepository.HomePageTest;
import com.crm.objectRepository.OrganizationInfoPageTest;
import com.crm.objectRepository.OrganizationPageTest;
//@Listeners(com.crm.genericUtilties.MyListners.class)
public class ToCreateAndVerifyOrganizationTest extends BaseClass
{
	@Test
	public void toCreateAndVerifyOrganizationTest() throws Throwable
	{
		//get the random number 
		int randNum = jlib.getRandomNumber();

		//fetch the data from the excel file
		String organizationName = elib.getExcelData("Organizations", 2, 3)+randNum;

		String industryName = elib.getExcelData("Organizations", 12, 4);

		String typeName = elib.getExcelData("Organizations", 9, 5);

		String ratingName = elib.getExcelData("Organizations", 6, 6);

		String dropdownName = elib.getExcelData("Organizations", 4, 7);

		String billAddress = elib.getExcelData("Organizations", 2, 8);

		String billCityName = elib.getExcelData("Organizations", 2, 9);

		String billStateName = elib.getExcelData("Organizations", 2, 10);

		String billCountryName = elib.getExcelData("Organizations", 2, 11);

		String description = elib.getExcelData("Organizations", 2, 12);

		
		//crete an object of homepagetest
		HomePageTest homepage = new HomePageTest(driver);
		//click on the organization link
		homepage.organizationslink();
		//create an object of organizationpagetest
		OrganizationPageTest organization = new OrganizationPageTest(driver);
		//click on the createorgaizationLookUpImg
		organization.createOrganizationLockUpPage();
		//create an object of createoraganizationpagetest
		CreateOrganizationPageTest createOrganization = new CreateOrganizationPageTest(driver);
		//enter the organization name into the organization testfield
		createOrganization.organizationNametxtedt(organizationName);
		//select a option from the industry dropdown 
		createOrganization.industryDropDown(industryName);
		//select a option from the type drowdown
		createOrganization.typeDropDown(typeName);
		//select a option from the rating drowdown
		createOrganization.ratingDropDown(ratingName);
		//click on the group radio button
		createOrganization.groupRadioButton();
		//select a option from the assignedto dropdown
		createOrganization.dropDownTeam(dropdownName);
		//enter the billingAddress into the biillingaddress textareafield
		createOrganization.billingAddressTxtAreaEdt(billAddress);
		//enter the billcity into the billcity textfield
		createOrganization.billCityTxtEdt(billCityName);
		//enter the billstate into the billstate textfield
		createOrganization.billStateTxtEdt(billStateName);
		//enter the biilcountry into the billcountry textfield
		createOrganization.billCountryTxtEdt(billCountryName);
		//enter the description into the description textareafield
		createOrganization.descriptionTxtAreaEdt(description);
		//click on the save button
		createOrganization.saveButton();
		//create an object of organizationinfopagetest
		OrganizationInfoPageTest organizationNameVerify = new OrganizationInfoPageTest(driver);
		WebElement value = organizationNameVerify.getOgnHeaderTxt();
		//To Verify the organization is created or not
		Assert.assertTrue(value.getText().contains(organizationName));
		System.out.println("organization is created");
	}
} 
