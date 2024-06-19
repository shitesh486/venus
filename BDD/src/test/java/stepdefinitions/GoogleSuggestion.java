package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSuggestion {
	WebDriver driver;
	@Given("User should be present in google webpage")
	public void user_should_be_present_in_google_webpage() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}@When("He searchs for selenium")
	public void he_searchs_for_selenium() {
		driver.findElement(By.name("q")).sendKeys("Selenium"+Keys.ENTER);
	}@Then("Selenium search page should be displayed")
	public void selenium_search_page_should_be_displayed() {
		System.out.println(driver.getTitle());
	}

}
