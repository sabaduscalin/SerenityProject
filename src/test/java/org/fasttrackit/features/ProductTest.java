package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class ProductTest extends BaseTest {


    @Steps
    private ProductSteps productSteps;

    @Test
    public void selectSaleProduct(){
        productSteps.goToHomePage();
        productSteps.setLoginPage();
        productSteps.clickSale();
        productSteps.clickViewDetails();
        productSteps.checkmessage("RACER BACK MAXI DRESS");
        productSteps.selectMandatoryFeald();
        productSteps.clickAddToCart();

    }
}
