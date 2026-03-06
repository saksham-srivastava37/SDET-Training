package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTest;
import pages.*;

public class OrderTest extends baseTest {

    @Test
    public void completeOrderTest() throws InterruptedException {

        LoginPage login = new LoginPage(driver);

        login.enterUsername("standard_user")
             .enterPassword("secret_sauce")
             .clickLogin();
        
//        Thread.sleep(5000);


        HomePage home = new HomePage(driver);

        home.addProductToCart("Sauce Labs Backpack")
            .goToCart();

        CartPage cart = new CartPage(driver);
        cart.clickCheckout();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.enterDetails()
                .finishOrder();

        ConfirmationPage confirm = new ConfirmationPage(driver);

        Assert.assertEquals(confirm.getConfirmationMessage(),
                "Thank you for your order!");
    }
}