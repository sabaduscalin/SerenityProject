package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyWishListPage;
import org.junit.Assert;

public class MyWishListSteps {

    private HomePage homePage;
    private MyWishListPage myWishListPage;
    private LoginPage loginPage;

    @Step
    public void navigateHomePage() {
        homePage.open();
        homePage.clickAccount();
        homePage.clickLogin();
    }

    @Step
    public void setCredentials(String email, String password) {
        loginPage.setEmailField(email);
        loginPage.setPassField(password);
        loginPage.clickLogin();
    }


    @Step
    public void navigateToAcount() {
        homePage.clickAccount();
    }

    @Step
    public void navigateToWishList() {
        myWishListPage.clickWishList();
    }
    @Step
    public void navigateToProduct(){
        myWishListPage.clickProduct();
    }
    @Step
    public void  checkProductName(String expected){
        String message=myWishListPage.getProductName();
        Assert.assertEquals(message,expected);
    }

}



