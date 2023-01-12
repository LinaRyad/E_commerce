package pages;

import StepDefintions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class L05_checkout {
    WebDriver driver;

    public L05_checkout() {
        this.driver = Hooks.driver;
    }

    public WebElement termsOfService() {
        return driver.findElement(By.id("termsofservice"));
    }

    public WebElement checkOutButton() {
        return driver.findElement(By.id("checkout"));
    }

    public WebElement firstnameToOrder() {
        return driver.findElement(By.id("BillingNewAddress_FirstName"));
    }

    public WebElement lastnameToOrder() {
        return driver.findElement(By.id("BillingNewAddress_FirstName"));
    }

    public WebElement emailToOrder() {
        return driver.findElement(By.id("BillingNewAddress_Email"));
    }

//    public String CountryToOrder(String value) {
//        Select select=new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
//        select.selectByValue("value");
//        return value;}

    public WebElement CountryToOrder() {
        return driver.findElement(By.id("BillingNewAddress_CountryId"));
    }

    public WebElement CityToOrder() {
        return driver.findElement(By.id("BillingNewAddress_City"));
    }

    public WebElement Address1ToOrder() {
        return driver.findElement(By.id("BillingNewAddress_Address1"));
    }

    public WebElement postalCodeToOrder() {
        return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }

    public WebElement PhoneNumberToOrder() {
        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }

    public WebElement continueButtonBilling() {
        return driver.findElement(By.xpath("//button[@onclick=\"Billing.save()\"]"));
    }

    public WebElement shippingAddress() {
        return driver.findElement(By.id("shippingoption_0"));
    }

    public WebElement continueButtonShippingAddress() {
        return driver.findElement(By.xpath("//button[@onclick=\"ShippingMethod.save()\"]"));
    }


    public WebElement shippingMethod() {
        return driver.findElement(By.id("shippingoption_0"));
    }

    public WebElement continueButtonShippingMethod() {
        return driver.findElement(By.xpath("//button[@onclick=\"PaymentMethod.save()\"]"));
    }

    public WebElement paymentMethod() {
        return driver.findElement(By.id("paymentmethod_0"));
    }

    public WebElement continueButtonPaymentMethod() {
        return driver.findElement(By.xpath("//button[@onclick=\"PaymentInfo.save()\"]"));
    }

    public WebElement paymentInformation() {
        return driver.findElement(By.xpath("//button[@onclick=\"PaymentInfo.save()\"]"));
    }

    public WebElement continueButtonPaymentInformation() {
        return driver.findElement(By.xpath("//button[@onclick=\"ConfirmOrder.save()\"]"));
    }

    public WebElement ConfirmOrder() {
        return driver.findElement(By.xpath("//div[@id=\"confirm-order-buttons-container\"]/button[@onclick=\"ConfirmOrder.save()\"]"));
    }

    public WebElement verificationMsg() {
        return driver.findElement(By.xpath("//div[@class=\"section order-completed\"]//div[@class=\"title\"]"));
    }
}
