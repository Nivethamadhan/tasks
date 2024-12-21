package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Cartpage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.ProductPage;
import Pages.SignUpPage;
import utils.BaseTest;

public class TestScripts extends BaseTest {

    @Test
    public void testSignUpLoginProductCartLogout() {
        // Initialize Page Objects
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        Cartpage cartPage = new Cartpage(driver);
        LogoutPage logoutPage = new LogoutPage(driver);

        // Sign Up
        homePage.clickSignUp();
        signUpPage.enterUsername("testuser");
        signUpPage.enterPassword("password123");
        signUpPage.clickSignUpButton();

        // Login
        homePage.clickLogin();
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
        loginPage.clickLoginButton();

        // Add Product to Cart
        productPage.addToCart();

        // Go to Cart and verify the product is added
        homePage.goToCart();
        String cartItems = cartPage.getCartItems();
        Assert.assertTrue(cartItems.contains("Samsung galaxy s6"), "Product not found in cart");

        // Logout
        logoutPage.logout();
    }
}