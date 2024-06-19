package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ActitimeLogin {
	WebDriver driver;
	@Given("User should search for {string} in browser")
	public void user_should_search_for_in_browser(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	}	@When("User should enter {string} as username and {string} as password")
	public void user_should_enter_as_username_and_as_password(String un, String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}	@And("He clicks on login button")
	public void he_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println(driver.getTitle());
	}
}
