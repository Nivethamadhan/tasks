package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartpage {
	   WebDriver driver;

	    // Constructor
	    public Cartpage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Web Elements
	    private By cartItemsTable = By.xpath("//table[@class='table table-bordered table-striped']//tbody");

	    // Methods to interact with elements
	    public String getCartItems() {
	        return driver.findElement(cartItemsTable).getText();
	    }
}
