package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.L01_homepage;
import pages.L03_login;
import pages.L04_resetpassward;
import org.testng.Assert;

public class D03_resetPassword {
    L01_homepage homepage= new L01_homepage();
    L03_login login= new L03_login();
    L04_resetpassward resetpassward= new L04_resetpassward();


    @And("2_user click on forget-password")
    public void login() {
        login.forgetPassword().click();
    }

    @And("3_user enter valid email")
    public void yourEmailAddress() {
        resetpassward.YourEmailAddress().sendKeys("tester@example.com");
    }

    @When("4_user click on recovery-button")
    public void recoverButton() {
        resetpassward.recoverButton().click();
    }


    @Then("5_confirmation message appears")
    public void validateConfirmationMessage() {
        Assert.assertEquals(resetpassward.getConfirmationMessage(),"Email with instructions has been sent to you.");

    }



}
