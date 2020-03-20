package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchPage;

public class SearchSteps {
    private HomePage homePage;
    private SearchPage searchPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void search() {
        searchPage.clickSearch();
    }


}
