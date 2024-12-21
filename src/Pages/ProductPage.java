package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	 WebDriver driver;

	    // Constructor
	    public ProductPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Web Elements
	    private By addToCartButton = By.xpath("//a[contains(text(),'Add to cart')]");

	    // Methods to interact with elements
	    public void addToCart() {
	        driver.findElement(addToCartButton).click();
	    }
}
