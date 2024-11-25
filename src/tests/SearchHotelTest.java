package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.SearchHotelPage;
import utils.DriverFactory;

public class SearchHotelTest {
	  WebDriver driver;
	    LoginPage loginPage;
	    SearchHotelPage searchHotelPage;

	    @BeforeClass
	    public void setup() {
	        driver = DriverFactory.getDriver();
	        loginPage = new LoginPage(driver);
	        searchHotelPage = new SearchHotelPage(driver);
	    }

	    @Test
	    public void testSearchHotel() {
	        driver.get("https://adactinhotelapp.com/");
	        loginPage.login("testUser", "testPassword");
	        searchHotelPage.searchHotel("Sydney", "Hotel Creek", "Double");
	    }
}
