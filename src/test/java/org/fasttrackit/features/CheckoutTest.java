package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class CheckoutTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CheckoutSteps checkoutSteps;



    @Test
    public void tryToCheckout(){
        checkoutSteps.navogateToLoginPage();
        checkoutSteps.setCredentials("sabadus.calin@mailinator.com", "123456");
        checkoutSteps.clickLogin();
        checkoutSteps.addProductToCart();
        checkoutSteps.goToAccount();
        checkoutSteps.completFeald();
        checkoutSteps.checkText("THANK YOU FOR YOUR PURCHASE!");
    }


}
