package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.SearchPage;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    private SearchPage searchPage;
    @Steps
    private HomePage homePage;
    @Test
    public void searchProduct(){
        homePage.open();
        searchPage.tipeInSearch();
        //searchPage.clickSearch();
        //searchPage.setProductList();
    }

}
