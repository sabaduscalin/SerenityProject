package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")
public class CheckoutPage extends PageObject {

    private HomePage homePage;

    @FindBy(css = ".top-link-checkout")
    private WebElementFacade checkoutLink;

    public void clickCheckout() {
        clickOn(checkoutLink);
    }

    @Step
    public void navigateToCheckout() {
        homePage.open();
        homePage.clickAccount();
        homePage.clickLogin();


    }
}
