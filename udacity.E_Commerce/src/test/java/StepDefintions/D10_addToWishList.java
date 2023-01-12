package StepDefintions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.L01_homepage;

public class D10_addToWishList {
    L01_homepage homepage= new L01_homepage();


    @When("5_user click on add to wish list")
    public void htcMobileAddToWishListButton() {
        homepage.htcMobileAddToWishListButton().click();
    }

    @Then("6_verification message of wishList appears")
    public void verificationMsg() {
        Assert.assertEquals(homepage.verificationMsgWishList().getText(),"The product has been added to your wishlist");
    }

}
