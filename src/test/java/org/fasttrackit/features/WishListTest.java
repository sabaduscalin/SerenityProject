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
    private MyWishListSteps myWishListSteps;

    @Test
    public void addToWishList() {
        myWishListSteps.navigateHomePage();
        myWishListSteps.setCredentials("sabadus.calin@mailinator.com","123456");
        myWishListSteps.navigateToAcount();
        myWishListSteps.navigateToWishList();
        myWishListSteps.navigateToProduct();
        myWishListSteps.checkProductName("PARK ROW THROW");



    }

}
