package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	  WebDriver driver;

	    // Locators
	    By addContactButton = By.xpath("//button[text()='Add Contact']");
	    By contactNameField = By.id("name");
	    By contactPhoneField = By.id("phone");
	    By contactEmailField = By.id("email");
	    By saveContactButton = By.xpath("//button[text()='Save']");
	    By contactList = By.xpath("//tr[@class='contact-row']");
	    By editButton = By.xpath("//button[text()='Edit']");
	    By deleteButton = By.xpath("//button[text()='Delete']");
	    By contactRow = By.xpath("//tr[contains(@class, 'contact-row')]");

	    // Constructor
	    public ContactPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to add a new contact
	    public void addContact(String name, String phone, String email) {
	        driver.findElement(addContactButton).click();
	        driver.findElement(contactNameField).sendKeys(name);
	        driver.findElement(contactPhoneField).sendKeys(phone);
	        driver.findElement(contactEmailField).sendKeys(email);
	        driver.findElement(saveContactButton).click();
	    }

	    // Method to display contacts (you can use assertions to validate contact display in tests)
	    public int getContactCount() {
	        List<WebElement> contacts = driver.findElements(contactList);
	        return contacts.size();
	    }

	    // Method to edit a contact
	    public void editContact(String newName, String newPhone, String newEmail) {
	        driver.findElement(editButton).click();
	        driver.findElement(contactNameField).clear();
	        driver.findElement(contactNameField).sendKeys(newName);
	        driver.findElement(contactPhoneField).clear();
	        driver.findElement(contactPhoneField).sendKeys(newPhone);
	        driver.findElement(contactEmailField).clear();
	        driver.findElement(contactEmailField).sendKeys(newEmail);
	        driver.findElement(saveContactButton).click();
	    }

	    // Method to delete a contact
	    public void deleteContact() {
	        driver.findElement(deleteButton).click();
	    }
}
