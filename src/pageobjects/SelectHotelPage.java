package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectHotelPage {
	WebDriver driver;

    By selectHotelCheckbox = By.id("radiobutton_0");
    By continueButton = By.id("continue");

    public SelectHotelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectHotel() {
        driver.findElement(selectHotelCheckbox).click();
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public void selectHotelAndContinue() {
        selectHotel();
        clickContinueButton();
    }
}
