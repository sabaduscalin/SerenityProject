package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseTest {


    @Steps
    private LoginSteps loginSteps;

    @Test
    public void testValidLogin(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials("sabadus.calin@mailinator.com","123456");
        loginSteps.clickLogin();
        loginSteps.checkLoggedIn("Hello, Sabadus Calin!");
    }
}
