package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")
public class CheckoutPage extends PageObject {


    @FindBy(css = ".top-link-checkout")
    private WebElementFacade checkoutLink;

    @FindBy(css = "#billing\\:firstname")
    private WebElementFacade firstNameFeald;
    @FindBy(css = "#billing\\:lastname")
    private WebElementFacade lastNameFeald;
    @FindBy(css = "#billing\\:street1")
    private WebElementFacade address;
    @FindBy(css = "#billing\\:city")
    private WebElementFacade city;
    @FindBy(css = "#billing\\:region_id")
    private WebElementFacade selectState;
    @FindBy(css = "#billing\\:postcode")
    private WebElementFacade zipCode;
    @FindBy(css ="#billing\\:country_id")
    private WebElementFacade country;
    @FindBy(css ="#billing\\:telephone" )
    private WebElementFacade telephone;
    @FindBy(css = "#billing-buttons-container > button > span > span")
    private WebElementFacade continueButton;
    @FindBy(id="s_method_freeshipping_freeshipping")
    private WebElementFacade freeShipp;
    @FindBy(css="#shipping-method-buttons-container > button >span>span")
    private WebElementFacade continueLink;
    @FindBy(css = "#payment-buttons-container > button > span > span")
    private WebElementFacade continuePaimant;
    @FindBy(css = "#review-buttons-container > button > span > span")
    private WebElementFacade placeOrder;
    @FindBy(css = ".col1-layout > div > div > h2")
    private WebElementFacade checkTextParagraph;
    @FindBy(css ="#billing\\:use_for_shipping_yes" )
    private WebElementFacade shipAdres;


    public void setFirstNameFeald(String firstName){
        typeInto(firstNameFeald,firstName);
    }
    public void setLastNameFeald(String lastName){
        typeInto(lastNameFeald,lastName);
    }

    public void setAddress(String myaddress){
        typeInto(address,myaddress);
    }
    public void setCity(String myCity){
        typeInto(city,myCity);
    }
    public void setSelectState(){
        clickOn(selectState);

    }
    public void setZipCode(String myZipCode){
        typeInto(zipCode,myZipCode);
    }
    public void setCountry(){
        clickOn(country);
    }
    public void setTelephone(String myTelephone){
        typeInto(telephone,myTelephone);
    }
    public void setContinueButton(){
        clickOn(continueButton);
    }

    public void clickCheckout() {
        clickOn(checkoutLink);
    }
    public void setFreeShipp(){
        clickOn(freeShipp);
    }
    public void setContinueLink(){
        clickOn(continueLink);
    }
    public void setPlaceOrder(){
        clickOn(placeOrder);
    }
    public void setContinuePaimant(){
        clickOn(continuePaimant);
    }
    public String getTextPage(){return checkTextParagraph.getText();}
    public void setShipAdres(){clickOn(shipAdres);}

    }
