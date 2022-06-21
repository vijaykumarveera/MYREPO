package com.crm.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.genericUtilties.WebDriverUtility;

public class CreateDocumentsPageTest extends WebDriverUtility
{

	@FindBy(xpath = "//input[@name='notes_title']")
	private WebElement titleTxtEdt;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement groupRadioBtn;
	
	@FindBy(xpath = "//Select[@name='assigned_group_id']")
	private WebElement assignedToDropDown;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	
	public CreateDocumentsPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void titleTxtEdt(String titlename)
	{
		titleTxtEdt.sendKeys(titlename);
	}
	
	public void groupRadioBtn()
	{
		groupRadioBtn.click();
	}
	
	public void assignedToDropDown(String assignedToDropDown1)
	{
		selectDropDownByVtext(assignedToDropDown, assignedToDropDown1);
	}
	
	public void saveButton()
	{
		saveButton.click();
	}
	
	
	
	
}
