package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	WebDriver driver;

    // Locators
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By signupButton = By.xpath("//button[text()='Sign up']");
    By successMessage = By.xpath("//div[@class='alert alert-success']");

    // Constructor
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to sign up
    public void signUp(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(signupButton).click();
    }

    // Check if the signup was successful
    public boolean isSignupSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }
}
