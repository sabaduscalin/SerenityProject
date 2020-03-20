package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;

public class CartSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private CartPage cartPage;

    @Step
    public void navigateToLoginPage() {
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
    public void clickCart() {
        cartPage.clickCart();
    }
    @Step
    public void clickShoppingCart(){
        cartPage.clickShopingCart();
    }
}
