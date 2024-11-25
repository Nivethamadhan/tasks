package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookHotelPage {
	WebDriver driver;

    By firstNameField = By.id("first_name");
    By lastNameField = By.id("last_name");
    By billingAddressField = By.id("address");
    By creditCardNumberField = By.id("cc_num");
    By creditCardTypeDropDown = By.id("cc_type");
    By creditCardExpMonthDropDown = By.id("cc_exp_month");
    By creditCardExpYearDropDown = By.id("cc_exp_year");
    By bookNowButton = By.id("book_now");

    public BookHotelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterBillingAddress(String billingAddress) {
        driver.findElement(billingAddressField).sendKeys(billingAddress);
    }

    public void enterCreditCardDetails(String creditCardNumber, String cardType, String expMonth, String expYear) {
        driver.findElement(creditCardNumberField).sendKeys(creditCardNumber);
        driver.findElement(creditCardTypeDropDown).sendKeys(cardType);
        driver.findElement(creditCardExpMonthDropDown).sendKeys(expMonth);
        driver.findElement(creditCardExpYearDropDown).sendKeys(expYear);
    }

    public void clickBookNowButton() {
        driver.findElement(bookNowButton).click();
    }

    public void bookHotel(String firstName, String lastName, String billingAddress, String creditCardNumber, String cardType, String expMonth, String expYear) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterBillingAddress(billingAddress);
        enterCreditCardDetails(creditCardNumber, cardType, expMonth, expYear);
        clickBookNowButton();
    }
}
