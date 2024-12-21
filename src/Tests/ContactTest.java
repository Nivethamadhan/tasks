package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.ContactPage;
import Pages.LoginPage;
import Pages.SignupPage;

public class ContactTest extends BasePage {

    @Test
    public void testSignup() {
        SignupPage signupPage = new SignupPage(driver);
        signupPage.signUp("testuser", "testpassword");
        Assert.assertTrue(signupPage.isSignupSuccessful(), "Signup failed!");
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "testpassword");
        Assert.assertTrue(loginPage.isLoggedIn(), "Login failed!");
    }

    @Test
    public void testAddContact() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "testpassword");

        ContactPage contactPage = new ContactPage(driver);
        contactPage.addContact("John Doe", "123456789", "john@example.com");

        int contactCount = contactPage.getContactCount();
        Assert.assertTrue(contactCount > 0, "Contact was not added!");
    }

    @Test
    public void testEditContact() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "testpassword");

        ContactPage contactPage = new ContactPage(driver);
        contactPage.addContact("John Doe", "123456789", "john@example.com");
        contactPage.editContact("John Smith", "987654321", "john.smith@example.com");

        int contactCount = contactPage.getContactCount();
        Assert.assertTrue(contactCount > 0, "Contact was not edited!");
    }

    @Test
    public void testDeleteContact() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "testpassword");

        ContactPage contactPage = new ContactPage(driver);
        contactPage.addContact("John Doe", "123456789", "john@example.com");
        contactPage.deleteContact();

        int contactCount = contactPage.getContactCount();
        Assert.assertTrue(contactCount == 0, "Contact was not deleted!");
    }

    @Test
    public void testLogout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "testpassword");
        Assert.assertTrue(loginPage.isLoggedIn(), "Login failed!");
        loginPage.logout();
    }
}
