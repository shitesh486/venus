package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	@FindBy(xpath = "//div[text()='Add User']")
	private WebElement AddUserBtn;
	
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement FirstNameTxBx;
	
	@FindBy(id = "userDataLightBox_lastNameField")
	private WebElement LastNameTxbx;
	
	@FindBy(id="userDataLightBox_emailField")
	private WebElement EmailTxbx;
	
	@FindBy(id = "userDataLightBox_usernameField")
	private WebElement UsernameTxbx;
	
	@FindBy(id = "userDataLightBox_passwordField")
	private WebElement PasswordTxbx;
	
	@FindBy(id = "userDataLightBox_passwordCopyField")
	private WebElement RePasswordTxbx;
	
	@FindBy(xpath = "//span[text()='Create User']")
	private WebElement finaCreatedUserBtn;
	
	@FindBy(xpath = "//input[@placeholder='Start typing name']")
	private WebElement userNameSearchBox;
	
	@FindBy(className = "highlightToken")
	private WebElement createdUser;
	
	@FindBy(id = "userDataLightBox_titlePlaceholder")
	private WebElement addUserPopup;

	@FindBy(id = "userDataLightBox_deleteBtn")
	private WebElement UserDeleteBtn;
	
	@FindBy(id="noUsersToShowId")
	private WebElement message;
	
	public UserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	public WebElement getAddUserPopup() {
		return addUserPopup;
	}
	public WebElement getAddUserBtn() {
		return AddUserBtn;
	}

	public WebElement getFirstNameTxBx() {
		return FirstNameTxBx;
	}

	public WebElement getLastNameTxbx() {
		return LastNameTxbx;
	}

	public WebElement getEmailTxbx() {
		return EmailTxbx;
	}

	public WebElement getUsernameTxbx() {
		return UsernameTxbx;
	}

	public WebElement getPasswordTxbx() {
		return PasswordTxbx;
	}

	public WebElement getRePasswordTxbx() {
		return RePasswordTxbx;
	}

	public WebElement getFinaCreatedUserBtn() {
		return finaCreatedUserBtn;
	}

	public WebElement getUserDeleteBtn() {
		return UserDeleteBtn;
	}

	public WebElement getUserNameSearchBox() {
		return userNameSearchBox;
	}

	public WebElement getCreatedUser() {
		return createdUser;
	}

	public WebElement getMessage() {
		return message;
	}
	

}
