package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class ProductPage extends PageObject {

    @FindBy(css = ".nav-5.parent > a")
    private WebElementFacade saleButton;

    @FindBy(css = "li:nth-child(1) > div > div.actions > a")
    private WebElementFacade viewDetailsButton;
    @FindBy(css = " div.product-name > span")
    private WebElementFacade viewMessage;

    public String getViewMessage() {
    return viewMessage.getText();
    }

    public void clickViewDetails() {
        clickOn(viewDetailsButton);
    }

    public void clickSale() {
        clickOn(saleButton);
    }
}
