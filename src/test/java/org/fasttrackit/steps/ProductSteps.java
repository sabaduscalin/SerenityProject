package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class ProductSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductPage productPage;

    @Step
    public void goToHomePage() {
        homePage.open();
        homePage.clickAccount();
        homePage.clickLogin();

    }

    @Step
    public void setLoginPage() {
        loginPage.setEmailField("sabadus.calin@mailinator.com");
        loginPage.setPassField("123456");
        loginPage.clickLogin();
    }


    @Step
    public void clickSale() {
        productPage.clickSale();
    }

    @Step
    public void clickViewDetails() {
        productPage.clickViewDetails();
    }

    @Step
    public void checkmessage(String expected) {
        String message = productPage.getViewMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void selectMandatoryFeald() {
        productPage.setColor();
        productPage.setSize();
    }

    @Step
    public void clickAddToCart() {
        productPage.setAddToCart();
    }
}



