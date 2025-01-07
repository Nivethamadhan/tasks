package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectHotelPage {
	WebDriver driver;

    By selectHotelRadioButton = By.id("radiobutton_0");
    By continueButton = By.id("continue");

    public SelectHotelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectHotel() {
        driver.findElement(selectHotelRadioButton).click();
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void selectAndContinue() {
        selectHotel();
        clickContinue();
    }
}

