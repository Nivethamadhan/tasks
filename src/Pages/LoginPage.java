package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 WebDriver driver;

	    // Locators
	    By usernameField = By.id("username");
	    By passwordField = By.id("password");
	    By loginButton = By.xpath("//button[text()='Log in']");
	    By logoutButton = By.xpath("//button[text()='Log out']");

	    // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to login
	    public void login(String username, String password) {
	        driver.findElement(usernameField).sendKeys(username);
	        driver.findElement(passwordField).sendKeys(password);
	        driver.findElement(loginButton).click();
	    }

	    // Check if login was successful by checking the presence of the logout button
	    public boolean isLoggedIn() {
	        return driver.findElement(logoutButton).isDisplayed();
	    }

	    // Logout method
	    public void logout() {
	        driver.findElement(logoutButton).click();
	    }
}
