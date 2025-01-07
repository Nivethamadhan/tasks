package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHotelPage {
	WebDriver driver;

    By location = By.id("location");
    By hotels = By.id("hotels");
    By roomType = By.id("room_type");
    By checkInDate = By.id("checkin_date");
    By checkOutDate = By.id("checkout_date");
    By searchButton = By.id("Submit");

    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLocation(String loc) {
        driver.findElement(location).sendKeys(loc);
    }

    public void selectHotel(String hotel) {
        driver.findElement(hotels).sendKeys(hotel);
    }

    public void selectRoomType(String room) {
        driver.findElement(roomType).sendKeys(room);
    }

    public void setCheckInDate(String date) {
        driver.findElement(checkInDate).sendKeys(date);
    }

    public void setCheckOutDate(String date) {
        driver.findElement(checkOutDate).sendKeys(date);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }

    public void searchHotel(String location, String hotel, String roomType, String checkIn, String checkOut) {
        selectLocation(location);
        selectHotel(hotel);
        selectRoomType(roomType);
        setCheckInDate(checkIn);
        setCheckOutDate(checkOut);
        clickSearch();
    }
}
