package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;

public class CheckoutSteps {
    private HomePage homePage;
    private CheckoutPage checkoutPage;
    @Step
    public void clickCheckout(){
        homePage.open();
        homePage.clickAccount();
       checkoutPage.clickCheckout();
    }
}
