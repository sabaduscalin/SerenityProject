package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class MyWishListPage extends PageObject {
    @FindBy(css = "#header-account > div > ul > li:nth-child(2) > a")
    private WebElementFacade wishListLink;

    public void clickWishList() {
        clickOn(wishListLink);
    }


}
