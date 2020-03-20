package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")
public class CartPage extends PageObject {
    @FindBy(css="#header > div > div.skip-links > div > div > a > span.label")
    private WebElementFacade cartButton;
    @FindBy(css="#header-cart > div.minicart-wrapper > div.minicart-actions > a")
    private WebElementFacade shopingCartButton;

    public void clickCart(){
        clickOn(cartButton);
    }
    public void clickShopingCart(){
        clickOn(shopingCartButton);
    }

}
