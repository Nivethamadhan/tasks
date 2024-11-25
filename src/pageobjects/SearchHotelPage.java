package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHotelPage {
	WebDriver driver;

    By locationDropDown = By.id("location");
    By hotelsDropDown = By.id("hotels");
    By roomTypeDropDown = By.id("room_type");
    By searchButton = By.id("search_hotel");

    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLocation(String location) {
        driver.findElement(locationDropDown).sendKeys(location);
    }

    public void selectHotel(String hotel) {
        driver.findElement(hotelsDropDown).sendKeys(hotel);
    }

    public void selectRoomType(String roomType) {
        driver.findElement(roomTypeDropDown).sendKeys(roomType);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void searchHotel(String location, String hotel, String roomType) {
        selectLocation(location);
        selectHotel(hotel);
        selectRoomType(roomType);
        clickSearchButton();
    }
}
