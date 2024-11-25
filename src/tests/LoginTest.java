package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import utils.DriverFactory;

public class LoginTest {
	WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        driver.get("https://adactinhotelapp.com/index.php");
        loginPage.login("testUser", "testPassword");
    }
}
