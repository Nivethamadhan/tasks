package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	 WebDriver driver;

	    // Constructor
	    public LogoutPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Web Elements
	    private By logoutButton = By.id("logout2");

	    // Method to click logout
	    public void logout() {
	        driver.findElement(logoutButton).click();
	    }
}
