package basictest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.UserListPage;

public class UserModule {
	@Test
public void addUser() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://localhost/login.do");
	LoginPage l=new LoginPage(driver);
	l.login("admin", "manager");
	HomePage h=new HomePage(driver);
	h.setUserTab();
	UserListPage v=new UserListPage(driver);
	v.getAddUserBtn().click();
	boolean res = v.getAddUserPopup().isDisplayed();
	Assert.assertTrue(res,"Popup is not displayed");
	v.getFirstNameTxBx().sendKeys("Virat");
	v.getLastNameTxbx().sendKeys("Kohli");
	v.getEmailTxbx().sendKeys("Virat@18");
	v.getUsernameTxbx().sendKeys("VIRAT");
	v.getPasswordTxbx().sendKeys("Anushka");
	v.getRePasswordTxbx().sendKeys("Anushka");
	v.getFinaCreatedUserBtn().click();
	v.getUserNameSearchBox().sendKeys("Virat");
	String actualName = v.getCreatedUser().getText();
	Assert.assertEquals(actualName, "Virat");
	v.getCreatedUser().click();Thread.sleep(2000);
	v.getUserDeleteBtn().click();Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();Thread.sleep(2000);
	driver.navigate().refresh();Thread.sleep(2000);
	v.getUserNameSearchBox().sendKeys("Virat");Thread.sleep(2000);
	String msg = v.getMessage().getText();		System.out.println(msg);
	
	
}
}
