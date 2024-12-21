package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Web Elements
    private By signUpButton = By.id("signin2");
    private By loginButton = By.id("login2");
    private By cartButton = By.id("cartur");

    // Methods to interact with elements
    public void clickSignUp() {
        driver.findElement(signUpButton).click();
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void goToCart() {
        driver.findElement(cartButton).click();
    }
}
