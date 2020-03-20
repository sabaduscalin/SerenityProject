package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.MyWishListSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class WishListTest extends BaseTest {

    @Steps
    private HomePage homePage;
    @Steps
    private MyWishListSteps myWishListSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void addToWishList() {
        loginSteps.login("sabadus.calin@mailinator.com", "123456", "Hello, Sabadus Calin!");
        homePage.clickAccount();
        myWishListSteps.navigateToWishlistPage();

    }

}
