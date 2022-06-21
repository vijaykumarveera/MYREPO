package com.crm.Contacts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.genericUtilties.BaseClass;
import com.crm.objectRepository.ContactsPageTest;
import com.crm.objectRepository.CreateContactsInfoPageTest;
import com.crm.objectRepository.CreateContactsPageTest;
import com.crm.objectRepository.HomePageTest;

public class ToCreateAndVerifyContactsTest extends BaseClass
{
	@Test
	public void toCreateAndVerifyContactsTest() throws Throwable
	{
		//get the random number 
		int randNum = jlib.getRandomNumber();

		//fetch the data from the excel file
		String contactdropdown = elib.getExcelData("Contacts", 2, 3);

		String contactfirstName = elib.getExcelData("Contacts", 2, 4)+randNum;

		String contactlastName = elib.getExcelData("Contacts", 2, 5)+randNum;

		String organizationName = elib.getExcelData("Contacts", 2, 6);

		String description = elib.getExcelData("Contacts", 2, 7);

		//create an object of the homepagetest
		HomePageTest homepage = new HomePageTest(driver);
		//click on the contacts link 
		homepage.contactslink();
		//create an object of contactpagetest
		ContactsPageTest contactspage = new ContactsPageTest(driver);
		//click on the createContactsLookUpImge
		contactspage.createContactsLookUpPage();
		//create an object of createcontactpagetest
		CreateContactsPageTest createcontacts = new CreateContactsPageTest(driver);
		//select an option from the contactdropdown
		createcontacts.contactsnamedropdown(contactdropdown);
		//enter the contactfirstname into the contactfirstnametextfield
		createcontacts.contactfirstname(contactfirstName);
		//enter the contactlastname into the contactlastnametextfield
		createcontacts.contactlastname(contactlastName);
		//click on the createOrganizationLookUpImg
		createcontacts.organizationLookUpImg();
		//swithc from parent window to child window
		createcontacts.switchToChildBrowserPopUp(driver, "Accounts&action");
		//maximize the window
		driver.manage().window().maximize();
		//enter the organizationname into the search textfield
		createcontacts.searchTextEdt(organizationName);
		//click on the search button
		createcontacts.searchnowBtn();
		//click on the first organization name link 
		createcontacts.clickOnOrganizationName();
		//switch back to the parent window
		wlib.switchToWindow(driver, "Contacts&action");
		//click on the enddate icon
		createcontacts.clickOnEndDate();
		//select the date in the calendar table
		createcontacts.selectDateInTheCalendar();
		//click on the copyMailingAddress Radio button
		createcontacts.selectCopyMailingAddressRadioBtn();
		//enter the description into the description textareafield
		createcontacts.descriptiontxtEdt(description);
		//handle the file upload pop up , click on the browser button and upload a file 
		createcontacts.clickOnBrowser();
		//click on the save button
		createcontacts.saveButton();
		//create an object of createcontactsinfopagetest
		CreateContactsInfoPageTest verifyContacts = new CreateContactsInfoPageTest(driver);
		WebElement value = verifyContacts.getVerifyContacts();
		//To verify the conatact created or not 
		Assert.assertTrue(value.getText().contains(contactfirstName));
		System.out.println("contacts is created");
	}
}
