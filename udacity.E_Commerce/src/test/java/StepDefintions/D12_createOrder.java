package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.L01_homepage;
import pages.L05_checkout;

public class D12_createOrder {
    L01_homepage homepage=new L01_homepage();
    L05_checkout checkout=new L05_checkout();


    @And("7-user click on shopping cart")
    public void shoppingCart() {
        homepage.shoppingCartLocator().click();
    }

    @And("8_user click on terms of service")
    public void termOofService() {
        checkout.termsOfService().click();
    }

    @And("9_user click on checkOutButton")
    public void checkOutButton() {
        checkout.checkOutButton().click();
    }

    @And("10_user enter first name")
    public void firstName() {
        checkout.firstnameToOrder().sendKeys("tester");
    }


    @And("11_user enter last name")
    public void lastName() {
        checkout.lastnameToOrder().sendKeys("automation");
    }


    @And("12_user enter email")
    public void emailToOrder() {
        checkout.emailToOrder().sendKeys("tester@example.com");
    }

//    @And("13_user enter CountryToOrder")
//    public void CountryToOrder() {
//        Select selectCountry=new Select(checkout.CountryToOrder());
//        selectCountry.selectByValue("123");
//    }

    @And("13_user enter CountryToOrder")
    public void CountryToOrder() {
        Select selectCountry=new Select(checkout.CountryToOrder());
        selectCountry.selectByValue("123");
    }

    @And("14_user enter CityToOrder")
    public void CityToOrder() {
        checkout.CityToOrder().sendKeys("fayoum");
    }

    @And("15_user enter Address1ToOrder")
    public void Address1ToOrder() {
        checkout.Address1ToOrder().sendKeys("masala");
    }

    @And("16_user enter postalCodeToOrder")
    public void postalCodeToOrder() {
        checkout.postalCodeToOrder().sendKeys("15368");
    }


    @And("17_user enter PhoneNumberToOrder")
    public void PhoneNumberToOrder() {
        checkout.PhoneNumberToOrder().sendKeys("0109985");
    }

//    @And("17_filling billing address")
//    public void billingAddress() {
//    try {checkout.CountryToOrder("123");
//        checkout.CityToOrder().sendKeys("fayoum");
//        checkout.Address1ToOrder().sendKeys("masala");
//        checkout.postalCodeToOrder().sendKeys("15368");
//        checkout.PhoneNumberToOrder().sendKeys("0109985");
//    } catch (Exception e) {
//        checkout.continueButtonBilling().click();
//    }
//    }

    @And("18_user enter continueButtonBilling")
    public void continueButtonBilling() {
        checkout.continueButtonBilling().click();
    }

    @And("19_user enter shippingAddress")
    public void shippingAddress() {
        checkout.shippingAddress().click();
    }

    @And("20_user enter continueButtonShipping")
    public void continueButtonShippingAddress() {
        checkout.continueButtonShippingAddress().click();
    }

    @And("21_user enter shippingMethod")
    public void shippingMethod() {
        checkout.shippingMethod().click();
    }

    @And("22_user enter continueButtonShippingMethod")
    public void continueButtonShippingMethod() {
        checkout.continueButtonShippingMethod().click();
    }

    @And("23_user enter paymentMethod")
    public void paymentMethod() {
        checkout.paymentMethod().click();
    }

    @And("24_user enter continueButtonPaymentMethod")
    public void continueButtonPaymentMethod() {
        checkout.continueButtonPaymentMethod().click();
    }

    @And("25_user enter paymentInformation")
    public void paymentInformation() {
        checkout.paymentInformation().click();
    }

    @And("26_user enter continueButtonPaymentInformation")
    public void continueButtonPaymentInformation() {
        checkout.continueButtonPaymentInformation().click();
    }

    @And("27_user enter ConfirmOrder")
    public void ConfirmOrder() {
        checkout.ConfirmOrder().click();
    }

    @Then("28_verification message appears")
    public void verificationMsg() {
        Assert.assertEquals(checkout.verificationMsg().getText(),"Your order has been successfully processed!");
    }


}
