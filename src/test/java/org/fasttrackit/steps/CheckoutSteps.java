package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class CheckoutSteps {
    private HomePage homePage;
    private CheckoutPage checkoutPage;
    private LoginPage loginPage;
    private ProductPage productPage;

    @Step
    public void navogateToLoginPage() {
        homePage.open();
        homePage.clickAccount();
        homePage.clickLogin();
    }

    @Step
    public void setCredentials(String email, String password) {
        loginPage.setEmailField(email);
        loginPage.setPassField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLogin();
    }

    @Step
    public void addProductToCart(){
        productPage.clickSale();
        productPage.clickViewDetails();
        productPage.setColor();
        productPage.setSize();
        productPage.setAddToCart();
    }
    @Step
    public void goToAccount() {
        homePage.clickAccount();
        checkoutPage.clickCheckout();
    }
    @Step
    public void completFeald(){
        checkoutPage.setShipAdres();
        checkoutPage.setContinueButton();
        checkoutPage.setFreeShipp();
        checkoutPage.setContinueLink();
        checkoutPage.setContinuePaimant();
        checkoutPage.setPlaceOrder();


    }

    @Step
    public void setRequiredFeald() {
        checkoutPage.setFirstNameFeald("Sabadus");
        checkoutPage.setLastNameFeald("Calin");
        checkoutPage.setAddress("Arinilor");
        checkoutPage.setCity("Cluj");
        checkoutPage.setSelectState();
        checkoutPage.setZipCode("123456");
        checkoutPage.setCountry();
        checkoutPage.setTelephone("8989898989");
        checkoutPage.setContinueButton();
        checkoutPage.setFreeShipp();
        checkoutPage.setContinueLink();
        checkoutPage.setContinueLink();
        checkoutPage.setContinuePaimant();
        checkoutPage.setPlaceOrder();
    }
        @Step
        public void checkText (String expected) {
        String messege=checkoutPage.getTextPage();
        Assert.assertEquals(messege,expected);

        }
    }
