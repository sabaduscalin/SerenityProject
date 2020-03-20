package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class CartTest extends BaseTest {

    @Steps
    CartSteps cartSteps;
    @Test
    public void navigateToCart(){
        cartSteps.navigateToLoginPage();
        cartSteps.setCredentials("sabadus.calin@mailinator.com","123456");
        cartSteps.clickLogin();
        cartSteps.clickCart();
        cartSteps.clickShoppingCart();
    }
}
