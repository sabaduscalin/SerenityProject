package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends PageObject {
    @FindBy(id = "search")
    private WebElementFacade searchFeaild;
    @FindBy(css=" first last odd")
    private List<WebElementFacade> productList;
@FindBy(css="button search-button")
private WebElementFacade searchclick;


    public void tipeInSearch() {
        typeInto(searchFeaild, "necklace");
    }
    public void setProductList(){
        clickOn((WebElement) productList);
    }

    public void clickSearch(){
clickOn(searchclick);
    }

}