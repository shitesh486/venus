package hooks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.actitim.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	FileLib f=new FileLib();
	@Before(order = 1)
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.readDataFromPropertyFile("url");
		driver.get(url);
		Reporter.log("openBrowser", true);
	}
	@Before(order = 2)
	public void login() throws IOException {
		LoginPage l=new LoginPage(driver);
		String un = f.readDataFromPropertyFile("un");
		String pwd = f.readDataFromPropertyFile("pwd");
		l.login(un, pwd);
		Reporter.log("login", true);
	}
	@After(order = 2)
	public void logout() {
		HomePage h=new HomePage(driver);
		h.setLogout();
		Reporter.log("logout", true);
	}
	@After(order = 1)
	public void closeBrowser() {
		driver.quit();
		Reporter.log("closeBrowser", true);
	}
}
