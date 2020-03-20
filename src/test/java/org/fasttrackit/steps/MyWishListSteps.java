package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyWishListPage;

public class MyWishListSteps {

    private HomePage homePage;
    private MyWishListPage myWishListPage;

    @Step
    public void navigateToWishlistPage() {
        homePage.open();
        homePage.clickAccount();
        homePage.clickLogin();
        myWishListPage.clickWishList();
    }
}


