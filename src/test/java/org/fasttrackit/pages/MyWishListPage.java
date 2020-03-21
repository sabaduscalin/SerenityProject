package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class MyWishListPage extends PageObject {


    @FindBy(css = "a[title='My Wishlist (1 item)']")
    private WebElementFacade wishListLink;
    @FindBy(css = "h3>a[title='Park Row Throw']")
    private WebElementFacade productLink;
    @FindBy(css ="div.product-name > span" )
    private WebElementFacade productName;

    public void clickProduct() {
        clickOn(productLink);
    }

    public void clickWishList() {
        clickOn(wishListLink);
    }
    public String getProductName(){return productName.getText();}



}
