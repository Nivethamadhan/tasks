package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookHotelPage {
	WebDriver driver;

    By firstNameField = By.id("first_name");
    By lastNameField = By.id("last_name");
    By billingAddressField = By.id("address");
    By creditCardNoField = By.id("cc_num");
    By creditCardType = By.id("cc_type");
    By expiryMonth = By.id("cc_exp_month");
    By expiryYear = By.id("cc_exp_year");
    By cvvField = By.id("cc_cvv");
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

    public void enterBillingAddress(String address) {
        driver.findElement(billingAddressField).sendKeys(address);
    }

    public void enterCreditCardNo(String cardNo) {
        driver.findElement(creditCardNoField).sendKeys(cardNo);
    }

    public void selectCardType(String cardType) {
        driver.findElement(creditCardType).sendKeys(cardType);
    }

    public void selectExpiryMonth(String month) {
        driver.findElement(expiryMonth).sendKeys(month);
    }

    public void selectExpiryYear(String year) {
        driver.findElement(expiryYear).sendKeys(year);
    }

    public void enterCVV(String cvv) {
        driver.findElement(cvvField).sendKeys(cvv);
    }

    public void clickBookNow() {
        driver.findElement(bookNowButton).click();
    }

    public void bookHotel(String firstName, String lastName, String address, String cardNo, String cardType,
                          String expiryMonth, String expiryYear, String cvv) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterBillingAddress(address);
        enterCreditCardNo(cardNo);
        selectCardType(cardType);
        selectExpiryMonth(expiryMonth);
        selectExpiryYear(expiryYear);
        enterCVV(cvv);
        clickBookNow();
    }
}
