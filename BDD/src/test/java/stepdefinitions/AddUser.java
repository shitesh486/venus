package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.actitime.pom.HomePage;
import com.actitime.pom.UserListPage;

import hooks.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUser{
	WebDriver driver=BaseClass.driver;
	UserListPage v=new UserListPage(driver);
	@Given("User should be present in {string}")
	public void user_should_be_present_in(String expectedUrl) throws InterruptedException {
	Thread.sleep(2000);
	String actualUrl = driver.getCurrentUrl();
	Assert.assertEquals(actualUrl, expectedUrl);
	}

	@When("he clicks on users Tab")
	public void he_clicks_on_users_tab() {
		HomePage h=new HomePage(driver);
		h.setUserTab();
	}

	@Then("{string} should be displayed")
	public void should_be_displayed(String expectedUrl) throws InterruptedException {
		Thread.sleep(2000);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@And("he clicks on add user button")
	public void he_clicks_on_add_user_button() {
		v.getAddUserBtn().click();
	}

	@Then("Add user Popup window should be displayed")
	public void add_user_popup_window_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
		boolean res = v.getAddUserPopup().isDisplayed();
		Assert.assertTrue(res,"Popup is not displayed");
	}

	@And("he enters {string}, {string}, {string} ,{string}, {string}, {string}.")
	public void he_enters(String firstName, String lastname, String email, String Username, String pwd, String retypePwd) throws InterruptedException {
		v.getFirstNameTxBx().sendKeys(firstName);Thread.sleep(2000);
		v.getLastNameTxbx().sendKeys(lastname);Thread.sleep(2000);
		v.getEmailTxbx().sendKeys(email);Thread.sleep(2000);
		v.getUsernameTxbx().sendKeys(Username);Thread.sleep(2000);
		v.getPasswordTxbx().sendKeys(pwd);Thread.sleep(2000);
		v.getRePasswordTxbx().sendKeys(retypePwd);Thread.sleep(2000);
	}
	@And("he clicks on create user button")
	public void he_clicks_on_create_user_button() {
		v.getFinaCreatedUserBtn().click();
	}
	@And("he searches for {string}")
	public void he_searches_for(String firstname) throws InterruptedException {Thread.sleep(2000);
		v.getUserNameSearchBox().sendKeys(firstname);
	}

	@Then("{string} should be created")
	public void should_be_created(String firstName) throws InterruptedException {
		Thread.sleep(2000);
		String actualName = v.getCreatedUser().getText();
		Assert.assertEquals(actualName, firstName);
	}
	@And("he clicks on the created user")
	public void he_clicks_on_the_created_user() throws InterruptedException {
		v.getCreatedUser().click();Thread.sleep(2000);
	}

	@And("click on delete user button")
	public void click_on_delete_user_button() throws InterruptedException {
		v.getUserDeleteBtn().click();Thread.sleep(2000);
	}

	@Then("alert popup should be displayed")
	public void alert_popup_should_be_displayed() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	@And("Accept the popup")
	public void accept_the_popup() throws InterruptedException {
		driver.switchTo().alert().accept();Thread.sleep(2000);
	}
	@And("search for the {string}")
	public void search_for_the(String firstName) throws InterruptedException {
		driver.navigate().refresh();Thread.sleep(2000);
		v.getUserNameSearchBox().sendKeys(firstName);Thread.sleep(2000);
	}
	@Then("There are no users found should be displayed")
	public void there_are_no_users_found_should_be_displayed() {
		boolean res = v.getMessage().isDisplayed();
		SoftAssert s=new SoftAssert();
		s.assertTrue(res, "Message is not displayed");
		String msg = v.getMessage().getText();
		System.out.println(msg);
		s.assertAll();
	}
}
