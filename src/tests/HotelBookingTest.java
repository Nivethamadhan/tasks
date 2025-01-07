package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.BookHotelPage;
import pageObjects.LoginPage;
import pageObjects.SearchHotelPage;
import pageObjects.SelectHotelPage;
import utils.excelUtils;

public class HotelBookingTest {
	 WebDriver driver;
	    LoginPage loginPage;
	    SearchHotelPage searchHotelPage;
	    SelectHotelPage selectHotelPage;
	    BookHotelPage bookHotelPage;

	    @BeforeClass
	    public void setUp() {
	        // Set up WebDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("http://adactinhotelapp.com");

	        // Initialize Page Objects
	        loginPage = new LoginPage(driver);
	        searchHotelPage = new SearchHotelPage(driver);
	        selectHotelPage = new SelectHotelPage(driver);
	        bookHotelPage = new BookHotelPage(driver);
	    }

	    @Test(dataProvider = "hotelData")
	    public void testHotelBooking(String username, String password, String location, String hotel, String roomType,
	                                 String checkIn, String checkOut, String firstName, String lastName, String address,
	                                 String cardNo, String cardType, String expMonth, String expYear, String cvv) {
	        // Perform login
	        loginPage.login(username, password);

	        // Perform hotel search
	        searchHotelPage.searchHotel(location, hotel, roomType, checkIn, checkOut);

	        // Select hotel and continue
	        selectHotelPage.selectAndContinue();

	        // Book hotel
	        bookHotelPage.bookHotel(firstName, lastName, address, cardNo, cardType, expMonth, expYear, cvv);
	    }

	    @DataProvider
	    public Object[][] hotelData() {
	        return excelUtils.getExcelData("data/testData.xlsx", "Sheet1");
	    }
}
