package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;	

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCusbtn;
	
	@FindBy(id = "customerLightBox_nameField")
	private WebElement customerNameTxtbx;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerDesTxtbx;
	
	@FindBy(id = "ext-gen29")
	private WebElement companyDropdownBtn;
	
	@FindBy(linkText = "Our Company")
	private WebElement OurComOption;
	
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement CreateCustomerbtn;
	
	@FindBy(xpath="//a[text()='All Customers']/../../div[@class='title ellipsis']")
	private WebElement ExpectedName;
	
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement NewPrjctbtn;
	
	@FindBy(id = "projectPopup_projectNameField")
	private WebElement PrjctNameField;
	
	@FindBy(id = "ext-gen49")
	private WebElement PrjctDropdownbtn;
	
	@FindBy(id = "projectPopup_projectDescriptionField")
	private WebElement PrjctDecField;
	
	@FindBy(xpath = "//span[text()='Create Project']")
	private WebElement lastPrjctCreatBtn;
	
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCusbtn() {
		return newCusbtn;
	}

	public WebElement getCustomerNameTxtbx() {
		return customerNameTxtbx;
	}

	public WebElement getCustomerDesTxtbx() {
		return customerDesTxtbx;
	}

	public WebElement getCompanyDropdownBtn() {
		return companyDropdownBtn;
	}

	public WebElement getOurComOption() {
		return OurComOption;
	}

	public WebElement getCreateCustomerbtn() {
		return CreateCustomerbtn;
	}

	public WebElement getExpectedName() {
		return ExpectedName;
	}

	public WebElement getNewPrjctbtn() {
		return NewPrjctbtn;
	}

	public WebElement getPrjctNameField() {
		return PrjctNameField;
	}

	public WebElement getPrjctDropdownbtn() {
		return PrjctDropdownbtn;
	}

	public WebElement getPrjctDecField() {
		return PrjctDecField;
	}

	public WebElement getLastPrjctCreatBtn() {
		return lastPrjctCreatBtn;
	}
	
}
